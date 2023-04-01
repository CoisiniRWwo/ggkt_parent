package com.shf.ggkt.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shf.ggkt.model.vod.Video;

/**
* @author SHF
* @description 针对表【video(课程视频)】的数据库操作Service
* @createDate 2023-03-31 20:37:24
*/
public interface VideoService extends IService<Video> {

    void removeVideoByCourseId(Long id);
}
