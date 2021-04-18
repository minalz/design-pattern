package cn.minalz.adapter.loginadapter2;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 12:35
 **/
public class LoginForTelAdapter extends AbstractAdapter implements ILoginAdapter{

    @Override
    public boolean support(Object object) {
        return object instanceof LoginForTelAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return super.login(id, null);
    }
}
