package cn.minalz.facade.demo2;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-06 23:43
 **/
public class PaymentService {

    public boolean pay(GiftInfo giftInfo) {
        System.out.println("支付" + giftInfo.getName() + "积分成功");
        return true;
    }
}
