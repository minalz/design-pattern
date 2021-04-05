package cn.minalz.proxy.demo1;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-06 00:12
 **/
public class Test1 {

    public static void main(String[] args) {
        SubjectProxy subjectProxy = new SubjectProxy(new RealSubject());
        subjectProxy.request();
    }
}
