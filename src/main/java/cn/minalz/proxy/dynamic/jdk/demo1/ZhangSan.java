package cn.minalz.proxy.dynamic.jdk.demo1;

import cn.minalz.proxy.staticproxy.demo1.IPerson;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-06 00:14
 **/
public class ZhangSan implements IPerson {

    @Override
    public void findLove() {
        System.out.println("儿子要求：肤白貌美大长腿");
    }
}
