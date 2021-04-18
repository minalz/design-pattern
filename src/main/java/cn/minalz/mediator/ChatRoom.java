package cn.minalz.mediator;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-19 00:28
 **/
public class ChatRoom {

    public void showMsg(User user, String msg) {
        System.out.println("[" + user.getName() + "] : " + msg);
    }
}
