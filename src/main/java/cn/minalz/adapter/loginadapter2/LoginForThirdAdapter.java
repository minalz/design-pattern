package cn.minalz.adapter.loginadapter2;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 12:38
 **/
public class LoginForThirdAdapter implements ILoginForThird {

    @Override
    public ResultMsg loginForQQ(String opid) {
        return processLogin(opid, LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForWechat(String opid) {
        return processLogin(opid, LoginForWechatAdapter.class);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return processLogin(token, LoginforTokenAdapter.class);
    }

    @Override
    public ResultMsg loginForTelphone(String phone, String code) {
        return processLogin(phone, LoginForTelAdapter.class);
    }

    private ResultMsg processLogin(String id, Class<? extends ILoginAdapter> clazz) {
        try {
            ILoginAdapter adapter = clazz.newInstance();
            if (adapter.support(adapter)) {
                return adapter.login(id, adapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
