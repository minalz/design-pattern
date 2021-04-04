package cn.minalz.designPrinciples.abstractfactory;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-04 12:43
 **/
public class Test {

    public static void main(String[] args) {
        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        javaCourseFactory.createNote().edit();
        javaCourseFactory.createVideo().record();
    }
}
