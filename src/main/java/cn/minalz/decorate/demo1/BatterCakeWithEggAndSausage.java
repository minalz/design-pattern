package cn.minalz.decorate.demo1;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-07 00:27
 **/
public class BatterCakeWithEggAndSausage extends BatterCakeWithEgg {

    @Override
    protected String getMsg() {
        return super.getMsg() + "1根香肠";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }
}
