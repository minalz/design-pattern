package cn.minalz.adapter.interfaceadapter;

import cn.minalz.adapter.objectadapter.AC220;
import cn.minalz.adapter.objectadapter.DC5;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 12:04
 **/
public class PowerAdapter implements DC {

    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int output5V() {
        int adapterInput = ac220.output220V();
        int adapterOutput = adapterInput/44;
        System.out.println("使用Adapter输入AC" + adapterInput + "V,输出DC" + adapterOutput + "V");
        return adapterOutput;
    }

    @Override
    public int output12V() {
        return 0;
    }

    @Override
    public int output24V() {
        return 0;
    }

    @Override
    public int output36V() {
        return 0;
    }
}
