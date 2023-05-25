/**
 * Copyright 2019 bejson.com
 */
package com.atguigu.gulimall.product.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * json格式化工具：https://www.bejson.com/,json生成java类：https://www.bejson.com/json2javapojo/new/
 *
 * 利用json生成SpuSaveVo，生成代码，复制到vo包下
 *
 * 微调vo，把所有id字段改成Long类型，把所有double类型改成BigDecimal类型

 * Auto-generated: 2019-11-26 10:50:34
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
public class SpuSaveVo {

    private String spuName;
    private String spuDescription;
    private Long catalogId;
    private Long brandId;
    private BigDecimal weight;
    private int publishStatus;
    private List<String> decript;
    private List<String> images;
    private Bounds bounds;
    private List<BaseAttrs> baseAttrs;
    private List<Skus> skus;



}