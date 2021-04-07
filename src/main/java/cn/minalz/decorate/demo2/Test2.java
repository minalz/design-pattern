package cn.minalz.decorate.demo2;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-07 22:24
 **/
public class Test2 {

    public static void main(String[] args) {
        BatterCake batterCake;
        batterCake = new BaseBatterCake();
        System.out.println(batterCake.getMsg() + ",总价格：" + batterCake.getPrice());

        EggDecorator eggDecorator = new EggDecorator(batterCake);
        System.out.println(eggDecorator.getMsg() + ",总价格：" + eggDecorator.getPrice());

        SuasageDecorator suasageDecorator = new SuasageDecorator(eggDecorator);
        System.out.println(suasageDecorator.getMsg() + ",总价格：" + suasageDecorator.getPrice());

        EggDecorator eggDecorator1 = new EggDecorator(suasageDecorator);
        System.out.println(eggDecorator1.getMsg() + ",总价格：" + eggDecorator1.getPrice());

        /**
         * 装饰器模式和静态代理最大区别就是职责不通
         *
         * 静态代理一个类只能满足一个，写死了
         * 而装饰器可以做功能增强，同一个职责变得不一样，可以动态扩展
         *
         * 装饰器更多考虑是扩展
         */

    }

    /**
     * 煎饼,总价格：5
     * 煎饼+ 1个鸡蛋,总价格：6
     * 煎饼+ 1个鸡蛋+ 1根香肠,总价格：8
     * 煎饼+ 1个鸡蛋+ 1根香肠+ 1个鸡蛋,总价格：9
     */
}
