package com.johann.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.johann.mall.common.utils.PageUtils;
import com.johann.mall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author johann
 * @email 
 * @date 2023-01-28 19:33:35
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

