package cn.minalz.template.course;

/**
 * @description:
 * @author: minalz
 * @date: 2021-03-25 21:26
 **/
public class PythonCourse extends AbstractCourse {

    @Override
    protected void checkHomework() {
        System.out.println("检查Python作业");
    }
}
