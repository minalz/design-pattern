package cn.minalz.mediator;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-19 00:29
 **/
public class Test1 {

    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User tom = new User("Tom", chatRoom);
        User bob = new User("Bob", chatRoom);
        tom.sendMessage("Hi! I am Tom.");
        bob.sendMessage("Hello! My name is Bom.");
    }
}
