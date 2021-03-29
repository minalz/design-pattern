package cn.minalz.template.jdbc;

import java.util.List;

/**
 * @description:
 * @author: minalz
 * @date: 2021-03-25 22:47
 **/
public class JdbcTest {

    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);
        List<?> result = memberDao.selectAll();
        System.out.println(result);
    }
}
