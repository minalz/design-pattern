package cn.minalz.principles.ocp;

/**
 * @description:
 * @author: minalz
 * @date: 2020-09-19 21:06
 **/
public class JavaCourse implements ICourse {
    private Integer id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
