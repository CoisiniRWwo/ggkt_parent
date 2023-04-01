package com.shf.ggkt.service;

import java.io.InputStream;

/**
 * @Author:Su HangFei
 * @Date:2023-04-01 13 31
 * @Project:ggkt_parent
 */
public interface VodService {
    //上传视频
    String uploadVideo(InputStream inputStream, String originalFilename);

    //删除视频
    void removeVideo(String videoSourceId);
}
