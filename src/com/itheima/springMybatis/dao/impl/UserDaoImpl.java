package com.itheima.springMybatis.dao.impl;


import com.itheima.springMybatis.dao.UserDao;
import com.itheima.springMybatis.po.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * Created by liyu on 2018/1/28.
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
    @Override
    public User findUserbyId(int id) throws Exception {
        return this.getSqlSession().selectOne("test.findUserById",  1);
    }
}
