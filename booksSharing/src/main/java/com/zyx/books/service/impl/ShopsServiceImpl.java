package com.zyx.books.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zyx.books.mapper.AuthenticationMapper;
import com.zyx.books.mapper.ShopsMapper;
import com.zyx.books.model.Authentication;
import com.zyx.books.model.Shops;
import com.zyx.books.model.ShopsPicturesMongo;
import com.zyx.books.service.ShopsService;

/**
 * <p>
 * 店铺表 服务实现类
 * </p>
 *
 * @author yixin123
 * @since 2019-10-09
 */
@Service
public class ShopsServiceImpl extends ServiceImpl<ShopsMapper, Shops> implements ShopsService {

	@Autowired
	private ShopsMapper shopsMapper;
	@Autowired
	private AuthenticationMapper authenticationMapper;
	@Autowired
	private MongoTemplate mongotemplate;//用于操作数据库
	/**
	 * 添加店铺信息
	 * @param shops 店铺信息
	 * @param authentication 认证信息
	 * @return
	 */
	@Transactional  //注解事务
	@Override
	public boolean addShops(Shops shops,Authentication authentication) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		String id =  shopsMapper.getUUID();//UUID
		shops.setShopId(id);//给店铺id赋值
		shops.setShopLogo(id);//shopLogo 存放mongoDB中id
		shops.setAuthenticationId(id);//认证编码
		shops.setShopSetupTime(df.format(new Date()));
		shops.setShopUpdateTime(df.format(new Date()));
		authentication.setAuthenticationId(id);
		authentication.setAuthenticationMethod(shops.getAuthenticationMethod());
		authentication.setPicSepupTime(df.format(new Date()));//创建时间
		authentication.setPicUpdateTime(df.format(new Date()));//创建时间
		
		//保存照片到mongoDB中
		savePicturesMongo(shops, authentication);
		//添加身份认证
		authenticationMapper.addAuthentication(authentication);
		//添加店铺
		shopsMapper.addShops(shops);
		return true;
	}
	/**
	 * 保存照片到mongoDB中
	 * @param shops 店铺实体
	 * @param id UUID
	 */
	private void savePicturesMongo(Shops shops,Authentication authentication) {
		ShopsPicturesMongo shopsPicturesMongo =new ShopsPicturesMongo();//图片实体类
		shopsPicturesMongo.setPicId(shops.getShopId());//图片id
		shopsPicturesMongo.setPicContent(shops.getShopLogo());//图片内容
		shopsPicturesMongo.setPicSort(2);//图片分类：0：轮播图；1：详情图片；2：商铺logo
		shopsPicturesMongo.setPicZheng(authentication.getPicZheng());
		shopsPicturesMongo.setPicFan(authentication.getPicFan());
		shopsPicturesMongo.setPicRen(authentication.getPicRen());
		shopsPicturesMongo.setBusinessLicense(authentication.getBusinessLicense());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		shopsPicturesMongo.setSetupTime(df.format(new Date()));//创建时间
		mongotemplate.save(shopsPicturesMongo);//保存图片
	}

	/*
	 * Query query=new Query(Criteria.where("name").is(name)); MongoTest mgt =
	 * mongoTemplate.findOne(query , MongoTest.class);
	 * 
	 * 
	 * Query query=new Query(Criteria.where("id").is(test.getId())); Update update=
	 * new Update().set("age", test.getAge()).set("name", test.getName());
	 * //更新查询返回结果集的第一条 mongoTemplate.updateFirst(query,update,MongoTest.class);
	 * //更新查询返回结果集的所有 // mongoTemplate.updateMulti(query,update,TestEntity.class);
	 * 
	 * 
	 * Query query=new Query(Criteria.where("id").is(id));
	 * mongoTemplate.remove(query,MongoTest.class);
	 */

}
