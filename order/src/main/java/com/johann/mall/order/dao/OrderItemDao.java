package com.johann.mall.order.dao;

import com.johann.mall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author johann
 * @email 
 * @date 2023-01-28 19:46:28
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
