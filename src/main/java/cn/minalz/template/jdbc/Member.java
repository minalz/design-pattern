package cn.minalz.template.jdbc;

import lombok.Data;

/**
 * @description:
 * @author: minalz
 * @date: 2021-03-25 22:41
 **/
@Data
public class Member {

    private String username;
    private String password;
    private String nickname;
    private int age;
    private String addr;
}
