package cn.minalz.strategy.taotie;

/**
 * @description: 点位处理测试类
 * @author: minalz
 * @date: 2021-03-23 23:51
 **/
public class PointTest {

    public static void main(String[] args) throws Exception {
        PointHandler pointHandler = PointStrategy.get(PointStrategy.WH_FACTORY);
        System.out.println(pointHandler.doHandle());
    }
}
