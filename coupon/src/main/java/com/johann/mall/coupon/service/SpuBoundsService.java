package com.johann.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johann.mall.common.utils.PageUtils;
import com.johann.mall.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author johann
 * @email 
 * @date 2023-01-28 20:03:47
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

