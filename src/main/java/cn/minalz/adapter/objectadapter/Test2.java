package cn.minalz.adapter.objectadapter;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 12:06
 **/
public class Test2 {

    public static void main(String[] args) {
        PowerAdapter adapter = new PowerAdapter(new AC220());
        adapter.outputDC5V();
    }

    /**
     * 对象适配器
     * 输出电压：220V
     * 使用Adapter输入AC220V,输出DC5V
     */
}
