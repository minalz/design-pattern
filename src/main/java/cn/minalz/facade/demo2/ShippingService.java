package cn.minalz.facade.demo2;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-06 23:44
 **/
public class ShippingService {

    public String delivery(GiftInfo giftInfo) {
        System.out.println(giftInfo.getName() + "进入物流系统");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
