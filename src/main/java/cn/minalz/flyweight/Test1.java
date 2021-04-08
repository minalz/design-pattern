package cn.minalz.flyweight;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-08 23:40
 **/
public class Test1 {

    public static void main(String[] args) {
        ITicket ticket = TicketFactory.queryTicket("上海南", "北京");
        ticket.showInfo("软卧");
    }
}
