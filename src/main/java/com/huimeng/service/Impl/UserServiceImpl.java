package com.huimeng.service.Impl;

import com.huimeng.dao.UserRepository;
import com.huimeng.pojo.User;
import com.huimeng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 回梦
 * @Date: 2021/10/14/19:37
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAAndPassword(username, password);
        return user;
    }
}
