package cn.minalz.adapter.loginadapter;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 12:25
 **/
public class Test4 {

    public static void main(String[] args) {
        LoginForThirdAdapter adapter = new LoginForThirdAdapter();
        System.out.println(adapter.login("Bob", "123"));
        System.out.println(adapter.loginForQQ("sfafsafsfdffwedsfd"));
        System.out.println(adapter.loginForWechat("afigjkjkewkfjsdk"));
    }

    /**
     * ResultMsg(code=200, msg=登录成功, data=Member(username=null, password=null, mid=null, info=null))
     * ResultMsg(code=200, msg=登录成功, data=Member(username=null, password=null, mid=null, info=null))
     * ResultMsg(code=200, msg=登录成功, data=Member(username=null, password=null, mid=null, info=null))
     */
}
