package com.shf.ggkt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shf.ggkt.model.vod.Teacher;
import com.shf.ggkt.vo.vod.TeacherQueryVo;

/**
* @author SHF
* @description 针对表【teacher(讲师)】的数据库操作Service
* @createDate 2023-03-28 22:10:21
*/
public interface TeacherService extends IService<Teacher> {
    IPage<Teacher> index(Page pageParam, TeacherQueryVo teacherQueryVo);
}
