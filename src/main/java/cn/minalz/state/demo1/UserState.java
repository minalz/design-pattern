package cn.minalz.state.demo1;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 23:30
 **/
public abstract class UserState {

    protected AppContext context;

    public void setContext(AppContext context) {
        this.context = context;
    }

    public abstract void favorite();

    public abstract void comment(String comment);
}
