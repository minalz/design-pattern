package cn.minalz.command;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 23:22
 **/
public class Test1 {

    public static void main(String[] args) {
        APlayer player = new APlayer();
        APlayerController controller = new APlayerController();
        controller.execute(new PlayAction(player));

        controller.addAction(new PauseAction(player));
        controller.addAction(new PlayAction(player));
        controller.addAction(new StopAction(player));
        controller.addAction(new SpeedAction(player));

        controller.executes();
    }
}
