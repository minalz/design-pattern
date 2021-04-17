package cn.minalz.visitor;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 00:45
 **/
public interface IVisitor {

    // 访问工程师类型
    void visit(Engineer engineer);

    // 访问经理类型
    void visit(Manager manager);
}
