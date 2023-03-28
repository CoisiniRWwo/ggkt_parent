package com.shf.ggkt.controller;

import com.shf.ggkt.model.vod.Teacher;
import com.shf.ggkt.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author:Su HangFei
 * @Date:2023-03-28 22 13
 * @Project:ggkt_parent
 */

@Api(tags = "讲师管理接口")
@RestController
@RequestMapping("/vod/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    //查询所有讲师列表
    @ApiOperation("所有讲师列表")
    @GetMapping("findAll")
    public List<Teacher> findAll() {
        List<Teacher> list = teacherService.list();
        return list;
    }

    //删除讲师
    @ApiOperation("逻辑删除讲师")
    @DeleteMapping("remove/{id}")
    public boolean removeById(@ApiParam(name = "id", value = "ID", required = true)
                                  @PathVariable String id){
        return teacherService.removeById(id);
    }
}
