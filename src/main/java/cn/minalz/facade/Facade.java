package cn.minalz.facade;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-06 23:25
 **/
public class Facade {

    private SubSystemA a = new SubSystemA();
    private SubSystemB b = new SubSystemB();
    private SubSystemC c = new SubSystemC();

    public void doA() {
        this.a.doA();
    }

    public void doB() {
        this.b.doB();
    }

    public void doC() {
        this.c.doC();
    }
}
