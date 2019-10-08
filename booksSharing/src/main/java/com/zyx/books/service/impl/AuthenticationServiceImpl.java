package com.zyx.books.service.impl;

import com.zyx.books.model.Authentication;
import com.zyx.books.mapper.AuthenticationMapper;
import com.zyx.books.service.AuthenticationService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 身份认证表 服务实现类
 * </p>
 *
 * @author yixin123
 * @since 2019-10-08
 */
@Service
public class AuthenticationServiceImpl extends ServiceImpl<AuthenticationMapper, Authentication> implements AuthenticationService {

}
