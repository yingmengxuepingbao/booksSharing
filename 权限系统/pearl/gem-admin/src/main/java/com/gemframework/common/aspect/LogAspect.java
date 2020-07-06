/**
 * 严肃声明：
 * 开源版本请务必保留此注释头信息，若删除gemframe官方保留所有法律责任追究！
 * 本软件受国家版权局知识产权以及国家计算机软件著作权保护（登记号：2018SR503328）
 * 不得恶意分享产品源代码、二次转售等，违者必究。
 * Copyright (c) 2020 gemframework all rights reserved.
 * http://www.gemframework.com
 * 版权所有，侵权必究！
 */
package com.gemframework.common.aspect;

import com.gemframework.common.enums.OperateType;
import com.gemframework.model.po.SysLog;
import com.gemframework.model.vo.SysLogVo;
import com.gemframework.service.SysLogService;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Component  //声明组件
@Aspect //  声明切面
@ComponentScan  //组件自动扫描
@EnableAspectJAutoProxy //spring自动切换JDK动态代理和CGLIB
@Slf4j
public class LogAspect {

    @Resource
    private HttpServletRequest request;
    @Resource
    private SysLogService sysLogService;

    /**
     * 在方法执行前进行切面
     */
    @Pointcut("execution(* com.gemframework.controller..*.*(..))" +
            "&& (@annotation(org.springframework.web.bind.annotation.GetMapping)" +
            "||@annotation(org.springframework.web.bind.annotation.PutMapping)" +
            "||@annotation(org.springframework.web.bind.annotation.DeleteMapping)" +
            "||@annotation(org.springframework.web.bind.annotation.PostMapping)" +
            "||@annotation(org.springframework.web.bind.annotation.RequestMapping))")
    public void log() {
    }

    @Before("log()")
    public void before(JoinPoint point) {
//        log.info("---------------------请求开始---------------------");
//        String username = "";
//        if(request.getSession().getAttribute("session_username") != null){
//            username = (String) request.getSession().getAttribute("session_username");
//        }
//        log.info("登录用户:"+username);
//        log.info("用户IP:"+getIpAddress(request));
//        log.info("请求地址:"+request.getRequestURL().toString());
//        log.info("请求方式:"+request.getMethod());
//        log.info("请求类方法:"+point.getSignature());
//        log.info("请求类方法参数:"+ Arrays.toString(point.getArgs()));
//        log.info("-------------------------------------------------");

    }
}