package com.zyx.books.mapper;

import com.zyx.books.model.Authentication;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 * 身份认证表 Mapper 接口
 * </p>
 *
 * @author yixin123
 * @since 2019-10-16
 */
public interface AuthenticationMapper extends BaseMapper<Authentication> {

	/**
	 * 添加身份认证
	 * @param authentication 身份认证实体
	 * @return
	 */
	public int addAuthentication(Authentication authentication);
}
