package cn.minalz.strategy.methods2;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * 方法策略类
 */
public class MethodStrategy implements IStragety {

    // 统一保存调用方法的地方
    public Map<String, Consumer<?>> actionMap = new HashMap<>();

    {
        actionMap.put("X001", (someparams) -> {new X001Service().addX001();});
        actionMap.put("X002", (someparams) -> {new X002Service().addX002();});
        actionMap.put("X003", (someparams) -> {new X003Service().addX003();});
    }

    @Override
    public void doAction(String type) {
        actionMap.get(type).accept(null);
    }
}
