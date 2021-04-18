package cn.minalz.adapter.classadapter;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 12:06
 **/
public class Test1 {

    public static void main(String[] args) {
        PowerAdapter adapter = new PowerAdapter();
        adapter.outputDC5V();
    }

    /**
     * 类适配器
     * 输出电压：220V
     * 使用Adapter输入AC220V,输出DC5V
     */
}
