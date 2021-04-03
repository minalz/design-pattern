package cn.minalz.designPrinciples.simple;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-03 00:41
 **/
public class JavaCourseFactory implements ICourseFactory {

    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
