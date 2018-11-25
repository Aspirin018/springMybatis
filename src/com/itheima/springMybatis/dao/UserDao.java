package com.itheima.springMybatis.dao;

import com.itheima.springMybatis.po.User;

/**
 * Created by liyu on 2018/2/27.
 */
public interface UserDao {
    public User findUserbyId(int id) throws Exception;
}
