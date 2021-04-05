package cn.minalz.builder.demo2;

import cn.minalz.builder.demo1.Course;
import lombok.Data;

/**
 * @description: 建造者 将复杂的构造过程封装起来，构造步骤由用户决定
 * @author: minalz
 * @date: 2021-04-05 23:43
 **/
public class CourseBuilder {

    private Course course = new Course();

    public CourseBuilder addName(String name) {
        course.setName(name);
        return this;
    }

    public CourseBuilder addPpt(String ppt) {
        course.setPpt(ppt);
        return this;
    }

    public CourseBuilder addVideo(String video) {
        course.setVideo(video);
        return this;
    }

    public CourseBuilder addNote(String note) {
        course.setNote(note);
        return this;
    }

    public CourseBuilder addHomework(String homework) {
        course.setHomework(homework);
        return this;
    }

    public Course build() {
        return course;
    }

    @Data
    public class Course {

        private String name;
        private String ppt;
        private String video;
        private String note;
        private String homework;
    }
}
