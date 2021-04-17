package cn.minalz.observe.demo3;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 00:33
 **/
public class Test1 {

    public static void main(String[] args) {
        MouseEventListener listener = new MouseEventListener();

        Mouse mouse = new Mouse();
        mouse.addListener(MouseEventType.ON_CLICK, listener);
        mouse.addListener(MouseEventType.ON_MOVE, listener);

        mouse.click();
        mouse.move();
    }

    /**
     * 调用单击方法
     * ===========触发鼠标单击事件============
     * cn.minalz.observe.demo3.Event@54bedef2
     * 调用移动方法
     * ===========触发鼠标移动事件============
     * cn.minalz.observe.demo3.Event@5caf905d
     */
}
