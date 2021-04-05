package cn.minalz.proxy.dynamic.cglib;

import org.springframework.cglib.core.DebuggingClassWriter;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-06 01:16
 **/
public class Test6 {

    public static void main(String[] args) {
        try {
            // 利用CGlib的代理类可以将内存中的.class文件写入本地磁盘
//            System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/XXX");
            Customer obj = (Customer)new CglibMeiPo().getInstance(Customer.class);
            obj.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
