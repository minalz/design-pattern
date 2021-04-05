package cn.minalz.builder.demo1;

/**
 * @description: 建造者 将复杂的构造过程封装起来，构造步骤由用户决定
 * @author: minalz
 * @date: 2021-04-05 23:43
 **/
public class CourseBuilder {

    private Course course = new Course();

    public void addName(String name) {
        course.setName(name);
    }

    public void addPpt(String ppt) {
        course.setPpt(ppt);
    }

    public void addVideo(String video) {
        course.setVideo(video);
    }

    public void addNote(String note) {
        course.setNote(note);
    }

    public void addHomework(String homework) {
        course.setHomework(homework);
    }

    public Course build() {
        return course;
    }
}
