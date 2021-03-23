package cn.minalz.strategy.taotie;

import java.awt.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @description: 武汉工厂点位处理
 * @author: minalz
 * @date: 2021-03-23 23:28
 **/
public class WHPointHandler extends PointHandler {

    @Override
    public Date point_701() {
        try {
            Date date = sdf.parse("2021-07-01 00:07:01");
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Date point_703() {
        try {
            Date date = sdf.parse("2021-07-03 00:07:03");
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Date point_720() {
        try {
            Date date = sdf.parse("2021-07-20 00:07:20");
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Date point_726() {
        try {
            Date date = sdf.parse("2021-07-26 00:07:26");
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Date point_727() {
        try {
            Date date = sdf.parse("2021-07-27 00:07:27");
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<String> getPointRule() {
        List<String> rule = new ArrayList<>(5);
        rule.add("701");
        rule.add("703");
        rule.add("720");
        rule.add("726");
        rule.add("727");
        return rule;
    }

    @Override
    public Date doHandle() {
        // 执行规则 点位是如何执行的
        List<String> rule = this.getPointRule();
        // 根据rule 执行对应的方法
        try {
            Date date = sdf.parse("2021-07-30 00:00:00");
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
