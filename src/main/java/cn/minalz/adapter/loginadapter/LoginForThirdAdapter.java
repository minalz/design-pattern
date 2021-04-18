package cn.minalz.adapter.loginadapter;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 12:23
 **/
public class LoginForThirdAdapter extends LoginService implements ILoginForThird {

    @Override
    public ResultMsg loginForQQ(String opid) {
        return loginForRegist(opid, null);
    }

    @Override
    public ResultMsg loginForWechat(String opid) {
        return loginForRegist(opid, null);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return loginForRegist(token, null);
    }

    @Override
    public ResultMsg loginForTelphone(String phone, String code) {
        return loginForRegist(phone, null);
    }

    private ResultMsg loginForRegist(String username, String password) {
        if (null == password) {
            password = "THIRD_EMPTY";
        }
        super.regist(username, password);
        return super.login(username, password);
    }
}
