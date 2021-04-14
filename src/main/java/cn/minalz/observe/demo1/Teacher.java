package cn.minalz.observe.demo1;

import java.util.Observable;
import java.util.Observer;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-14 23:35
 **/
public class Teacher implements Observer {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        AppSquare appSquare = (AppSquare)o;
        Question question = (Question)arg;
        System.out.println("==================");
        System.out.println(name + "老师，你好！\n" +
                "您收到了一个来自\"" + appSquare.getName() + "\"的提问，希望您解答，问题内容如下：\n" +
                question.getContent() + "\n" +
                "提问者：" + question.getUsername());
    }
}
