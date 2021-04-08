package cn.minalz.flyweight.demo2;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-08 23:40
 **/
public class Test2 {

    public static void main(String[] args) {
        ITicket ticket = TicketFactory.queryTicket("上海南", "北京");
        ticket.showInfo("软卧");

        ITicket ticket2 = TicketFactory.queryTicket("上海南", "北京");
        ticket2.showInfo("软卧");

        ITicket ticket3 = TicketFactory.queryTicket("上海南", "北京");
        ticket3.showInfo("硬座");
    }

    /**
     * 首次查询，创建对象：上海南->北京
     * 上海南->北京: 软卧价格: 74元
     * 使用缓存：上海南->北京
     * 上海南->北京: 软卧价格: 99元
     * 使用缓存：上海南->北京
     * 上海南->北京: 硬座价格: 395元
     */
}
