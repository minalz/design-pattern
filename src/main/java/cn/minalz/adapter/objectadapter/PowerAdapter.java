package cn.minalz.adapter.objectadapter;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 12:04
 **/
public class PowerAdapter implements DC5 {

    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int outputDC5V() {
        int adapterInput = ac220.output220V();
        int adapterOutput = adapterInput/44;
        System.out.println("使用Adapter输入AC" + adapterInput + "V,输出DC" + adapterOutput + "V");
        return adapterOutput;
    }
}
