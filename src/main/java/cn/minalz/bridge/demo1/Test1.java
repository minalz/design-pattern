package cn.minalz.bridge.demo1;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 22:31
 **/
public class Test1 {

    public static void main(String[] args) {
        // 创建一个实现化角色
        IImplementor imp = new ConcreteImplementorA();
        // 创刊一个抽象化角色，聚合实现
        RefineAbstraction abs = new RefineAbstraction(imp);
        // 执行操作
        abs.operation();
    }

    /**
     * I'm concreteImplementor A
     * refined operation
     */
}
