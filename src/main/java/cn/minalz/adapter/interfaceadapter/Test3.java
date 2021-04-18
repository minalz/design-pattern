package cn.minalz.adapter.interfaceadapter;

import cn.minalz.adapter.objectadapter.AC220;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 12:13
 **/
public class Test3 {

    public static void main(String[] args) {
        DC adapter = new PowerAdapter(new AC220());
        adapter.output5V();
    }

    /**
     * 接口适配器
     * 输出电压：220V
     * 使用Adapter输入AC220V,输出DC5V
     */
}
