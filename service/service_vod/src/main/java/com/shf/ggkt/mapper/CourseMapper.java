package com.shf.ggkt.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shf.ggkt.model.vod.Course;
import com.shf.ggkt.vo.vod.CoursePublishVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
* @author SHF
* @description 针对表【course(课程)】的数据库操作Mapper
* @createDate 2023-03-31 20:37:00
* @Entity com.shf.ggkt.entity.Course
*/
@Mapper
@Repository
public interface CourseMapper extends BaseMapper<Course> {
    CoursePublishVo selectCoursePublishVoById(Long id);
}




