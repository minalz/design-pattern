package cn.minalz.designPrinciples.pool;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-04 18:46
 **/
public abstract class Pool {

    public String propertiesName = "connection-INF.properties";

    // 定义唯一实例
    private static Pool instance = null;

    // 最大连接数
    protected int maxConnect = 100;

    // 保持连接数
    protected int normalConnect = 10;

    // 驱动字符串
    protected String driverName = null;

    // 驱动类
    protected Driver driver = null;

    // 私有化构造函数
    protected Pool() {
        try {
            init();
            loadDrivers(driverName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 初始化所有从配置文件中读取的成员变量
    private void init() throws Exception {
        InputStream is = Pool.class.getResourceAsStream(propertiesName);
        Properties p = new Properties();
        p.load(is);
        this.driverName = p.getProperty("driverName");
        this.maxConnect = Integer.parseInt(p.getProperty("maxConnect"));
        this.normalConnect = Integer.parseInt(p.getProperty("normalConnect"));
    }

    // 装载和注册所有JDBC驱动程序
    protected void loadDrivers(String dri) {
        String driverClassName = dri;
        try {
            driver = (Driver) Class.forName(driverClassName).newInstance();
            DriverManager.registerDriver(driver);
            System.out.println("成功注册JDBC驱动程序" + driverClassName);
        } catch (Exception e) {
            System.out.println("无法注册JDBC驱动程序" + driverClassName + ",错误：" + e);
        }
    }

    // 创建连接池
    public abstract void createPool();

    // 单例模式 返回数据库连接池 Pool的实例
    public static synchronized Pool getInstance() throws Exception {

        if (instance == null) {
            instance.init();
            instance = (Pool) Class.forName("org.e_book.sqlhelp.Pool").newInstance();
        }
        return instance;
    }

    // 获得一个可用的连接，如果没有则创建一个连接，切小于最大连接限制
    public abstract Connection getConnection();

    // 获得一个连接,有时间限制
    public abstract Connection getConnection(long time);

    // 将连接对象返回给连接池
    public abstract  void freeConnection(Connection conn);

    // 返回当前空余连接数
    public abstract int getNum();

    // 返回当前工作的连接数
    public abstract int getActiveNum();

    // 关闭所有连接，撤销驱动注册（此方法为单例方法）
    protected synchronized void release() {
        try {
            DriverManager.deregisterDriver(driver);
            System.out.println("撤销JDBC驱动程序" + driver.getClass().getName());
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("无法撤销JDBC驱动程序的注册" + driver.getClass().getName());
        }
    }

}
