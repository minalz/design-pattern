package cn.minalz.proxy.staticproxy.demo2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-06 00:44
 **/
public class Test4 {

    public static void main(String[] args) {
        try {
            Order order = new Order();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2021/04/06");
            order.setCreateTime(date.getTime());

            OrderServiceStaticProxy orderService = new OrderServiceStaticProxy(new OrderService());
            orderService.createOrder(order);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    // 执行结果如下:
    /**
     * Proxy before method.
     * 静态代理类自动分配到【DB_2021】数据源处理数据
     * OrderService调用orderDao创建订单
     * OrderDao插入Order成功
     * Proxy after method.
     */
}
