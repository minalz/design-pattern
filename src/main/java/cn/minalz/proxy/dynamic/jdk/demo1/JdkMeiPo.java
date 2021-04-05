package cn.minalz.proxy.dynamic.jdk.demo1;

import cn.minalz.proxy.staticproxy.demo1.IPerson;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-06 00:19
 **/
public class JdkMeiPo implements InvocationHandler {

    private IPerson target;

    public IPerson getInstance(IPerson target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return (IPerson)Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(this.target, args);
        after();
        return result;
    }

    public void before() {
        System.out.println("我是媒婆，已经收集到你的需求，开始物业");
    }

    public void after() {
        System.out.println("双方同意，开始交往");
    }
}
