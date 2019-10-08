package com.zyx.books.service.impl;

import com.zyx.books.model.Pictures;
import com.zyx.books.mapper.PicturesMapper;
import com.zyx.books.service.PicturesService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 图片表：童书中的图片 服务实现类
 * </p>
 *
 * @author yixin123
 * @since 2019-10-08
 */
@Service
public class PicturesServiceImpl extends ServiceImpl<PicturesMapper, Pictures> implements PicturesService {

}
