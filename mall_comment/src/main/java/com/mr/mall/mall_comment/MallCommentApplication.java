package com.mr.mall.mall_comment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableCircuitBreaker
@EnableFeignClients
public class MallCommentApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallCommentApplication.class, args);
    }

}
