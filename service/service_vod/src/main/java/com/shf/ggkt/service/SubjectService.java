package com.shf.ggkt.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shf.ggkt.model.vod.Subject;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
* @author SHF
* @description 针对表【subject(课程科目)】的数据库操作Service
* @createDate 2023-03-31 18:35:37
*/
public interface SubjectService extends IService<Subject> {
    //查询下一层课程分类
    List<Subject> findChildSubject(Long id);

    //课程分类导出
    void exportData(HttpServletResponse response);

    //课程分类导入
    void importDictData(MultipartFile response);
}
