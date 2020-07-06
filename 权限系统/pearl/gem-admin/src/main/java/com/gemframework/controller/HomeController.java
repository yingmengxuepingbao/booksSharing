/**
 * 严肃声明：
 * 开源版本请务必保留此注释头信息，若删除gemframe官方保留所有法律责任追究！
 * 本软件受国家版权局知识产权以及国家计算机软件著作权保护（登记号：2018SR503328）
 * 不得恶意分享产品源代码、二次转售等，违者必究。
 * Copyright (c) 2020 gemframework all rights reserved.
 * http://www.gemframework.com
 * 版权所有，侵权必究！
 */
package com.gemframework.controller;

import com.alibaba.fastjson.JSONArray;
import com.gemframework.common.security.configure.GemSecurityProperties;
import com.gemframework.common.security.handler.GemLoginSuccessHandler;
import com.gemframework.model.BaseResultData;
import com.gemframework.common.enums.MenuType;
import com.gemframework.model.vo.MenuVo;
import com.gemframework.model.vo.tree.MenuSide;
import com.gemframework.service.MenuService;
import com.gemframework.service.RoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

import static com.gemframework.common.constant.GemConstant.Auth.ROLE_PREFIX;

/**
 * @Title: IndexController.java
 * @Package: com.gemframework.gembasic.controller
 * @Date: 2019/11/28 18:03
 * @Version: v1.0
 * @Description: 页面控制器
 * @Author: zhangysh
 * @Copyright: Copyright (c) 2019 GemStudio
 * @Company: www.gemframework.com
 */

@Slf4j
@Controller
@RequestMapping("home")
public class HomeController {


    @Resource
    private MenuService menuService;
    @Resource
    private RoleService roleService;

    @Autowired
    private GemSecurityProperties gemSecurityProperties;


    /***
     * 加载全部用户的左侧菜单栏MenuSide
     * @return
     */
    @GetMapping("/initAllMenus")
    @ResponseBody
    public BaseResultData initAllMenus(HttpServletRequest request){
        List<MenuVo> menus = menuService.findListAllByType(MenuType.MENU);
        List<MenuSide> menuSides = new ArrayList<>();
        for(MenuVo menuVo:menus){
            MenuSide menuSide = MenuSide.builder()
                    .F_ModuleId(String.valueOf(menuVo.getId()))
                    .F_ParentId(String.valueOf(menuVo.getPid()))
                    .F_EnCode(menuVo.getTag())
                    .F_FullName(menuVo.getName())
                    .F_Icon(menuVo.getIcon())
                    .F_UrlAddress(menuVo.getLink()).build();
            menuSides.add(menuSide);
        }
        request.getSession().setAttribute("session_sidebar_menus", menuSides);
        return BaseResultData.SUCCESS(menuSides);
    }

    /***
     * 加载当前权限用户的左侧菜单栏MenuSide
     * @param request
     * @return
     */
    @GetMapping("/initMenus")
    @ResponseBody
    public BaseResultData initMenus(HttpServletRequest request){
        //开启了权限验证 从session获取菜单信息
        if(gemSecurityProperties.isOpen()){
            List<MenuSide> menuSides = (List<MenuSide>) request.getSession().getAttribute("session_sidebar_menus");
            return BaseResultData.SUCCESS(menuSides);
        }else {
            //没开启需要添加默认菜单+数据库查询
            String menusData_def = "[\n" +
                    "                {\n" +
                    "                        \"f_ModuleId\": \"111\",\n" +
                    "                        \"f_ParentId\": \"0\",\n" +
                    "                        \"f_EnCode\": \"SysManage\",\n" +
                    "                        \"f_FullName\": \"系统默认\",\n" +
                    "                        \"f_Icon\": \"fa fa-desktop\",\n" +
                    "                        \"f_UrlAddress\": \"/default\",\n" +
                    "                },\n" +
                    "                {\n" +
                    "                        \"f_ModuleId\": \"21\",\n" +
                    "                        \"f_ParentId\": \"111\",\n" +
                    "                        \"f_EnCode\": \"MenuManage\",\n" +
                    "                        \"f_FullName\": \"菜单管理\",\n" +
                    "                        \"f_Icon\": \"fa fa-sitemap\",\n" +
                    "                        \"f_UrlAddress\": \"menu/list.html\",\n" +
                    "                } ]";


            List<MenuSide> defMenuSides = JSONArray.parseArray(menusData_def, MenuSide.class);
            //添加默认菜单
            List<MenuSide> menuSides = new ArrayList<>();
            menuSides.addAll(defMenuSides);
            List<MenuVo> menus = menuService.findListAllByType(MenuType.MENU);
            if(menus!=null && menus.size()>0){
                for(MenuVo menuVo:menus){
                    MenuSide menuSide = MenuSide.builder()
                            .F_ModuleId(String.valueOf(menuVo.getId()))
                            .F_ParentId(String.valueOf(menuVo.getPid()))
                            .F_EnCode(menuVo.getTag())
                            .F_FullName(menuVo.getName())
                            .F_Icon(menuVo.getIcon())
                            .F_UrlAddress(menuVo.getLink()).build();
                    menuSides.add(menuSide);
                }
            }
            return BaseResultData.SUCCESS(menuSides);
        }
    }

    /***
     * 重置左侧菜单
     * @return
     */
    @GetMapping("/resetSideMenus")
    @ResponseBody
    public BaseResultData resetLeftMenus(HttpServletRequest request){
        GemLoginSuccessHandler.initSessionSideMenus(request,roleService,menuService);
        return BaseResultData.SUCCESS();
    }


    @GetMapping("")
    public String home(){
        return "home";
    }

    @GetMapping("userInfo")
    public String user(){
        return "home/user";
    }
}
