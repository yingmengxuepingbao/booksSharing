package com.zyx.books.controller;


import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zyx.books.model.Authentication;
import com.zyx.books.model.Shops;
import com.zyx.books.service.ShopsService;

/**
 * <p>
 * 店铺表 前端控制器
 * </p>
 *
 * @author yixin123
 * @since 2019-10-09
 */
@Controller
@RequestMapping("/shops")
public class ShopsController {

	@Autowired
	private ShopsService shopsService;
	
	
	/**
	 * 添加店铺信息
	 * @param shops 店铺信息
	 * @return
	 */
	@RequestMapping(value = "/addShops", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> addShops(@Valid @RequestBody Shops shops
			,Authentication authentication){
		System.out.println(authentication.getUserNumber() + "---"+authentication.getUserName());
		boolean returnFlag= shopsService.addShops(shops,authentication);
		Map<String,Object> returnMap =new HashMap<String,Object>();
		if(returnFlag) {
			returnMap.put("result", "sussess");
		}
		return returnMap;
	}
}

