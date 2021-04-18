package cn.minalz.command;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 23:19
 **/
public class PauseAction implements IAction {

    private APlayer aPlayer;

    public PauseAction(APlayer aPlayer) {
        this.aPlayer = aPlayer;
    }

    @Override
    public void execute() {
        aPlayer.pause();
    }
}
