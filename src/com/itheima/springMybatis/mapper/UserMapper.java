package com.itheima.springMybatis.mapper;


import com.itheima.springMybatis.po.User;

import java.util.List;

/**
 * Created by liyu on 2018/1/29.
 */
public interface UserMapper {
    public User findUserbyId(int id);
}
