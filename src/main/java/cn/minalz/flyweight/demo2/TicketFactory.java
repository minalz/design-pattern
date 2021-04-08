package cn.minalz.flyweight.demo2;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-08 23:39
 **/
public class TicketFactory {

    private static Map<String, ITicket> ticketPool = new ConcurrentHashMap<>();

    public static ITicket queryTicket(String from, String to) {
        String key = from + "->" + to;
        if (ticketPool.containsKey(key)) {
            System.out.println("使用缓存：" + key);
            return ticketPool.get(key);
        }
        System.out.println("首次查询，创建对象：" + key);
        TrainTicket ticket = new TrainTicket(from, to);
        ticketPool.put(key, ticket);
        return new TrainTicket(from ,to);
    }
}
