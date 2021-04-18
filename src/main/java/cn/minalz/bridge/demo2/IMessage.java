package cn.minalz.bridge.demo2;

/**
 * @description: 实现消息发送的同意接口
 * @author: minalz
 * @date: 2021-04-18 22:37
 **/
public interface IMessage {

    // 要发送的消息的内容和接收人
    void send(String message, String toUser);
}
