package com.johann.mall.product.dao;

import com.johann.mall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author johann
 * @email 
 * @date 2023-01-28 19:33:35
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
