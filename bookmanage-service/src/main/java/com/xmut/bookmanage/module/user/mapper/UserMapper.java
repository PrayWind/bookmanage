package com.xmut.bookmanage.module.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xmut.bookmanage.module.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    @Select("select * from t_user where username = #{value}")
    User findUserByUsername(String username);

    @Select("select * from t_user where username=#{username} and password=#{password}")
    User findUserByUsernameAndPassword(String username, String password);
}
