package cn.minalz.proxy.dynamic.jdk.demo2;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-06 00:31
 **/
public class OrderService implements IOrderService {

    private OrderDao orderDao;

    public OrderService() {
        // 如果使用Spring应该是自动注入的
        // 这里举例 直接用构造函数初始化
        orderDao = new OrderDao();
    }

    @Override
    public int createOrder(Order order) {
        System.out.println("OrderService调用orderDao创建订单");
        return orderDao.insert(order);
    }
}
