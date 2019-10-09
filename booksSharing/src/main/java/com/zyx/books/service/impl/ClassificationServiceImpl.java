package com.zyx.books.service.impl;

import com.zyx.books.model.Classification;
import com.zyx.books.mapper.ClassificationMapper;
import com.zyx.books.service.ClassificationService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 童书分类 服务实现类
 * </p>
 *
 * @author yixin123
 * @since 2019-10-09
 */
@Service
public class ClassificationServiceImpl extends ServiceImpl<ClassificationMapper, Classification> implements ClassificationService {

}
