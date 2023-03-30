package com.shf.ggkt.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shf.ggkt.exception.GgktException;
import com.shf.ggkt.model.vod.Teacher;
import com.shf.ggkt.result.Result;
import com.shf.ggkt.service.TeacherService;
import com.shf.ggkt.vo.vod.TeacherQueryVo;
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
@RequestMapping("/admin/vod/teacher")
@CrossOrigin //跨域
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    //查询所有讲师列表
//    @ApiOperation("所有讲师列表")
//    @GetMapping("findAll")
//    public List<Teacher> findAll() {
//        List<Teacher> list = teacherService.list();
//        return list;
//    }

    @ApiOperation("所有讲师列表")
    @GetMapping("findAll")
    public Result findAll() {
        try {
            int a = 10/0;
        } catch (Exception e) {
            throw new GgktException(201,"执行自定义异常GgktException");
        }
        List<Teacher> list = teacherService.list();
        return Result.ok(list).message("查询数据成功");
    }

    //删除讲师
    @ApiOperation("逻辑删除讲师")
    @DeleteMapping("remove/{id}")
    public Result removeById(@ApiParam(name = "id", value = "ID", required = true)
                             @PathVariable String id) {
        boolean isSuccess = teacherService.removeById(id);
        if (isSuccess) {
            return Result.ok(null);
        } else {
            return Result.fail(null);
        }
    }

    //条件查询分页列表
    @ApiOperation(value = "获取分页列表")
    @PostMapping("findQueryPage/{page}/{limit}")
    public Result findPage(
            @ApiParam(name = "page", value = "当前页码", required = true)
            @PathVariable Long page,
            @ApiParam(name = "limit", value = "每页记录数", required = true)
            @PathVariable Long limit,
            @ApiParam(name = "teacherVo", value = "查询对象", required = false)
            @RequestBody(required = false)
            TeacherQueryVo teacherQueryVo
    ) {
        //创建page对象，传递当前页和每页记录数
        Page<Teacher> pageParam = new Page<>(page, limit);
        if (teacherQueryVo == null) {
            List<Teacher> teachers = teacherService.list();
            return Result.ok(teachers);
        } else {
            IPage<Teacher> iPage = teacherService.index(pageParam, teacherQueryVo);
            return Result.ok(iPage);
        }
    }

    @ApiOperation(value = "添加讲师")
    @PostMapping("saveTeacher")
    public Result save(@RequestBody Teacher teacher) {
        boolean isSuccess = teacherService.save(teacher);
        if (isSuccess) {
            return Result.ok(null);
        } else {
            return Result.fail(null);
        }
    }

    @ApiOperation(value = "根据id查询")
    @GetMapping("get/{id}")
    public Result get(@PathVariable Long id) {
        Teacher teacher = teacherService.getById(id);
        return Result.ok(teacher);
    }
    @ApiOperation(value = "修改最终实现")
    @PutMapping("update")
    public Result updateById(@RequestBody Teacher teacher) {
        boolean isSuccess = teacherService.updateById(teacher);
        if (isSuccess) {
            return Result.ok(null);
        } else {
            return Result.fail(null);
        }
    }

    @ApiOperation(value = "批量删除讲师")
    @DeleteMapping("batchRemove")
    public Result batchRemove(@RequestBody List<Long> idList) {
        boolean isSuccess = teacherService.removeByIds(idList);
        if (isSuccess) {
            return Result.ok(null);
        } else {
            return Result.fail(null);
        }
    }
}
