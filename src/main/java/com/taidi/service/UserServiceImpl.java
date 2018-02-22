package com.taidi.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taidi.dao.UserDao;
import com.taidi.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tidy on 2017/11/28.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;
    public User queryUserById() {
        return userDao.queryUserById(1);
    }

    public PageInfo<User> queryUsers(int pageNum, int pageSize) {
        /**
         * PageHelper 类设置分页页号与每页大小
         */
        PageHelper.startPage(pageNum, pageSize);
        List<User> list=userDao.queryUsers();
        PageInfo<User> pageInfo=new PageInfo<User>(list);
        return pageInfo;
    }
}
