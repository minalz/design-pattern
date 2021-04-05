package cn.minalz.prototype.demo2;

import lombok.Data;

import java.util.List;

/**
 * @description: 实现JDK的Cloneable接口
 * @author: minalz
 * @date: 2021-04-05 16:44
 **/
@Data
public class ConcretePrototype implements Cloneable {

    private int age;
    private String name;
    private List<String> hobbies;

    @Override
    public ConcretePrototype clone() {
        try {
            return (ConcretePrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
