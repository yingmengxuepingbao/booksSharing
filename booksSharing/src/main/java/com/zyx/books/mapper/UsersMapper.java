package com.zyx.books.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zyx.books.model.Users;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author yixin123
 * @since 2019-10-09
 */
public interface UsersMapper extends BaseMapper<Users> {

	/**
	 * 查询用户信息
	 * @return
	 */
	public Users selUser(Users users);
}
