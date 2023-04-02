package com.shf.ggkt.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shf.ggkt.model.user.UserInfo;
import com.shf.ggkt.service.UserInfoService;
import com.shf.ggkt.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author SHF
* @description 针对表【user_info(用户表)】的数据库操作Service实现
* @createDate 2023-04-01 16:26:20
*/
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo>
    implements UserInfoService{

    @Override
    public UserInfo getByOpenid(String openId) {
        QueryWrapper<UserInfo> wrapper = new QueryWrapper<>();
        wrapper.eq("open_id",openId);
        UserInfo userInfo = baseMapper.selectOne(wrapper);
        return userInfo;
    }
}




