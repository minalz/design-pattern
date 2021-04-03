package cn.minalz.designPrinciples.simple;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-03 00:10
 **/
public class SimpleTest {

    public static void main(String[] args) {
//        ICourse course = new JavaCourse();
//        course.record();

//        CourseFactory.create("java").record();

//        CourseFactory.create("cn.minalz.designPrinciples.simple.PythonCourse").record();

//        CourseFactory.create(PythonCourse.class).record();

        PythonCourseFactory pythonCourseFactory = new PythonCourseFactory();
        ICourse course = pythonCourseFactory.create();
        course.record();

        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        ICourse course1 = javaCourseFactory.create();
        course1.record();
    }
}
