package cn.minalz.strategy.taotie;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @description: 点位处理
 * @author: minalz
 * @date: 2021-03-23 23:21
 **/
public abstract class PointHandler<T> {

    protected SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public abstract Date point_701();
    public abstract Date point_703();
    public abstract Date point_720();
    public abstract Date point_726();
    public abstract Date point_727();

    public abstract List<String> getPointRule();

    public abstract Date doHandle();
}
