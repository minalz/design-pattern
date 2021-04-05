package cn.minalz.proxy.dynamic.jdk.demo1;

import cn.minalz.proxy.staticproxy.IPerson;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-06 00:26
 **/
public class Test3 {

    public static void main(String[] args) {
        JdkMeiPo jdkMeiPo = new JdkMeiPo();
        IPerson instance = jdkMeiPo.getInstance(new ZhangSan());
        instance.findLove();

        IPerson instance1 = jdkMeiPo.getInstance(new ZhaoSi());
        instance1.findLove();
    }
}
