package com.jero.springcloud.controller;

import com.jero.springcloud.mapper.UserMapper;
import com.jero.springcloud.pojo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description 用户服务
 * @Date 2020-07-02
 * @Author jero
 * @Version 1.0
 * @ModifyNote (add note when you modify)
 * |---modifyText:
 * |---modifyDate:
 * |---modifyAuthor:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Integer id) {
        return this.userMapper.getUserById(id);
    }

    @GetMapping
    public List<User> getAllUser() {
        return this.userMapper.getAllUser();
    }

}
