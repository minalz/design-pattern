package cn.minalz.template;

/**
 * @description: 模版方法抽象类
 * @author: minalz
 * @date: 2021-03-25 08:31
 **/
public abstract class AbstractCourse {

    public final void createCourse(){

        // 1.发布预习资料
        postPreResource();
    }
}
