package cn.minalz.strategy.pay;

/**
 * @description:
 * @author: minalz
 * @date: 2021-03-18 22:57
 **/
public class PayTest {

    public static void main(String[] args) {
        Order order = new Order("1", "202103182257456", 355.7);
        System.out.println(order.pay(PayStrategy.UNION_PAY));
    }
}
