package com.taidi.service;

import com.github.pagehelper.PageInfo;
import com.taidi.vo.User;

/**
 * Created by tidy on 2017/11/28.
 */
public interface UserService {
    public User queryUserById();

    public PageInfo<User> queryUsers(int pageNum, int pageSize);
}
