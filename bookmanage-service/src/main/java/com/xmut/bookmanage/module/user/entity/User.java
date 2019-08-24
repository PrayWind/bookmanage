package com.xmut.bookmanage.module.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @description: 用户实体类
 * @author: whf
 * @date: 2019-8-22 21:43:58
 */

@Data
@TableName("TB_USER")
public class User implements Serializable {

    @TableId(value = "ID",type = IdType.UUID)
    private int id;

    @TableField("USERNAME")
    private String username;

    @TableField("PASSWORD")
    private String password;
}
