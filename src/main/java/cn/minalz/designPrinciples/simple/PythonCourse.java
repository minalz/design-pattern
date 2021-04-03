package cn.minalz.designPrinciples.simple;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-03 00:09
 **/
public class PythonCourse implements ICourse {

    @Override
    public void record() {
        System.out.println("录制Python课程");
    }
}
