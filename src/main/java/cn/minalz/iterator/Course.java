package cn.minalz.iterator;

import lombok.Data;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 22:56
 **/
@Data
public class Course {

    private String name;

    public Course(String name) {
        this.name = name;
    }
}
