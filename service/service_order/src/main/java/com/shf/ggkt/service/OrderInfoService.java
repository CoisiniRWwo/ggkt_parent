package com.shf.ggkt.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shf.ggkt.model.order.OrderInfo;
import com.shf.ggkt.vo.order.OrderInfoQueryVo;

import java.util.Map;

/**
* @author SHF
* @description 针对表【order_info(订单表 订单表)】的数据库操作Service
* @createDate 2023-04-01 15:19:49
*/
public interface OrderInfoService extends IService<OrderInfo> {

    //订单列表
    Map<String, Object> findPageOrderInfo(Page<OrderInfo> pageParam, OrderInfoQueryVo orderInfoQueryVo);
}
