package cn.minalz.observe.demo3;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 00:21
 **/
public interface MouseEventType {

    // 单机
    String ON_CLICK = "click";

    // 双击
    String ON_DOUBLE_CLICK = "doubleClick";

    // 弹起
    String ON_UP = "up";

    // 按下
    String ON_DOWN = "down";

    // 移动
    String ON_MOVE = "move";

    // 滚动
    String ON_WHEEL = "wheel";

    // 悬停
    String ON_OVER = "over";

    // 失焦
    String ON_BLUR = "blur";

    // 获焦
    String ON_FOCUS = "focus";
}
