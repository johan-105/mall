package com.johann.mall.product.vo;

import lombok.Data;

@Data
public class AttrRespVo extends AttrVo {

    private String groupName;
    private String catelogName;
    private Long[] catelogPath;
}
