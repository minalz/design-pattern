package cn.minalz.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @description: 员工业务报表类
 * @author: minalz
 * @date: 2021-04-18 00:50
 **/
public class BusinessReport {

    private List<Employee> employees = new LinkedList<>();

    public BusinessReport() {
        employees.add(new Manager("经理-A"));
        employees.add(new Manager("经理-B"));
        employees.add(new Engineer("工程师-A"));
        employees.add(new Engineer("工程师-B"));
        employees.add(new Manager("经理-C"));
        employees.add(new Engineer("工程师-C"));
    }

    /**
     * 为访问者展示报表
     * @param vistor
     */
    public void showReport(IVisitor vistor) {
        for (Employee employee : employees) {
            employee.accept(vistor);
        }
    }
}
