package cn.minalz.delegate.example1;

/**
 * @description:
 * @author: minalz
 * @date: 2021-03-24 23:03
 **/
public class EmployeeA implements IEmployee {

    protected String goodAt = "编程";

    @Override
    public void doing(String task) {
        System.out.println("我是员工A，我擅长" + goodAt + ",现在开始做" + task + "工作");
    }
}
