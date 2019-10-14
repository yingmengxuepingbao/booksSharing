package com.zyx.books.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zyx.books.mapper.ShopsMapper;
import com.zyx.books.model.PicturesMongo;
import com.zyx.books.model.Shops;
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
	private MongoTemplate mongotemplate;//用于操作数据库
	/**
	 * 添加店铺信息
	 * @param shops 店铺信息
	 * @return
	 */
	@Override
	public int addShops(Shops shops) {
		String id =  shopsMapper.getUUID();
		savePicturesMongo(shops, id);//保存照片到mongoDB中
		shops.setShopId(id);//给店铺id赋值
		shops.setShopLogo(id);//shopLogo 存放mongoDB中id
		return shopsMapper.addShops(shops);
	}
	/**
	 * 保存照片到mongoDB中
	 * @param shops 店铺实体
	 * @param id UUID
	 */
	private void savePicturesMongo(Shops shops, String id) {
		PicturesMongo picturesMongo =new PicturesMongo();//图片实体类
		picturesMongo.setPicId(id);//图片id
		picturesMongo.setPicContent(shops.getShopLogo());//图片内容
		picturesMongo.setPicSort(2);//图片分类：0：轮播图；1：详情图片；2：商铺logo
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
		picturesMongo.setSetupTime(df.format(new Date()));//创建时间
		mongotemplate.save(picturesMongo);//保存图片
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
