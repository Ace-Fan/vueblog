package com.wufan.vueblog.service.impl;

import com.wufan.vueblog.entity.Blog;
import com.wufan.vueblog.mapper.BlogMapper;
import com.wufan.vueblog.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wufan
 * @since 2020-09-20
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
