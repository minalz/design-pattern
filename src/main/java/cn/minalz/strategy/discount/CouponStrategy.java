package cn.minalz.strategy.discount;

/**
 * @description:
 * @author: minalz
 * @date: 2021-03-18 00:25
 **/
public class CouponStrategy implements IPromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("使用优惠券折扣");
    }
}
