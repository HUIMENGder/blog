package com.huimeng.dao;

import com.huimeng.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 回梦
 * @Date: 2021/10/14/19:38
 */
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsernameAAndPassword(String username,String password);
}
