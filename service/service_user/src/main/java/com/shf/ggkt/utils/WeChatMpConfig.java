package com.shf.ggkt.utils;

import me.chanjar.weixin.mp.api.WxMpConfigStorage;
import me.chanjar.weixin.mp.api.WxMpInMemoryConfigStorage;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author:Su HangFei
 * @Date:2023-04-02 09 46
 * @Project:ggkt_parent
 */
@Configuration
public class WeChatMpConfig {
    @Autowired
    private ConstantPropertiesUtil constantPropertiesUtil;

    @Bean
    public WxMpService wxMpService(){
        WxMpService wxMpService = new WxMpServiceImpl();
        wxMpService.setWxMpConfigStorage(wxMpConfigStorage());
        return wxMpService;
    }

    @Bean
    public WxMpConfigStorage wxMpConfigStorage(){
        WxMpInMemoryConfigStorage wxMpConfigStorage = new WxMpInMemoryConfigStorage();
        wxMpConfigStorage.setAppId(ConstantPropertiesUtil.ACCESS_KEY_ID);
        wxMpConfigStorage.setSecret(ConstantPropertiesUtil.ACCESS_KEY_SECRET);
        return wxMpConfigStorage;
    }
}
