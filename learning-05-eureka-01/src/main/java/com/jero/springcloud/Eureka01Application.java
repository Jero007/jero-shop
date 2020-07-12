package com.jero.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description TODO
 * @Date 2020-07-04
 * @Author jero
 * @Version 1.0
 * @ModifyNote (add note when you modify)
 * |---modifyText:
 * |---modifyDate:
 * |---modifyAuthor:
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka01Application {

    public static void main(String[] args) {
        SpringApplication.run(Eureka01Application.class, args);
    }
}
