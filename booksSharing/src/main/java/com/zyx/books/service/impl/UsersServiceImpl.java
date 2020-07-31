package com.zyx.books.service.impl;

import com.zyx.books.model.Users;
import com.zyx.books.mapper.UsersMapper;
import com.zyx.books.service.UsersService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author yixin123
 * @since 2019-10-09
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

	@Autowired
	private UsersMapper usersMapper;
	/**
	 * 登录校验
	 * @return
	 */
	@Override
	public Users LoginVerification(Users users) {
		Users usersDetails=usersMapper.selUser(users);
		if((usersDetails.getuName()!=null&&!("").equals(usersDetails.getuName())) || (usersDetails.getuWxId()!=null) ||(usersDetails.getuQqId()!=null)) {
			return usersDetails;
		}else {
			return null;
		}
	}

}
