package com.zyx.books.mapper;

import com.zyx.books.model.Shops;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 * 店铺表 Mapper 接口
 * </p>
 *
 * @author yixin123
 * @since 2019-10-09
 */
public interface ShopsMapper extends BaseMapper<Shops> {
	/**
	 * 获取UUID
	 * @return
	 */
	public String getUUID();

	/**
	 * 添加店铺信息
	 * @param shops 店铺信息
	 * @return
	 */
	public int addShops(Shops shops);
	
	public List<Shops> selShops();
}
