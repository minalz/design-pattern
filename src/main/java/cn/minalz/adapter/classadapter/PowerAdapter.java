package cn.minalz.adapter.classadapter;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 12:04
 **/
public class PowerAdapter extends AC220 implements DC5 {

    @Override
    public int outputDC5V() {
        int adapterInput = super.output220V();
        int adapterOutput = adapterInput/44;
        System.out.println("使用Adapter输入AC" + adapterInput + "V,输出DC" + adapterOutput + "V");
        return adapterOutput;
    }
}
