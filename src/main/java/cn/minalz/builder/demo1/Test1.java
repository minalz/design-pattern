package cn.minalz.builder.demo1;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-05 23:45
 **/
public class Test1 {

    public static void main(String[] args) {
        CourseBuilder builder = new CourseBuilder();
        builder.addName("设计模式");
        builder.addPpt("【PPT课件】");
        builder.addVideo("【回放视频】");
        builder.addNote("【课程笔记】");
        builder.addHomework("【课后作业】");

        System.out.println(builder.build());
    }
}
