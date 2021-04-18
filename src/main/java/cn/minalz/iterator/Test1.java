package cn.minalz.iterator;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 23:01
 **/
public class Test1 {

    public static void main(String[] args) {
        Course a = new Course("A课程");
        Course b = new Course("B课程");
        Course c = new Course("C课程");
        Course d = new Course("D课程");

        CourseAggregateImpl courseAggregate = new CourseAggregateImpl();
        courseAggregate.add(a);
        courseAggregate.add(b);
        courseAggregate.add(c);
        courseAggregate.add(d);

        System.out.println("----------课程列表----------");
        printCourses(courseAggregate);

        courseAggregate.remove(c);

        System.out.println("----------删除操作之后的课程列表-----------");
        printCourses(courseAggregate);

    }

    private static void printCourses(CourseAggregate courseAggregate) {
        Iterator<Course> iterator = courseAggregate.iterator();
        while (iterator.hasNext()) {
            Course course = iterator.next();
            System.out.println("《" + course.getName() +  "》");
        }
    }

    /**
     * ----------课程列表----------
     * 当前位置->0：《A课程》
     * 当前位置->1：《B课程》
     * 当前位置->2：《C课程》
     * 当前位置->3：《D课程》
     * ----------删除操作之后的课程列表-----------
     * 当前位置->0：《A课程》
     * 当前位置->1：《B课程》
     * 当前位置->2：《D课程》
     */
}
