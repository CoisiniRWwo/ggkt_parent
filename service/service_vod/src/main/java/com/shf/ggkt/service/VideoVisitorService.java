package com.shf.ggkt.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shf.ggkt.model.vod.VideoVisitor;

import java.util.Map;

/**
* @author SHF
* @description 针对表【video_visitor(视频来访者记录表)】的数据库操作Service
* @createDate 2023-04-01 12:41:31
*/
public interface VideoVisitorService extends IService<VideoVisitor> {

    Map<String, Object> findCount(Long courseId, String startDate, String endDate);
}
