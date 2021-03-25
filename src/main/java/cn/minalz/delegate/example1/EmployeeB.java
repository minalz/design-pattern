package cn.minalz.delegate.example1;

/**
 * @description:
 * @author: minalz
 * @date: 2021-03-24 23:03
 **/
public class EmployeeB implements IEmployee {

    protected String goodAt = "平面设计";

    @Override
    public void doing(String task) {
        System.out.println("我是员工B，我擅长" + goodAt + ",现在开始做" + task + "工作");
    }
}
