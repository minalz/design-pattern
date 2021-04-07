package cn.minalz.decorate.demo2;

/**
 * @description: 抽象装饰器
 * @author: minalz
 * @date: 2021-04-07 22:19
 **/
public abstract class BatterCakeDecorator extends BatterCake {

    // 静态代理
    private BatterCake batterCake;

    public BatterCakeDecorator(BatterCake batterCake) {
        this.batterCake = batterCake;
    }

    protected abstract void doSomething();

    @Override
    protected String getMsg() {
        return this.batterCake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.batterCake.getPrice();
    }
}
