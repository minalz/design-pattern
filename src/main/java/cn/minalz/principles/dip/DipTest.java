package cn.minalz.principles.dip;

/**
 * @description:
 * @author: minalz
 * @date: 2020-09-19 21:25
 **/
public class DipTest {

    public static void main(String[] args) {
//        ZhangSan zhangSan = new ZhangSan();
//        zhangSan.studyJavaCourse();
//        zhangSan.studyPythonCourse();

        ZhangSan2 zhangSan2 = new ZhangSan2();
        zhangSan2.study(new JavaCourse());
        zhangSan2.study(new PythonCourse());

    }
}
