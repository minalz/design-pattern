package cn.minalz.designPrinciples;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
import java.util.ResourceBundle;

public class JdbcUtils {

    //数据库url、用户名和密码
    private static String driver;//Ctrl+Alt+F抽取全局静态变量
    private static String url;
    private static String username;
    private static String password;

    /*读取属性文件，获取jdbc信息*/
    static{
        /**
         * 1.读取配置文件方式 db.properties
         */
        ResourceBundle bundle = ResourceBundle.getBundle("db");
        /**
         * 2.读取配置文件的方式
         */
        /*try {
            ClassLoader loader = Thread.currentThread().getContextClassLoader();
            InputStream input = loader.getResourceAsStream("db.properties");
            Properties properties = new Properties();
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }*/


        driver = bundle.getString("driver");
        url = bundle.getString("url");
        username = bundle.getString("username");
        password = bundle.getString("password");
    }

    public static Connection getConnection() {
        Connection connection = null;
        try {
            //1、注册JDBC驱动
            Class.forName(driver);
            /* 2、获取数据库连接 */
            connection = DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    /*关闭结果集、数据库操作对象、数据库连接*/
    public static void release(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet) {

        if(resultSet!=null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(preparedStatement!=null) {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(connection!=null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
