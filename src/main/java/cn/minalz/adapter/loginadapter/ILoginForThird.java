package cn.minalz.adapter.loginadapter;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-18 12:21
 **/
public interface ILoginForThird {

    ResultMsg loginForQQ(String opid);

    ResultMsg loginForWechat(String opid);

    ResultMsg loginForToken(String token);

    ResultMsg loginForTelphone(String phone, String code);
}
