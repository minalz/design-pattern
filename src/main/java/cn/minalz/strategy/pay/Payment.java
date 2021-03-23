package cn.minalz.strategy.pay;

/**
 * @description:
 * @author: minalz
 * @date: 2021-03-18 22:40
 **/
public abstract class Payment {

    public abstract String getName();

    public MsgResult pay(String uid, double amount){
        if(queryBalance(uid) < amount){
            return new MsgResult(500, "支付失败", "余额不足");
        }
        return new MsgResult(200, "支付成功", "支付金额" + amount);
    }

    protected abstract double queryBalance(String uid);
}
