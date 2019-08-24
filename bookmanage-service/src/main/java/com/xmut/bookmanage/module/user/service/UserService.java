package com.xmut.bookmanage.module.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xmut.bookmanage.module.user.entity.User;

/*
 * @Description: UserService接口
 * @Author: whf
 * @Date: 2019/8/24
 */
public interface UserService extends IService<User> {

    User findByUsername(String username);

    User findByUsernameAndPassword(String username, String password);
}
