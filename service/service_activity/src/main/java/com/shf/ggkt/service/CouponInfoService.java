package com.shf.ggkt.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shf.ggkt.model.activity.CouponInfo;
import com.shf.ggkt.model.activity.CouponUse;
import com.shf.ggkt.vo.activity.CouponUseQueryVo;

/**
* @author SHF
* @description 针对表【coupon_info(优惠券信息)】的数据库操作Service
* @createDate 2023-04-01 16:12:54
*/
public interface CouponInfoService extends IService<CouponInfo> {

    IPage<CouponUse> selectCouponUsePage(Page<CouponUse> pageParam, CouponUseQueryVo couponUseQueryVo);
}
