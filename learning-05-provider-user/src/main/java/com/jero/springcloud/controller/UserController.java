package com.jero.springcloud.controller;

import com.jero.springcloud.mapper.User1Mapper;
import com.jero.springcloud.pojo.shop.ScUser;
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
    private User1Mapper userMapper;

    @GetMapping("/{id}")
    @HystrixCommand(fallbackMethod = "noUserFound")
    public ScUser getUserById(@PathVariable("id") Integer id) {
        ScUser user = this.userMapper.getUserById(id);
        if (user == null){
            throw new RuntimeException("user not found");
        }
        return user;
    }

    @GetMapping
    public List<ScUser> getAllUser() {
        return this.userMapper.getAllUser();

    }

    public ScUser noUserFound(@PathVariable("id") Integer id){
        ScUser user = new ScUser();
        user.setId(-1);
        user.setName("user[id=" + id + "] not found");
        return user;
    }

}
