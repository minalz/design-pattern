package cn.minalz.delegate.example1;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: minalz
 * @date: 2021-03-24 23:05
 **/
public class Leader implements IEmployee {

    private Map<String, IEmployee> employee = new HashMap<>();

    public Leader() {
        employee.put("爬虫", new EmployeeA());
        employee.put("海报图", new EmployeeB());
    }

    @Override
    public void doing(String task) {
        if(!employee.containsKey(task)){
            System.out.println("这个任务" + task + "超出我的能力范围");
            return;
        }
        employee.get(task).doing(task);
    }
}
