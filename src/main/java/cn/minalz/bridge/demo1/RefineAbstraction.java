package cn.minalz.bridge.demo1;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 22:30
 **/
public class RefineAbstraction extends Abstraction {

    public RefineAbstraction(IImplementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("refined operation");
    }
}
