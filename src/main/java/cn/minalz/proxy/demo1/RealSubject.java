package cn.minalz.proxy.demo1;

/**
 * @description: 真实主题角色
 * @author: minalz
 * @date: 2021-04-06 00:09
 **/
public class RealSubject implements ISubject {

    @Override
    public void request() {
        System.out.println("real service is called.");
    }
}
