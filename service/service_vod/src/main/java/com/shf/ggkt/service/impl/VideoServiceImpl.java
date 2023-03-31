package com.shf.ggkt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shf.ggkt.model.vod.Video;
import com.shf.ggkt.service.VideoService;
import com.shf.ggkt.mapper.VideoMapper;
import org.springframework.stereotype.Service;

/**
* @author SHF
* @description 针对表【video(课程视频)】的数据库操作Service实现
* @createDate 2023-03-31 20:37:24
*/
@Service
public class VideoServiceImpl extends ServiceImpl<VideoMapper, Video>
    implements VideoService{

}




