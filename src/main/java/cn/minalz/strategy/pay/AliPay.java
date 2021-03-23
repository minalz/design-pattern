package cn.minalz.strategy.pay;

/**
 * @description:
 * @author: minalz
 * @date: 2021-03-18 22:43
 **/
public class AliPay extends Payment {
    @Override
    public String getName() {
        return "支付宝支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 900;
    }
}
