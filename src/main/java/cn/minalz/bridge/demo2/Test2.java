package cn.minalz.bridge.demo2;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 22:46
 **/
public class Test2 {

    public static void main(String[] args) {
        IMessage message = new SmsMessage();
        AbstractMessage abstractMessage = new NormalMessage(message);
        abstractMessage.sendMessage("加班申请速批", "张三");

        message = new EmailMessage();
        abstractMessage = new UrgencyMessage(message);
        abstractMessage.sendMessage("加班申请速批", "张三");
    }

    /**
     * 使用系统内部短消息的方法，发送消息 加班申请速批 给 张三
     * 使用邮件短消息的方法，发送消息 加急：加班申请速批 给 张三
     */
}
