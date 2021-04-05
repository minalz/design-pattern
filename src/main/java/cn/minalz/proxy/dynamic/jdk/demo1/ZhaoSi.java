package cn.minalz.proxy.dynamic.jdk.demo1;

import cn.minalz.proxy.staticproxy.demo1.IPerson;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-06 00:24
 **/
public class ZhaoSi implements IPerson {

    @Override
    public void findLove() {
        System.out.println("赵四要求：婀娜多姿小仙女");
    }
}
