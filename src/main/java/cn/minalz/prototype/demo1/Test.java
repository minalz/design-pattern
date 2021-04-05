package cn.minalz.prototype.demo1;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-05 16:46
 **/
public class Test {

    public static void main(String[] args) {
        // 创建原型对象
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAge(18);
        prototype.setName("Tom");
        System.out.println(prototype);
        // 拷贝原型对象
        ConcretePrototype clonetype = prototype.clone();
        System.out.println(clonetype);
    }
}
