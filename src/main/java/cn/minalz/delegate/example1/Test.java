package cn.minalz.delegate.example1;

/**
 * @description:
 * @author: minalz
 * @date: 2021-03-24 23:10
 **/
public class Test {

    public static void main(String[] args) {
        new Boss().command("海报图", new Leader());
        new Boss().command("爬虫", new Leader());
        new Boss().command("卖手机", new Leader());
    }
}
