package com.johann.mall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.johann.mall.common.utils.PageUtils;
import com.johann.mall.common.utils.Query;

import com.johann.mall.product.dao.CategoryDao;
import com.johann.mall.product.entity.CategoryEntity;
import com.johann.mall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> rootNodes = baseMapper.selectList(new QueryWrapper<CategoryEntity>().eq("parent_cid", 0));
        rootNodes.sort(Comparator.comparingInt(CategoryEntity::getSort));
        for (CategoryEntity category :
                rootNodes) {
            this.findChildren(category);
        }
        return rootNodes;
    }
    private void findChildren(CategoryEntity root) {
        Integer level = root.getCatLevel();
        if (level >= 3) return ;
        else {
            List<CategoryEntity> children = baseMapper.selectList(
                    new QueryWrapper<CategoryEntity>().eq("parent_cid", root.getCatId()));
            children.sort(Comparator.comparingInt(CategoryEntity::getSort));
            root.setChildren(children);
            for (CategoryEntity category :
                    children) {
                this.findChildren(category);
            }
        }
    }
}