package cn.minalz.designPrinciples;

import java.sql.ResultSet;
import java.util.List;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-01 23:43
 **/
public interface IRowMapper<T> {

    // 处理结果集
    T rowMapper(ResultSet rs) throws Exception;
}
