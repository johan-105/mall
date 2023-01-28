package com.johann.mall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.johann.mall.coupon.entity.SeckillPromotionEntity;
import com.johann.mall.coupon.service.SeckillPromotionService;
import com.johann.mall.common.utils.PageUtils;
import com.johann.mall.common.utils.R;



/**
 * 秒杀活动
 *
 * @author johann
 * @email 
 * @date 2023-01-28 20:03:47
 */
@RestController
@RequestMapping("coupon/seckillpromotion")
public class SeckillPromotionController {
    @Autowired
    private SeckillPromotionService seckillPromotionService;

    /**
     * 列表
     */
    @GetMapping("/list")
    // @RequiresPermissions("coupon:seckillpromotion:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = seckillPromotionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{id}")
    // @RequiresPermissions("coupon:seckillpromotion:info")
    public R info(@PathVariable("id") Long id){
		SeckillPromotionEntity seckillPromotion = seckillPromotionService.getById(id);

        return R.ok().put("seckillPromotion", seckillPromotion);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    // @RequiresPermissions("coupon:seckillpromotion:save")
    public R save(@RequestBody SeckillPromotionEntity seckillPromotion){
		seckillPromotionService.save(seckillPromotion);

        return R.ok();
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    // @RequiresPermissions("coupon:seckillpromotion:update")
    public R update(@RequestBody SeckillPromotionEntity seckillPromotion){
		seckillPromotionService.updateById(seckillPromotion);

        return R.ok();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    // @RequiresPermissions("coupon:seckillpromotion:delete")
    public R delete(@RequestBody Long[] ids){
		seckillPromotionService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
