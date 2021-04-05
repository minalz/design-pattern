package cn.minalz.builder.demo1;

import lombok.Data;

/**
 * @description: 建造者模式 课程实体类
 * @author: minalz
 * @date: 2021-04-05 23:41
 **/
@Data
public class Course {

    private String name;
    private String ppt;
    private String video;
    private String note;
    private String homework;
}
