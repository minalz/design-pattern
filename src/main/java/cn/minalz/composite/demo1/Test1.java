package cn.minalz.composite.demo1;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-17 23:39
 **/
public class Test1 {

    public static void main(String[] args) {
        System.out.println("===========透明组合模式=============");

        CourseComponent javaBase = new Course("Java入门课程", 10);
        CourseComponent ai = new Course("人工只能", 20);

        CoursePackage coursePackage = new CoursePackage("Java高级", 2);

        CourseComponent design = new Course("Java设计模式", 10);
        CourseComponent source = new Course("源码分析", 30);
        CourseComponent softskills = new Course("软技能", 40);

        coursePackage.addChild(design);
        coursePackage.addChild(source);
        coursePackage.addChild(softskills);

        CoursePackage catalog = new CoursePackage("课程祝目录", 1);
        catalog.addChild(javaBase);
        catalog.addChild(ai);
        catalog.addChild(coursePackage);

        catalog.print();

    }

    /**
     * ===========透明组合模式=============
     * 课程祝目录
     *    +-Java入门课程(¥10.0元)
     *    +-人工只能(¥20.0元)
     *    +-Java高级
     *       +--Java设计模式(¥10.0元)
     *       +--源码分析(¥30.0元)
     *       +--软技能(¥40.0元)
     */
}
