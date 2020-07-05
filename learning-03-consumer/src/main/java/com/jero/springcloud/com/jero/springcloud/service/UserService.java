package com.jero.springcloud.com.jero.springcloud.service;

import com.jero.springcloud.pojo.user.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @Description 调用远程的服务
 * @Date 2020-07-05
 * @Author jero
 * @Version 1.0
 * @ModifyNote (add note when you modify)
 * |---modifyText:
 * |---modifyDate:
 * |---modifyAuthor:
 */
@FeignClient("LEARNING-03-PROVIDER")
public interface UserService {

    @GetMapping("/user/{id}")
    User getById(@PathVariable("id") Integer id);

    @GetMapping("/user")
    List<User> getAll();

}
