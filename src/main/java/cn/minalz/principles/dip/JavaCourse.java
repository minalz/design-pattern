package cn.minalz.principles.dip;

/**
 * @description:
 * @author: minalz
 * @date: 2020-09-19 21:29
 **/
public class JavaCourse implements ICourse {

    @Override
    public void study() {
        System.out.println("张三在学习Java课程");
    }
}
