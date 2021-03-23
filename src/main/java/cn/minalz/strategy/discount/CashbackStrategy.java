package cn.minalz.strategy.discount;

/**
 * @description:
 * @author: minalz
 * @date: 2021-03-18 00:27
 **/
public class CashbackStrategy implements IPromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("返现，直接打款到支付宝账号");
    }
}
