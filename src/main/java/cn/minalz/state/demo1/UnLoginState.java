package cn.minalz.state.demo1;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 23:33
 **/
public class UnLoginState extends UserState {

    @Override
    public void favorite() {
        this.switch2Login();
        this.context.getState().favorite();
    }

    @Override
    public void comment(String comment) {
        this.switch2Login();
        this.context.getState().comment(comment);
    }

    private void switch2Login() {
        System.out.println("跳转到登录页面！");
        this.context.setState(this.context.STATE_LOGIN);
    }
}
