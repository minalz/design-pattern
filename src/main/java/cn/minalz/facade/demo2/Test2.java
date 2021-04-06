package cn.minalz.facade.demo2;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-06 23:49
 **/
public class Test2 {

    public static void main(String[] args) {
        GiftInfo giftInfo = new GiftInfo("《Spring 5 核心原理》");
        GiftFacadeService giftFacadeService = new GiftFacadeService();
        giftFacadeService.exchange(giftInfo);
    }
}
