package cn.minalz.bridge.demo2;

/**
 * @description: 邮件短消息的实现类
 * @author: minalz
 * @date: 2021-04-18 22:38
 **/
public class EmailMessage implements IMessage {

    @Override
    public void send(String message, String toUser) {
        System.out.println(String.format("使用邮件短消息的方法，发送消息 %s 给 %s", message, toUser));
    }
}
