package cn.minalz.principles.ocp;

/**
 * @description:
 * @author: minalz
 * @date: 2020-09-19 21:10
 **/
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice(){
        return super.getPrice();
    }

    public Double getPrice(){
        return super.getPrice()*0.61;
    }
}
