package com.johann.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johann.mall.common.utils.PageUtils;
import com.johann.mall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author johann
 * @email 
 * @date 2023-01-28 19:33:35
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

