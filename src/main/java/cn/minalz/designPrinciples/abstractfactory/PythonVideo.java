package cn.minalz.designPrinciples.abstractfactory;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-04 12:39
 **/
public class PythonVideo implements IVideo {

    @Override
    public void record() {
        System.out.println("录制Python视频");
    }
}
