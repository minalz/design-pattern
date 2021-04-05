package cn.minalz.prototype.demo1;

import lombok.Data;

/**
 * @description: 具体需要克隆的对象
 * @author: minalz
 * @date: 2021-04-05 16:44
 **/
@Data
public class ConcretePrototype implements IPrototype{

    private int age;
    private String name;

    @Override
    public ConcretePrototype clone() {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setAge(this.age);
        concretePrototype.setName(this.name);
        return concretePrototype;
    }
}
