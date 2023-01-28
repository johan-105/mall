package com.johann.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johann.mall.common.utils.PageUtils;
import com.johann.mall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author johann
 * @email 
 * @date 2023-01-28 20:07:22
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

