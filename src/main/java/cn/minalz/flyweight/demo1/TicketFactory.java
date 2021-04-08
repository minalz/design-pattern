package cn.minalz.flyweight.demo1;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-08 23:39
 **/
public class TicketFactory {

    public static ITicket queryTicket(String from, String to) {
        return new TrainTicket(from ,to);
    }
}
