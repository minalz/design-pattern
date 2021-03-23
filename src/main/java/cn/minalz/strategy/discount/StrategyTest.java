package cn.minalz.strategy.discount;

/**
 * @description:
 * @author: minalz
 * @date: 2021-03-18 00:31
 **/
public class StrategyTest {

    public static void main(String[] args) {
//        PromotionActivity couponActivity = new PromotionActivity(new CouponStrategy());
//        PromotionActivity cashbackActivity = new PromotionActivity(new CashbackStrategy());
//        couponActivity.execute();
//        cashbackActivity.execute();


//        PromotionActivity promotionActivity = null;
//        String promotionKey = "COUPON";
//        if(StringUtils.equals(promotionKey, "COUPON")){
//            promotionActivity = new PromotionActivity(new CouponStrategy());
//        }else if(StringUtils.equals(promotionKey, "CASHBACK")){
//            promotionActivity = new PromotionActivity(new CashbackStrategy());
//        }else if(StringUtils.equals(promotionKey, "GROUPBUY")){
//
//        }
//        promotionActivity.execute();


        String promotionKey = "COUPON";
        IPromotionStrategy strategy = PromotionStrategyFactory.getPromotionStrategy(promotionKey);
        strategy.doPromotion();


    }
}
