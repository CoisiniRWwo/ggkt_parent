package com.shf.ggkt.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shf.ggkt.model.vod.VideoVisitor;
import com.shf.ggkt.vo.vod.VideoVisitorCountVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author SHF
* @description 针对表【video_visitor(视频来访者记录表)】的数据库操作Mapper
* @createDate 2023-04-01 12:41:31
* @Entity com.shf.ggkt.entity.VideoVisitor
*/
public interface VideoVisitorMapper extends BaseMapper<VideoVisitor> {

    List<VideoVisitorCountVo> findCount(@Param("courseId") Long courseId,
                                        @Param("startDate") String startDate,
                                        @Param("endDate") String endDate);
}




