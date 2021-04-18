package cn.minalz.bridge.demo2;

/**
 * @description: 具体实现消息
 * @author: minalz
 * @date: 2021-04-18 22:44
 **/
public class UrgencyMessage extends AbstractMessage {

    // 构造方法
    public UrgencyMessage(IMessage message) {
        super(message);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        message = "加急：" + message;
        super.sendMessage(message, toUser);
    }

    // 扩展它自己的功能，监控某个消息的处理状态
    public Object watch(String messageId) {
        // 根据给出的 消息编码(messageId) 查询消息的处理状态
        // 组织成监控的处理状态，然后返回
        return null;
    }
}
