package com.shf.ggkt.api;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shf.ggkt.model.vod.Course;
import com.shf.ggkt.service.CourseService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author:Su HangFei
 * @Date:2023-04-01 20 45
 * @Project:ggkt_parent
 */
@RestController
@RequestMapping("/api/vod/course")
public class CourseApiController {

    @Autowired
    private CourseService courseService;

    @ApiOperation("根据关键字查询课程")
    @GetMapping("inner/findByKeyword/{keyword}")
    public List<Course> findByKeyword(
            @ApiParam(value = "关键字", required = true)
            @PathVariable String keyword){
        QueryWrapper<Course> queryWrapper = new QueryWrapper();
        queryWrapper.like("title", keyword);
        List<Course> list = courseService.list(queryWrapper);
        return list;
    }
}
