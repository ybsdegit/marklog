package com.ybs.marklog.service.impl;

import com.ybs.marklog.entity.Blog;
import com.ybs.marklog.mapper.BlogMapper;
import com.ybs.marklog.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 关注公众号：MarkerHub
 * @since 2020-05-31
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
