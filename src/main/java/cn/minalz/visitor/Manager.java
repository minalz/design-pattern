package cn.minalz.visitor;

import java.util.Random;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 00:48
 **/
public class Manager extends Employee {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    // 一年做的产品数量
    public int getProducts() {
        return new Random().nextInt(10);
    }
}
