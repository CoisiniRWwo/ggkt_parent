package com.shf.ggkt.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shf.ggkt.model.vod.Subject;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
* @author SHF
* @description 针对表【subject(课程科目)】的数据库操作Mapper
* @createDate 2023-03-31 18:35:37
* @Entity com.shf.ggkt.entity.Subject
*/
@Repository
@Mapper
public interface SubjectMapper extends BaseMapper<Subject> {

}




