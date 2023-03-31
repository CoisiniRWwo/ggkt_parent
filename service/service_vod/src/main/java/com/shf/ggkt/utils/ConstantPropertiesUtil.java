package com.shf.ggkt.utils;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author:Su HangFei
 * @Date:2023-03-31 16 25
 * @Project:ggkt_parent
 */
@Component
public class ConstantPropertiesUtil implements InitializingBean {

    @Value(value = "${tencent.cos.file.region}")
    private String region;

    @Value(value = "${tencent.cos.file.secret-id}")
    private String secretId;

    @Value(value = "${tencent.cos.file.secretary}")
    private String secretKey;

    @Value(value = "${tencent.cos.file.bucket-name}")
    private String bucketName;

    public static String END_POINT;
    public static String ACCESS_KEY_ID;
    public static String ACCESS_KEY_SECRET;
    public static String BUCKET_NAME;

    @Override
    public void afterPropertiesSet() throws Exception {
        END_POINT = region;
        ACCESS_KEY_ID = secretId;
        ACCESS_KEY_SECRET = secretKey;
        BUCKET_NAME = bucketName;
    }
}
