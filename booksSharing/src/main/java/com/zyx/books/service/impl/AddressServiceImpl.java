package com.zyx.books.service.impl;

import com.zyx.books.model.Address;
import com.zyx.books.mapper.AddressMapper;
import com.zyx.books.service.AddressService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 地址表 服务实现类
 * </p>
 *
 * @author yixin123
 * @since 2019-10-08
 */
@Service
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements AddressService {

}
