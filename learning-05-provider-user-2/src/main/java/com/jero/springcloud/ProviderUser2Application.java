package com.jero.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Description TODO
 * @Date 2020-07-01
 * @Author jero
 * @Version 1.0
 * @ModifyNote (add note when you modify)
 * |---modifyText:
 * |---modifyDate:
 * |---modifyAuthor:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableHystrix
@EnableHystrixDashboard
public class ProviderUser2Application {
    public static void main(String[] args) {
        SpringApplication.run(ProviderUser2Application.class, args);
    }
}
