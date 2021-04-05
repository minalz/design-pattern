package cn.minalz.proxy.staticproxy.demo2;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-06 00:30
 **/
public class OrderDao {

    public int insert(Order order) {
        System.out.println("OrderDao插入Order成功");
        return 1;
    }
}
