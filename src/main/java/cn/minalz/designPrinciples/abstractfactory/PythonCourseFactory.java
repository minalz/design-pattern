package cn.minalz.designPrinciples.abstractfactory;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-04 12:42
 **/
public class PythonCourseFactory extends CourseFactory {

    @Override
    protected INote createNote() {
        super.init();
        return new PythonNote();
    }

    @Override
    protected IVideo createVideo() {
        super.init();
        return new PythonVideo();
    }
}
