package com.taidi.dao;

import com.taidi.vo.User;

import java.util.List;

/**
 * Created by tidy on 2017/11/28.
 */
public interface UserDao {
    public User queryUserById(int id);

    public List<User> queryUsers();
}
