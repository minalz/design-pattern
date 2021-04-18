package cn.minalz.mediator;

import lombok.Data;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-19 00:27
 **/
@Data
public class User {

    private String name;
    private ChatRoom chatRoom;

    public User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public void sendMessage(String msg) {
        this.chatRoom.showMsg(this, msg);
    }
}
