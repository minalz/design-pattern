package cn.minalz.chain;

import org.apache.commons.lang3.StringUtils;

/**
 * @description:
 * @author: minalz
 * @date: 2021-03-23 22:46
 **/
public class ValidateHandler extends Handler {

    @Override
    public void doHandle(Member member) {
        if(StringUtils.isEmpty(member.getLoginName()) || StringUtils.isEmpty(member.getLoginPass())){
            System.out.println("用户名或者密码为空");
            return;
        }
        System.out.println("用户名和密码校验成功，可以往下执行");
        chain.doHandle(member);
    }
}
