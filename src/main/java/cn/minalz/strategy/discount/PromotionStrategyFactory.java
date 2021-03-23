package cn.minalz.strategy.discount;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @description:
 * @author: minalz
 * @date: 2021-03-18 00:40
 **/
public class PromotionStrategyFactory {

    private static Map<String,IPromotionStrategy> PROMOTIONS = new HashMap<>();

    static {
        PROMOTIONS.put(PromotionKey.COUPON, new CouponStrategy());
        PROMOTIONS.put(PromotionKey.CASHBACK, new CashbackStrategy());
        PROMOTIONS.put(PromotionKey.GROUPBY, new GroupbuyStrategy());
    }

    private static final IPromotionStrategy EMPTY = new EmptyStrategy();

    private PromotionStrategyFactory() {

    }

    public static IPromotionStrategy getPromotionStrategy(String promotionKey){
        IPromotionStrategy strategy = PROMOTIONS.get(promotionKey);
        return strategy == null ? EMPTY : strategy;
    }

    private interface PromotionKey {
        String COUPON = "COUPON";
        String CASHBACK = "CASHBACK";
        String GROUPBY = "GROUPBY";
    }

    public static Set<String> getPromotionKeys(){
        return PROMOTIONS.keySet();
    }
}


