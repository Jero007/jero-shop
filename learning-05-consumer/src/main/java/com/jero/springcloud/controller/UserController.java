package com.jero.springcloud.controller;

import com.jero.springcloud.pojo.shop.ScUser;
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

    private static final String USER_SERVICE_URL = "http://LEARNING-05-PROVIDER-USER";

    @GetMapping
    public List<ScUser> getAllUser() {

        List result = restTemplate.getForObject(USER_SERVICE_URL + "/user", ArrayList.class);
        return result;
    }

    @GetMapping("/{num}")
    public ScUser getUserById(@PathVariable("num") Integer id) {
        ScUser user = restTemplate.getForObject(USER_SERVICE_URL + "/user/" + id, ScUser.class);
        return user;
    }

}
