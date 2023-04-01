package com.shf.ggkt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shf.ggkt.model.order.OrderDetail;
import com.shf.ggkt.service.OrderDetailService;
import com.shf.ggkt.mapper.OrderDetailMapper;
import org.springframework.stereotype.Service;

/**
* @author SHF
* @description 针对表【order_detail(订单明细 订单明细)】的数据库操作Service实现
* @createDate 2023-04-01 15:19:26
*/
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail>
    implements OrderDetailService{

}




