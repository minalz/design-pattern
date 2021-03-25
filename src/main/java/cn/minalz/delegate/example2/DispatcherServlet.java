package cn.minalz.delegate.example2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: minalz
 * @date: 2021-03-25 08:11
 **/
public class DispatcherServlet extends HttpServlet {

    private Map<String, Method> handlerMapping = new HashMap<>();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doDispatch(req, resp);
    }

    private void doDispatch(HttpServletRequest req, HttpServletResponse resp) {
        String url = req.getRequestURI();
        Method method = handlerMapping.get(url);
//        method.invoke();
    }

    @Override
    public void init() throws ServletException {
        try {
            handlerMapping.put("/web/getMemberById.json", MemberController.class.getMethod("getMemberById", new Class[]{String.class}));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
