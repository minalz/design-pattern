package cn.minalz.decorate.demo1;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-07 00:29
 **/
public class Test {

    public static void main(String[] args) {
        BatterCake batterCake = new BatterCake();
        System.out.println(batterCake.getMsg() + ",总价格：" + batterCake.getPrice());

        BatterCakeWithEgg batterCakeWithEgg = new BatterCakeWithEgg();
        System.out.println(batterCakeWithEgg.getMsg() + ",总价格：" + batterCakeWithEgg.getPrice());

        BatterCakeWithEggAndSausage batterCakeWithEggAndSausage = new BatterCakeWithEggAndSausage();
        System.out.println(batterCakeWithEggAndSausage.getMsg() + ",总价格：" + batterCakeWithEggAndSausage.getPrice());
    }

    /**
     * 煎饼,总价格：5
     * 煎饼1个鸡蛋,总价格：6
     * 煎饼1个鸡蛋1根香肠,总价格：8
     */
}
