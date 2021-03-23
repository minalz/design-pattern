package cn.minalz.chain;

/**
 * @description:
 * @author: minalz
 * @date: 2021-03-23 22:52
 **/
public class MemberService {

    public void login(String loginName, String loginPass){

//        ValidateHandler validateHandler = new ValidateHandler();
//        LoginHandler loginHandler = new LoginHandler();
//        AuthHandler authHandler = new AuthHandler();
//
//        validateHandler.next(loginHandler);
//        loginHandler.next(authHandler);
//
//        validateHandler.doHandle(new Member(loginName, loginPass));

        Handler.Builder builder = new Handler.Builder();
        builder.addHandler(new ValidateHandler())
               .addHandler(new LoginHandler())
               .addHandler(new AuthHandler());

        builder.build().doHandle(new Member(loginName, loginPass));


    }
}
