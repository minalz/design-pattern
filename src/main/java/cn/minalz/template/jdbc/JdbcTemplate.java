package cn.minalz.template.jdbc;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: minalz
 * @date: 2021-03-25 22:27
 **/
public abstract class JdbcTemplate {

    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public final List<?> executeQuery(String sql, RowMapper<?> rowMapper, Object[] values){
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            // 1. 获取连接
            conn = getConnection();
            // 2. 创建语句集
            pstm = createPrepareStatement(conn, sql);
            // 3. 执行语句集
            rs = executeQuery(pstm, values);
            // 4. 处理结果集
            List<?> result = parseResultSet(rs, rowMapper);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // 5. 关闭结果集
                if (rs != null) {
                    rs.close();
                }
                // 6. 关闭语句集
                if (pstm != null) {
                    pstm.close();
                }
                // 7. 关闭连接
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public List<?> parseResultSet(ResultSet rs, RowMapper<?> rowMapper) throws Exception{
        List<Object> result = new ArrayList<>();
        int rowNum = 0;
        while (rs.next()) {
            result.add(rowMapper.mapRow(rs, rowNum++));
        }
        return result;
    }

    public ResultSet executeQuery(PreparedStatement pstm, Object[] values) throws SQLException {
        for (int i = 0; i < values.length; i++) {
            pstm.setObject(i, values[i]);
        }
        return pstm.executeQuery();
    }

    private PreparedStatement createPrepareStatement(Connection conn, String sql) throws SQLException {
        return conn.prepareStatement(sql);
    }

    protected Connection getConnection() throws SQLException {
        return this.dataSource.getConnection();
    }
}
