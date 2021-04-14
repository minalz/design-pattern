package cn.minalz.observe.demo2;

import com.google.common.eventbus.Subscribe;

/**
 * @description: 创建侦听事件
 * @author: minalz
 * @date: 2021-04-14 23:51
 **/
public class GuavaEvent {

    @Subscribe
    public void subscribe(String str) {
        System.out.println("执行subscribe方法，传入的参数是：" + str);
    }
}
