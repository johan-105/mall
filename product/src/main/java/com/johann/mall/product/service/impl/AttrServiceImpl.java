package com.johann.mall.product.service.impl;

import com.johann.mall.product.dao.AttrAttrgroupRelationDao;
import com.johann.mall.product.dao.AttrGroupDao;
import com.johann.mall.product.dao.CategoryDao;
import com.johann.mall.product.entity.AttrAttrgroupRelationEntity;
import com.johann.mall.product.entity.AttrGroupEntity;
import com.johann.mall.product.entity.CategoryEntity;
import com.johann.mall.product.service.CategoryService;
import com.johann.mall.product.vo.AttrRespVo;
import com.johann.mall.product.vo.AttrVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.johann.mall.common.utils.PageUtils;
import com.johann.mall.common.utils.Query;

import com.johann.mall.product.dao.AttrDao;
import com.johann.mall.product.entity.AttrEntity;
import com.johann.mall.product.service.AttrService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;


@Service("attrService")
public class AttrServiceImpl extends ServiceImpl<AttrDao, AttrEntity> implements AttrService {

    @Autowired
    AttrAttrgroupRelationDao relationDao;

    @Autowired
    AttrGroupDao attrGroupDao;

    @Autowired
    CategoryDao categoryDao;

    @Autowired
    CategoryService categoryService;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AttrEntity> page = this.page(
                new Query<AttrEntity>().getPage(params),
                new QueryWrapper<AttrEntity>()
        );

        return new PageUtils(page);
    }

    @Transactional
    @Override
    public void saveAttrVo(AttrVo attrVo) {
        AttrEntity attrEntity = new AttrEntity();
        BeanUtils.copyProperties(attrVo, attrEntity);
        this.save(attrEntity);

        AttrAttrgroupRelationEntity relationEntity = new AttrAttrgroupRelationEntity();
        relationEntity.setAttrGroupId(attrVo.getAttrGroupId());
        //attrVo没有生成AttrId
        relationEntity.setAttrId(attrEntity.getAttrId());
        relationDao.insert(relationEntity);
    }

    @Override
    public PageUtils queryPage(Map<String, Object> params, Long catelogId) {
        String key = (String) params.get("key");
        QueryWrapper<AttrEntity> wrapper = new QueryWrapper<AttrEntity>();
        if(StringUtils.hasText(key)){
            wrapper.and((obj)->{
                obj.eq("attr_id",key).or().like("attr_name",key);
            });
        }
        if (catelogId != 0) wrapper.eq("catelog_id",catelogId);
        IPage<AttrEntity> page = this.page(new Query<AttrEntity>().getPage(params),
                wrapper);
        PageUtils pageUtils = new PageUtils(page);
        List<AttrEntity> records = page.getRecords();
        List<AttrRespVo> respVos = records.stream().map((attrEntity) -> {
            AttrRespVo attrRespVo = new AttrRespVo();
            BeanUtils.copyProperties(attrEntity, attrRespVo);
            AttrAttrgroupRelationEntity attrId = relationDao.selectOne(new QueryWrapper<AttrAttrgroupRelationEntity>().eq("attr_id", attrEntity.getAttrId()));
            if (attrId != null && attrId.getAttrGroupId()!=null) {
                AttrGroupEntity attrGroupEntity = attrGroupDao.selectById(attrId.getAttrGroupId());
                attrRespVo.setGroupName(attrGroupEntity.getAttrGroupName());
            }
            CategoryEntity categoryEntity = categoryDao.selectById(attrEntity.getCatelogId());
            if (categoryEntity != null) {
                attrRespVo.setCatelogName(categoryEntity.getName());
            }
            return attrRespVo;
        }).collect(Collectors.toList());;
        pageUtils.setList(respVos);
        return  pageUtils;

    }

    @Override
    public AttrRespVo getAttrRespVo(Long attrId) {
        AttrEntity attr = this.getById(attrId);
        AttrRespVo attrRespVo = new AttrRespVo();
        BeanUtils.copyProperties(attr, attrRespVo);

        AttrAttrgroupRelationEntity relationEntity = relationDao.selectOne(new QueryWrapper<AttrAttrgroupRelationEntity>().eq("attr_id", attrId));
        if(relationEntity!=null){
            attrRespVo.setAttrGroupId(relationEntity.getAttrGroupId());
            AttrGroupEntity attrGroupEntity = attrGroupDao.selectById(relationEntity.getAttrGroupId());
            if(attrGroupEntity!=null){
                attrRespVo.setGroupName(attrGroupEntity.getAttrGroupName());
            }
        }

        Long catelogId = attr.getCatelogId();
        attrRespVo.setCatelogPath(categoryService.findCatelogPath(catelogId));
        return attrRespVo;
    }

}