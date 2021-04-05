package cn.minalz.builder.demo2;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-05 23:51
 **/
public class Test2 {

    public static void main(String[] args) {
        CourseBuilder builder = new CourseBuilder()
                    .addName("设计模式")
                    .addPpt("【PPT课件】")
                    .addVideo("【回放视频】")
                    .addNote("【课程笔记】")
                    .addHomework("【课后作业】");

        System.out.println(builder.build());
    }
}
