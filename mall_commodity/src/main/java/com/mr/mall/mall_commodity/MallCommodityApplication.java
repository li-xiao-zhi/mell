package com.mr.mall.mall_commodity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableCircuitBreaker
@EnableFeignClients
public class MallCommodityApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallCommodityApplication.class, args);
    }

}
