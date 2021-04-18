package cn.minalz.adapter.loginadapter2;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 12:36
 **/
public class LoginForWechatAdapter extends AbstractAdapter implements ILoginAdapter {

    @Override
    public boolean support(Object object) {
        return object instanceof LoginForWechatAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return super.login(id ,null);
    }
}
