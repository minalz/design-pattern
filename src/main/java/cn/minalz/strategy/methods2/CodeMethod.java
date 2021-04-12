package cn.minalz.strategy.methods2;

/**
 * 源代码 需要优化的代码
 */
public class CodeMethod {

    /**
     * 现在的需求是 将以下的code中if else 进行优化整合
     */
    /*public static void main(String[] args) {
        X001Service x001Service = new X001Service();
        X002Service x002Service = new X002Service();
        X003Service x003Service = new X003Service();
        String type = "X001";
        if ("X001".equals(type)) {
            x001Service.addX001();
        } else if ("X002".equals(type)) {
            x002Service.addX002();
        } else if ("X003".equals(type)) {
            x003Service.addX003();
        }
    }*/

    /**
     * 优化后的代码
     */
    public static void main(String[] args) {
        IStragety methodStrategy = new MethodStrategy();
        String type = "X002";
        methodStrategy.doAction(type);
    }
}
