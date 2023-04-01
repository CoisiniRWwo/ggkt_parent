package com.shf.ggkt.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shf.ggkt.model.wechat.Menu;
import com.shf.ggkt.vo.wechat.MenuVo;
import me.chanjar.weixin.common.error.WxErrorException;

import java.util.List;

/**
* @author SHF
* @description 针对表【menu(订单明细 订单明细)】的数据库操作Service
* @createDate 2023-04-01 19:02:40
*/
public interface MenuService extends IService<Menu> {

    //获取所有菜单，按照一级和二级菜单封装
    List<MenuVo> findMenuInfo();

    //获取所有一级菜单
    List<Menu> findMenuOneInfo();

    void syncMenu();

    void removeMenu() throws WxErrorException;
}
