package com.shf.ggkt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author:Su HangFei
 * @Date:2023-04-01 16 27
 * @Project:ggkt_parent
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.shf.ggkt.mapper")
public class ServiceUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceUserApplication.class, args);
    }
}
