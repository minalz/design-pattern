package cn.minalz.flyweight.demo2;

import java.util.Random;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-08 23:36
 **/
public class TrainTicket implements ITicket {

    private String from;
    private String to;
    private int price;

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showInfo(String bunk) {
        this.price = new Random().nextInt(500);
        System.out.println(String.format("%s->%s: %s价格: %s元", this.from, this.to, bunk, this.price));
    }
}
