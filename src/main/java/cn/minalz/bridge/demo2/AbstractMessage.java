package cn.minalz.bridge.demo2;

/**
 * @description: 桥接抽象对象类
 * @author: minalz
 * @date: 2021-04-18 22:41
 **/
public class AbstractMessage {

    // 是有一个实现部分的对象
    IMessage message;

    // 构造方法，传入实现部分的对象
    public AbstractMessage(IMessage message) {
        this.message = message;
    }

    // 发送消息，微拍给实现部分的方法
    public void sendMessage(String message, String toUser) {
        this.message.send(message, toUser);
    }
}
