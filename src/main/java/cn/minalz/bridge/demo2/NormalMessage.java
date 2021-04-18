package cn.minalz.bridge.demo2;

/**
 * @description: 具体实现消息类
 * @author: minalz
 * @date: 2021-04-18 22:43
 **/
public class NormalMessage extends AbstractMessage {

    // 构造方法，传入实现部分的对象
    public NormalMessage(IMessage message) {
        super(message);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        // 对于普通消息，直接调用父类方法，发送消息即可
        super.sendMessage(message, toUser);
    }
}
