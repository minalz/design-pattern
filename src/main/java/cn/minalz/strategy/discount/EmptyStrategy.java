package cn.minalz.strategy.discount;

/**
 * @description:
 * @author: minalz
 * @date: 2021-03-18 00:29
 **/
public class EmptyStrategy implements IPromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("无优惠");
    }
}
