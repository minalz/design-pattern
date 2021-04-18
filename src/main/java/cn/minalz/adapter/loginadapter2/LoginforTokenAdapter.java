package cn.minalz.adapter.loginadapter2;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 12:41
 **/
public class LoginforTokenAdapter extends AbstractAdapter implements ILoginAdapter {

    @Override
    public boolean support(Object object) {
        return object instanceof LoginforTokenAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return super.login(id ,null);
    }
}
