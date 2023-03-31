package com.shf.ggkt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shf.ggkt.model.vod.CourseDescription;
import com.shf.ggkt.service.CourseDescriptionService;
import com.shf.ggkt.mapper.CourseDescriptionMapper;
import org.springframework.stereotype.Service;

/**
* @author SHF
* @description 针对表【course_description(课程简介)】的数据库操作Service实现
* @createDate 2023-03-31 20:37:09
*/
@Service
public class CourseDescriptionServiceImpl extends ServiceImpl<CourseDescriptionMapper, CourseDescription>
    implements CourseDescriptionService{

}




