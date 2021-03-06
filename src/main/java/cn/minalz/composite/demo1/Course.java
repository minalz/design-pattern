package cn.minalz.composite.demo1;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-17 23:30
 **/
public class Course extends CourseComponent {

    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CourseComponent catalogComponent) {
        return this.name;
    }

    @Override
    public double getPrice(CourseComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println(name + "(¥" + price + "元)");
    }
}
