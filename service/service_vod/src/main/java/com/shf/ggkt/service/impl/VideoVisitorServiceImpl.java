package com.shf.ggkt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shf.ggkt.model.vod.VideoVisitor;
import com.shf.ggkt.service.VideoVisitorService;
import com.shf.ggkt.mapper.VideoVisitorMapper;
import org.springframework.stereotype.Service;

/**
* @author SHF
* @description 针对表【video_visitor(视频来访者记录表)】的数据库操作Service实现
* @createDate 2023-04-01 12:41:31
*/
@Service
public class VideoVisitorServiceImpl extends ServiceImpl<VideoVisitorMapper, VideoVisitor>
    implements VideoVisitorService{

}




