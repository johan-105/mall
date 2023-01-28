package com.johann.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johann.mall.common.utils.PageUtils;
import com.johann.mall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author johann
 * @email 
 * @date 2023-01-28 20:07:22
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

