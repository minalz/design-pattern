package cn.minalz.facade.demo2;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-06 23:46
 **/
public class GiftFacadeService {

    private QualifyService qualifyService = new QualifyService();
    private PaymentService paymentService = new PaymentService();
    private ShippingService shippingService = new ShippingService();

    public void exchange(GiftInfo giftInfo) {
        if (qualifyService.isAvailable(giftInfo)) {
            // 资格校验通过
            if (paymentService.pay(giftInfo)) {
                // 如果支付积分成功
                String shippingOrderNo = shippingService.delivery(giftInfo);
                System.out.println("物流系统下单成功,订单号是:" + shippingOrderNo);
            }
        }
    }
}
