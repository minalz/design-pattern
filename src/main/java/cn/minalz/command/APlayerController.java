package cn.minalz.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 23:20
 **/
public class APlayerController {

    private List<IAction> actions = new ArrayList<>();

    public void addAction(IAction action) {
        actions.add(action);
    }

    public void execute(IAction action) {
        action.execute();
    }

    public void executes() {
        for (IAction action : actions) {
            action.execute();
        }
        actions.clear();
    }
}
