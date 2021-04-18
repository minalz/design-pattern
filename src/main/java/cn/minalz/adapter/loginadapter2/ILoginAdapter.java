package cn.minalz.adapter.loginadapter2;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 12:31
 **/
public interface ILoginAdapter {

    boolean support(Object object);
    ResultMsg login(String id, Object adapter);
}
