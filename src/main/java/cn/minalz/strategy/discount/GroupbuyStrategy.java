package cn.minalz.strategy.discount;

/**
 * @description:
 * @author: minalz
 * @date: 2021-03-18 00:28
 **/
public class GroupbuyStrategy implements IPromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("5人成团，可以优惠哈");
    }
}
