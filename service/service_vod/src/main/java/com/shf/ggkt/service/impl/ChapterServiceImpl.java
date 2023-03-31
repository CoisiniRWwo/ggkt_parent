package com.shf.ggkt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shf.ggkt.model.vod.Chapter;
import com.shf.ggkt.service.ChapterService;
import com.shf.ggkt.mapper.ChapterMapper;
import org.springframework.stereotype.Service;

/**
* @author SHF
* @description 针对表【chapter(课程)】的数据库操作Service实现
* @createDate 2023-03-31 20:37:18
*/
@Service
public class ChapterServiceImpl extends ServiceImpl<ChapterMapper, Chapter>
    implements ChapterService{

}




