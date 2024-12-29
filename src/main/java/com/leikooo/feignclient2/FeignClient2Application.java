package com.leikooo.feignclient2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.leikooo.feignclient2.feign")
@EnableDiscoveryClient
@MapperScan
public class FeignClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(FeignClient2Application.class, args);
    }

}
