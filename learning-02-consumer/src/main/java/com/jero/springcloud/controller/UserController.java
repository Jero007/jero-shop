package com.jero.springcloud.controller;

import com.jero.springcloud.pojo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Date 2020-07-03
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
    private RestTemplate restTemplate;

    private static final String DEFAULT_URL = "http://LEARNING-02-PROVIDER";

    @GetMapping
    public List<User> getAllUser() {

        List result = restTemplate.getForObject(DEFAULT_URL + "/user", ArrayList.class);
        return result;
    }

    @GetMapping("/{num}")
    public User getUserById(@PathVariable("num") Integer id) {
        User user = restTemplate.getForObject(DEFAULT_URL + "/user/" + id, User.class);
        return user;
    }

}
