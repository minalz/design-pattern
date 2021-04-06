package cn.minalz.facade.demo2;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-06 23:42
 **/
public class QualifyService {

    public boolean isAvailable(GiftInfo giftInfo) {
        System.out.println("校验" + giftInfo.getName() + "积分资格通过,库存通过");
        return true;
    }
}
