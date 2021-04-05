package cn.minalz.proxy.dynamic.jdk.demo2;

import lombok.Data;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-06 00:29
 **/
@Data
public class Order {

    private Object orderInfo;
    private Long createTime;
    private String id;

}
