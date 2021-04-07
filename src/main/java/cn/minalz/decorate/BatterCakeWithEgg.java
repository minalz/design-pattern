package cn.minalz.decorate;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-07 00:24
 **/
public class BatterCakeWithEgg extends BatterCake {

    @Override
    protected String getMsg() {
        return super.getMsg() + "1个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}
