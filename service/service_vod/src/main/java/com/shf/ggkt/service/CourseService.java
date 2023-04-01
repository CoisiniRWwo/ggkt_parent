package com.shf.ggkt.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shf.ggkt.model.vod.Course;
import com.shf.ggkt.vo.vod.CourseFormVo;
import com.shf.ggkt.vo.vod.CoursePublishVo;
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

    //根据id获取课程信息
    CourseFormVo getCourseFormVoById(Long id);

    //修改课程信息
    void updateCourseById(CourseFormVo courseFormVo);

    //根据id获取课程发布信息
    CoursePublishVo getCoursePublishVo(Long id);

    //根据id发布课程
    void publishCourseById(Long id);

    void removeCourseById(Long id);
}
