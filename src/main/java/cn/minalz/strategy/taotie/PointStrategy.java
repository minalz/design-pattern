package cn.minalz.strategy.taotie;

import cn.minalz.strategy.pay.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: minalz
 * @date: 2021-03-23 23:46
 **/
public class PointStrategy {

    public static final String WH_FACTORY = "WH_FACTORY";
    public static final String HZ_FACTORY = "HZ_FACTORY";
    public static final String DEFAULT_PAY = "WH_FACTORY";

    private static Map<String, PointHandler> strategy = new HashMap<>();

    static {
        strategy.put(WH_FACTORY, new WHPointHandler());
        strategy.put(HZ_FACTORY, new HZPointHandler());
    }

    public static PointHandler get(String payKey) throws Exception {
        if(!strategy.containsKey(payKey)){
            throw new Exception("不存在的工厂");
        }
        return strategy.get(payKey);
    }
}
