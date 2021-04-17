package cn.minalz.visitor;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 00:57
 **/
public class Test1 {

    public static void main(String[] args) {
        // 构建报表
        BusinessReport report = new BusinessReport();
        System.out.println("============CEO看报表=============");
        report.showReport(new CEOVisitor());

        System.out.println("============CTO看报表=============");
        report.showReport(new CTOVisitor());
    }

    /**
     * ============CEO看报表=============
     * 经理：经理-A,KPI：5,新产品的数量为：3
     * 经理：经理-B,KPI：7,新产品的数量为：6
     * 工程师：工程师-A,KPI：6
     * 工程师：工程师-B,KPI：4
     * 经理：经理-C,KPI：5,新产品的数量为：2
     * 工程师：工程师-C,KPI：1
     * ============CTO看报表=============
     * 经理：经理-A,产品数量：7
     * 经理：经理-B,产品数量：0
     * 工程师：工程师-A,代码航速：18120
     * 工程师：工程师-B,代码航速：4922
     * 经理：经理-C,产品数量：3
     * 工程师：工程师-C,代码航速：92066
     */
}
