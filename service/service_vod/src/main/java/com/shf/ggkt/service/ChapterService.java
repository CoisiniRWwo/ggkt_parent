package com.shf.ggkt.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shf.ggkt.model.vod.Chapter;
import com.shf.ggkt.vo.vod.ChapterVo;

import java.util.List;

/**
* @author SHF
* @description 针对表【chapter(课程)】的数据库操作Service
* @createDate 2023-03-31 20:37:18
*/
public interface ChapterService extends IService<Chapter> {

    List<ChapterVo> getNestedTreeList(Long courseId);

    void removeChapterByCourseId(Long id);
}
