package com.jero.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

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
@Configuration
public class ConsumerConfig {

    @Bean
    /** @LoadBalanced 这个注解非常重要，没有他，根本没法访问到provider*/
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
