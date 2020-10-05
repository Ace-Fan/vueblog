package com.wufan.vueblog.service.impl;

import com.wufan.vueblog.entity.User;
import com.wufan.vueblog.mapper.UserMapper;
import com.wufan.vueblog.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
