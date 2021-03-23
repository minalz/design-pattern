package cn.minalz.chain;

import lombok.Data;

/**
 * @description:
 * @author: minalz
 * @date: 2021-03-23 22:40
 **/
@Data
public class Member {

    private String loginName;
    private String loginPass;
    private String roleName;

    public Member(String loginName, String loginPass) {
        this.loginName = loginName;
        this.loginPass = loginPass;
    }
}
