package com.liuzl.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @ClassName: Storage
 * @Description: 库存实体类
 * @Author: 52945
 * @Date: 2020/6/4 16:19
 * @Version: 1.0
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Storage {

    private Long id;

    /**
    * 产品id
    */
    private Long productId;

    /**
    * 总库存
    */
    private Integer total;

    /**
    * 已用库存
    */
    private Integer used;

    /**
    * 剩余库存
    */
    private Integer residue;

}