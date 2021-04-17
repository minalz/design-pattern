package cn.minalz.visitor;

import java.util.Random;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 00:47
 **/
public class Engineer extends Employee {

    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    // 工程师一年的代码数量
    public int getCodeLines() {
        return new Random().nextInt(10 * 10000);
    }
}
