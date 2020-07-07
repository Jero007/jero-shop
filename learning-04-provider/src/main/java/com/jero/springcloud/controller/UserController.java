package com.jero.springcloud.controller;

import com.jero.springcloud.mapper.UserMapper;
import com.jero.springcloud.pojo.user.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    @HystrixCommand(fallbackMethod = "noUserFound")
    public User getUserById(@PathVariable("id") Integer id) {
        User user = this.userMapper.getUserById(id);
        if (user == null){
            throw new RuntimeException("user not found");
        }
        return user;
    }

    @GetMapping
    public List<User> getAllUser() {
        return this.userMapper.getAllUser();
    }

    public User noUserFound(@PathVariable("id") Integer id){
        User user = new User();
        user.setId(-1);
        user.setNickName("user[id=" + id + "] not found");
        return user;
    }

}
