package cn.minalz.visitor;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 00:56
 **/
public class CTOVisitor implements IVisitor {

    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师：" + engineer.name + ",代码航速：" + engineer.getCodeLines());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理：" + manager.name + ",产品数量：" + manager.getProducts());
    }
}
