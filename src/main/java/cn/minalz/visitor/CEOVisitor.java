package cn.minalz.visitor;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 00:54
 **/
public class CEOVisitor implements IVisitor {

    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师：" + engineer.name + ",KPI：" + engineer.kpi);
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理：" + manager.name + ",KPI：" + manager.kpi + ",新产品的数量为：" + manager.getProducts());
    }
}
