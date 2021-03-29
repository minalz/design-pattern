package cn.minalz.template.jdbc;

import java.sql.ResultSet;

/**
 * @description:
 * @author: minalz
 * @date: 2021-03-25 22:27
 **/
public interface RowMapper<T> {

    T mapRow(ResultSet rs, int rowNum) throws Exception;
}
