package com.johann.mall.product.dao;

import com.johann.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author johann
 * @email 
 * @date 2023-01-28 19:33:35
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
