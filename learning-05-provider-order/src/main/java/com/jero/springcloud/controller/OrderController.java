package com.jero.springcloud.controller;

import com.jero.springcloud.mapper.OrderMapper;
import com.jero.springcloud.pojo.shop.ScOrder;
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
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderMapper orderMapper;

    @GetMapping("/{id}")
    @HystrixCommand(fallbackMethod = "noUserFound")
    public ScOrder getUserById(@PathVariable("id") Integer id) {
        ScOrder order = this.orderMapper.getOrderById(id);
        if (order == null){
            throw new RuntimeException("order not found");
        }
        return order;
    }

    @GetMapping
    public List<ScOrder> getAllUser() {
        return this.orderMapper.getAllOrder();
    }

    public ScOrder noUserFound(@PathVariable("id") Integer id){
        ScOrder order = new ScOrder();
        order.setId(-1);
        order.setDbName("order[id=" + id + "] not found");
        return order;
    }

}
