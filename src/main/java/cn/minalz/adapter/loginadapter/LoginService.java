package cn.minalz.adapter.loginadapter;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 12:19
 **/
public class LoginService {

    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg regist(String username, String password) {
        return new ResultMsg(200, "注册成功", new Member());
    }

    public ResultMsg login(String username, String password) {
        return new ResultMsg(200, "登录成功", new Member());
    }
}
