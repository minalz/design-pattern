package cn.minalz.proxy.staticproxy.demo2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description: 创建切换数据源的代理类
 * @author: minalz
 * @date: 2021-04-06 00:39
 **/
public class OrderServiceStaticProxy implements IOrderService {

    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

    private IOrderService orderService;

    public OrderServiceStaticProxy(IOrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public int createOrder(Order order) {
        before();
        Long time = order.getCreateTime();
        int dbRouter = Integer.parseInt(yearFormat.format(new Date()));
        System.out.println("静态代理类自动分配到【DB_" + dbRouter + "】数据源处理数据");
        DynamicDataSourceEntry.set(dbRouter);
        orderService.createOrder(order);
        after();
        return 0;
    }

    private void before() {
        System.out.println("Proxy before method.");
    }

    private void after() {
        System.out.println("Proxy after method.");
    }
}
