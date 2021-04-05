package cn.minalz.proxy.staticproxy;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-06 00:16
 **/
public class Test2 {

    public static void main(String[] args) {
        ZhangLaoSan zhangLaoSan = new ZhangLaoSan(new ZhangSan());
        zhangLaoSan.findLove();
    }
}
