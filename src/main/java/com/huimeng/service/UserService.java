package com.huimeng.service;

import com.huimeng.pojo.User;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 回梦
 * @Date: 2021/10/14/19:35
 */
public interface UserService {
    User checkUser(String username, String password);
}
