package cn.minalz.bridge.demo1;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 21:26
 **/
public abstract class Abstraction {

    protected IImplementor implementor;

    public Abstraction(IImplementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        this.implementor.operationImpl();
    }
}
