package cn.minalz.state.demo1;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 23:43
 **/
public class Test1 {

    public static void main(String[] args) {
        AppContext context = new AppContext();
        context.favorite();
        context.comment("评论：状态模式 demo");
    }
}
