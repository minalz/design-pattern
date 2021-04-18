package cn.minalz.bridge.demo2;

/**
 * @description: 系统内短消息的实现
 * @author: minalz
 * @date: 2021-04-18 22:39
 **/
public class SmsMessage implements IMessage {

    @Override
    public void send(String message, String toUser) {
        System.out.println(String.format("使用系统内部短消息的方法，发送消息 %s 给 %s", message, toUser));
    }
}
