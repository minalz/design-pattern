package cn.minalz.observe;

import lombok.Data;

import java.util.Observable;


/**
 * @description: JDK提供的一种观察者的实现方式，被观察者
 * @author: minalz
 * @date: 2021-04-14 23:31
 **/
@Data
public class AppSquare extends Observable {

    private String name = "APP广场";
    private static AppSquare appSquare;

    public AppSquare() {
    }

    public static AppSquare getInstance() {
        if (appSquare == null) {
            appSquare = new AppSquare();
        }
        return appSquare;
    }

    public void publishQuestion(Question question) {
        System.out.println(question.getUsername() + "在" + this.name + "上提问了一个问题。");
        setChanged();
        notifyObservers(question);
    }

}
