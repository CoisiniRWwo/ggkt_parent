package com.shf.ggkt.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:Su HangFei
 * @Date:2023-03-28 22 22
 * @Project:ggkt_parent
 */
@Configuration
@MapperScan("com.shf.ggkt.mapper")
public class VodConfig {

    //分页插件
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
