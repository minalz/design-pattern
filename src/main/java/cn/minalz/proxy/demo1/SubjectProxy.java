package cn.minalz.proxy.demo1;

import java.lang.reflect.Proxy;

/**
 * @description: 代理主题角色
 * @author: minalz
 * @date: 2021-04-06 00:10
 **/
public class SubjectProxy implements ISubject {

    private ISubject subject;

    public SubjectProxy(ISubject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        before();
        subject.request();
        after();
    }

    public void before() {
        System.out.println("called before request().");
    }

    public void after() {
        System.out.println("called after request().");
    }
}
