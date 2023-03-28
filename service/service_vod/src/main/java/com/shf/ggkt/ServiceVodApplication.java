package com.shf.ggkt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author:Su HangFei
 * @Date:2023-03-28 22 21
 * @Project:ggkt_parent
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.shf")
public class ServiceVodApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceVodApplication.class, args);
    }
}
