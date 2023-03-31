package com.shf.ggkt.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shf.ggkt.model.vod.Course;
import com.shf.ggkt.vo.vod.CourseFormVo;
import com.shf.ggkt.vo.vod.CourseQueryVo;

import java.util.Map;

/**
* @author SHF
* @description 针对表【course(课程)】的数据库操作Service
* @createDate 2023-03-31 20:37:00
*/
public interface CourseService extends IService<Course> {
    //课程列表
    Map<String,Object> findPage(Page<Course> pageParam, CourseQueryVo courseQueryVo);
    //添加课程基本信息
    Long saveCourseInfo(CourseFormVo courseFormVo);
}
