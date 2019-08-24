package com.xmut.bookmanage.module.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xmut.bookmanage.module.user.entity.User;
import com.xmut.bookmanage.module.user.mapper.UserMapper;
import com.xmut.bookmanage.module.user.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @description: UserService接口实现类
 * @author: whf
 * @date: 2019-8-24 16:10:08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public User findByUsername(String username) {
        return baseMapper.findUserByUsername(username);
    }

    @Override
    public User findByUsernameAndPassword(String username, String password) {
        return baseMapper.findUserByUsernameAndPassword(username, password);
    }
}
