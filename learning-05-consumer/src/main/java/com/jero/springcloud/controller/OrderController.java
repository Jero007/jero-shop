package com.jero.springcloud.controller;

import com.jero.springcloud.pojo.shop.ScOrder;
import com.jero.springcloud.pojo.shop.ScUser;
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
 * @Date 2020-07-12
 * @Author jero
 * @Version 1.0
 * @ModifyNote (add note when you modify)
 * |---modifyText:
 * |---modifyDate:
 * |---modifyAuthor:
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String ORDER_SERVICE_URL = "http://LEARNING-05-PROVIDER-ORDER";

    @GetMapping
    public List<ScOrder> getAllOrder() {

        List result = restTemplate.getForObject(ORDER_SERVICE_URL + "/order", ArrayList.class);
        return result;
    }

    @GetMapping("/{num}")
    public ScOrder getUserById(@PathVariable("num") Integer id) {
        ScOrder order = restTemplate.getForObject(ORDER_SERVICE_URL + "/order/" + id, ScOrder.class);
        return order;
    }

}
