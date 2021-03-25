package cn.minalz.delegate.example1;

/**
 * @description:
 * @author: minalz
 * @date: 2021-03-24 23:09
 **/
public class Boss {

    public void command(String task, Leader leader){
        leader.doing(task);
    }
}
