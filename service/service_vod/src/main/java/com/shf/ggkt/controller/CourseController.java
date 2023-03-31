package com.shf.ggkt.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shf.ggkt.model.vod.Course;
import com.shf.ggkt.result.Result;
import com.shf.ggkt.service.CourseService;
import com.shf.ggkt.vo.vod.CourseFormVo;
import com.shf.ggkt.vo.vod.CourseQueryVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @Author:Su HangFei
 * @Date:2023-03-31 20 41
 * @Project:ggkt_parent
 */
@Api(tags = "课程管理接口")
@RestController
@RequestMapping(value="/admin/vod/course")
@CrossOrigin
public class CourseController {
    @Autowired
    private CourseService courseService;

    @ApiOperation(value = "获取分页列表")
    @GetMapping("{page}/{limit}")
    public Result index(
            @ApiParam(name = "page", value = "当前页码", required = true)
            @PathVariable Long page,
            @ApiParam(name = "limit", value = "每页记录数", required = true)
            @PathVariable Long limit,
            @ApiParam(name = "courseVo", value = "查询对象", required = false)
            CourseQueryVo courseQueryVo) {
        Page<Course> pageParam = new Page<>(page, limit);
        Map<String,Object> map = courseService.findPage(pageParam, courseQueryVo);
        return Result.ok(map);
    }

    //添加课程基本信息
    @ApiOperation(value = "新增")
    @PostMapping("save")
    public Result save(@RequestBody CourseFormVo courseFormVo) {
        Long courseId = courseService.saveCourseInfo(courseFormVo);
        return Result.ok(courseId);
    }
}