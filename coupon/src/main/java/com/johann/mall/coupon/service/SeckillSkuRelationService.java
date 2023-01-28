package com.johann.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johann.mall.common.utils.PageUtils;
import com.johann.mall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author johann
 * @email 
 * @date 2023-01-28 20:03:47
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

