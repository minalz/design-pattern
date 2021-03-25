package cn.minalz.template;

/**
 * @description:
 * @author: minalz
 * @date: 2021-03-25 21:23
 **/
public class JavaCourse extends AbstractCourse {

    private boolean needCheckHomework = false;

    public void setNeedCheckHomework(boolean needCheckHomework){
        this.needCheckHomework = needCheckHomework;
    }

    @Override
    protected void checkHomework() {
        System.out.println("检查Java作业");
    }

    @Override
    protected boolean needCheckHome() {
        return this.needCheckHomework;
    }
}
