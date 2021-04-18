package cn.minalz.state.demo1;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 23:33
 **/
public class LoginInState extends UserState {

    @Override
    public void favorite() {
        System.out.println("收藏成功！");
    }

    @Override
    public void comment(String comment) {
        System.out.println(comment);
    }
}
