package cn.minalz.proxy.staticproxy.demo1;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-06 00:14
 **/
public class ZhangLaoSan implements IPerson {

    private ZhangSan zhangSan;

    public ZhangLaoSan(ZhangSan zhangSan) {
        this.zhangSan = zhangSan;
    }

    @Override
    public void findLove() {
        System.out.println("张老三开始物色");
        zhangSan.findLove();
        System.out.println("开始交往");
    }
}
