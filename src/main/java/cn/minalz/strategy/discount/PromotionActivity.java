package cn.minalz.strategy.discount;

/**
 * @description:
 * @author: minalz
 * @date: 2021-03-18 00:30
 **/
public class PromotionActivity {

    private IPromotionStrategy strategy;

    public PromotionActivity(IPromotionStrategy strategy){
        this.strategy = strategy;
    }

    public void execute(){
        strategy.doPromotion();
    }
}
