package com.shf.ggkt.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:Su HangFei
 * @Date:2023-04-01 15 24
 * @Project:ggkt_parent
 */
@Configuration
@MapperScan("com.shf.ggkt.mapper")
public class OrderConfig {
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
