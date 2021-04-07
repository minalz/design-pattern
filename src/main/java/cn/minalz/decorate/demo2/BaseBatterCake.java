package cn.minalz.decorate.demo2;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-07 22:18
 **/
public class BaseBatterCake extends BatterCake {

    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
