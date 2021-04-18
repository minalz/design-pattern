package cn.minalz.iterator;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 22:57
 **/
public interface CourseAggregate {

    void add(Course course);

    void remove(Course course);

    Iterator<Course> iterator();
}
