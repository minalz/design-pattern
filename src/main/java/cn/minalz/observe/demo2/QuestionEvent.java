package cn.minalz.observe.demo2;

import cn.minalz.observe.demo2.Question;
import com.google.common.eventbus.Subscribe;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-14 23:54
 **/
public class QuestionEvent {

    @Subscribe
    public void subscribe(Question question) {
        System.out.println("question：" + question);
    }
}
