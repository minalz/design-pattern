package cn.minalz.visitor;

import java.util.Random;

/**
 * @description: 员工基类
 * @author: minalz
 * @date: 2021-04-18 00:43
 **/
public abstract class Employee {

    public String name;
    // 员工KPI
    public int kpi;

    public Employee(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }

    // 核心方法，接受访问者的访问
    public abstract void accept(IVisitor visitor);
}
