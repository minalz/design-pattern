package cn.minalz.command;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 23:19
 **/
public class SpeedAction implements IAction {

    private APlayer aPlayer;

    public SpeedAction(APlayer aPlayer) {
        this.aPlayer = aPlayer;
    }

    @Override
    public void execute() {
        aPlayer.speed();
    }
}
