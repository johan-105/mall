package com.johann.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johann.mall.common.utils.PageUtils;
import com.johann.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author johann
 * @email 
 * @date 2023-01-28 19:46:28
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

