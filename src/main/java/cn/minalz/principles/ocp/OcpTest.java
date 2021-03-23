package cn.minalz.principles.ocp;

/**
 * @description:
 * @author: minalz
 * @date: 2020-09-19 21:15
 **/
public class OcpTest {

    public static void main(String[] args) {
        JavaDiscountCourse java = new JavaDiscountCourse(1, "java", 100.0);
        System.out.println("原价：" + java.getOriginPrice());
        System.out.println("折扣价：" + java.getPrice());
    }
}
