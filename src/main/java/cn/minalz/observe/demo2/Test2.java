package cn.minalz.observe.demo2;

import com.google.common.eventbus.EventBus;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-14 23:52
 **/
public class Test2 {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
//        GuavaEvent guavaEvent = new GuavaEvent();
        QuestionEvent questionEvent = new QuestionEvent();

//        eventBus.register(guavaEvent);
        eventBus.register(questionEvent);
//        eventBus.post("什么人");
        eventBus.post(new Question("张三", "我是谁？"));
    }
}
