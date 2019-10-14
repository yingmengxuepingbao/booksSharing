package com.zyx.books.service;

import com.baomidou.mybatisplus.service.IService;
import com.zyx.books.model.Shops;

/**
 * <p>
 * 店铺表 服务类
 * </p>
 *
 * @author yixin123
 * @since 2019-10-09
 */
public interface ShopsService extends IService<Shops> {
	/**
	 * 添加店铺信息
	 * @param shops 店铺信息
	 * @return
	 */
	public int addShops(Shops shops);
}
