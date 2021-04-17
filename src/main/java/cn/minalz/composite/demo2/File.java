package cn.minalz.composite.demo2;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-17 23:47
 **/
public class File extends Directory {

    public File(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println(this.name);
    }
}
