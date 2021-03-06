package com.xiaoyong.controller;

import com.xiaoyong.dao.UserRepository;
import com.xiaoyong.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create By dongxiaoyong on /2021/3/5
 * description: 用户controller
 *
 * @author dongxiaoyong
 */
@RestController
@RequestMapping("/user")
public class UserControrller {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        return userRepository.findOne(id);
    }
}
