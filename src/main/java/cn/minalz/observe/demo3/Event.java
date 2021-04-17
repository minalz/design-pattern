package cn.minalz.observe.demo3;

import lombok.Data;

import java.lang.reflect.Method;

/**
 * @description: 创建Event类
 * @author: minalz
 * @date: 2021-04-18 00:07
 **/
public class Event {

    // 事件源，动作是由谁发出的
    private Object source;

    // 事件触发，要通知谁（观察者）
    private EventListener target;

    // 观察者给的回应
    private Method callback;

    // 事件的名称
    private String trigger;

    // 事件的触发时间
    private long time;

    public Event(EventListener target, Method callback) {
        this.target = target;
        this.callback = callback;
    }

    public Object getSource() {
        return source;
    }

    public EventListener getTarget() {
        return target;
    }

    public Method getCallback() {
        return callback;
    }

    public String getTrigger() {
        return trigger;
    }

    public long getTime() {
        return time;
    }

    public Event setSource(Object source) {
        this.source = source;
        return this;
    }

    public Event setTarget(EventListener target) {
        this.target = target;
        return this;
    }

    public Event setCallback(Method callback) {
        this.callback = callback;
        return this;
    }

    public Event setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    public Event setTime(long time) {
        this.time = time;
        return this;
    }
}
