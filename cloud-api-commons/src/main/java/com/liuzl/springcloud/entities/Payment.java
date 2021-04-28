package com.liuzl.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @ClassName: Payment
 * @Description: 支付实体类
 * @Author: 52945
 * @Date: 2020/5/19 9:57
 * @Version: 1.0
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Payment implements Serializable {

    /**
    * 主键ID
    */
    private Long id;

    /**
    * 支付流水号
    */
    private String serial;

}