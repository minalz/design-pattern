package cn.minalz.decorate.demo2;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-07 22:23
 **/
public class SuasageDecorator extends BatterCakeDecorator {

    public SuasageDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "+ 1根香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
