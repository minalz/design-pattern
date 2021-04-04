package cn.minalz.designPrinciples.abstractfactory;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-04 12:40
 **/
public class JavaNote implements INote {

    @Override
    public void edit() {
        System.out.println("编写Java笔记");
    }
}
