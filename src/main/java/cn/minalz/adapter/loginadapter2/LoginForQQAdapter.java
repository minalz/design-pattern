package cn.minalz.adapter.loginadapter2;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 12:33
 **/
public class LoginForQQAdapter extends AbstractAdapter implements ILoginAdapter {

    @Override
    public boolean support(Object object) {
        return object instanceof LoginForQQAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        if (!support(adapter)) {
            return null;
        }
        return super.login(id, null);
    }
}
