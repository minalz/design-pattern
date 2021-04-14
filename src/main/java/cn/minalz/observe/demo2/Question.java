package cn.minalz.observe.demo2;

import lombok.Data;

/**
 * @description: app广场上展示的问题
 * @author: minalz
 * @date: 2021-04-14 23:34
 **/
@Data
public class Question {

    private String username;
    private String content;

    public Question(String username, String content) {
        this.username = username;
        this.content = content;
    }
}
