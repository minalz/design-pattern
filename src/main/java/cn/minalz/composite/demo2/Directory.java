package cn.minalz.composite.demo2;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-17 23:47
 **/
public abstract class Directory {

    protected String name;

    public Directory(String name) {
        this.name = name;
    }

    public abstract void show();
}
