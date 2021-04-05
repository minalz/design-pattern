package cn.minalz.prototype.demo3;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-05 16:46
 **/
public class Test {

    public static void main(String[] args) {
        // 创建原型对象
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAge(20);
        prototype.setName("Bob");
        List<String> hobbies = new ArrayList<>(2);
        hobbies.add("玩游戏");
        hobbies.add("看书学习");
        prototype.setHobbies(hobbies);
        System.out.println(prototype);
        // 拷贝原型对象
//        ConcretePrototype clonetype = prototype.deepClone();
        ConcretePrototype clonetype = prototype.deepCloneHobbies();
        clonetype.getHobbies().add("看电影");
        System.out.println("原型对象：" + prototype);
        System.out.println("克隆对象：" + clonetype);
        System.out.println(prototype == clonetype);

        System.out.println("原型对象的爱好：" + prototype.getHobbies());
        System.out.println("克隆对象的爱好：" + clonetype.getHobbies());
        System.out.println(prototype.getHobbies() == clonetype.getHobbies());
        // 最终得到结果是深克隆
        /**
         * ConcretePrototype(age=20, name=Bob, hobbies=[玩游戏, 看书学习])
         * 原型对象：ConcretePrototype(age=20, name=Bob, hobbies=[玩游戏, 看书学习])
         * 克隆对象：ConcretePrototype(age=20, name=Bob, hobbies=[玩游戏, 看书学习, 看电影])
         * false
         * 原型对象的爱好：[玩游戏, 看书学习]
         * 克隆对象的爱好：[玩游戏, 看书学习, 看电影]
         * false
         */

    }
}
