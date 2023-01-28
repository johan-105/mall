package com.johann.mall.order.dao;

import com.johann.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author johann
 * @email 
 * @date 2023-01-28 19:46:28
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
