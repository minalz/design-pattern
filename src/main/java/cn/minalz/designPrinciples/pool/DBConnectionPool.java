package cn.minalz.designPrinciples.pool;

import com.sun.org.apache.xml.internal.security.Init;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Vector;

/**
 * @description: 数据库连接池相关方法
 * @author: minalz
 * @date: 2021-04-04 01:29
 **/
public class DBConnectionPool extends Pool {

    // 正在使用的连接数
    private int checkedOut;

    // 存放产生的连接对象容器
    private Vector<Connection> freeConnections = new Vector<>();

    // 密码
    private String password = null;

    // 连接字符串
    private String url = null;

    // 用户名
    private String userName = null;

    // 空闲连接数
    private static int num = 0;

    // 当前可用连接数
    private static int activeNum = 0;

    // 连接池用例变量
    private static DBConnectionPool pool = null;

    // 生成数据库连接池
    public static synchronized DBConnectionPool getInstance() {

        if (pool == null) {
            pool = new DBConnectionPool();
        }
        return pool;
    }

    // 获得一个数据库连接池的实例
    private DBConnectionPool() {
        try {
            init();
            for (int i = 0; i < normalConnect; i++) {
                // 初始化normalConnection个连接
                Connection conn = newConnection();
                if (conn != null) {
                    // 往容器中添加一个连接对象
                    freeConnections.addElement(conn);
                    // 记录总连接数
                    num++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 初始化
    private void init() throws IOException {
        InputStream is = DBConnectionPool.class.getResourceAsStream(propertiesName);
        Properties p = new Properties();
        p.load(is);
        this.userName = p.getProperty("userName");
        this.password = p.getProperty("password");
        this.driverName = p.getProperty("driverName");
        this.url = p.getProperty("url");
        this.maxConnect = Integer.parseInt(p.getProperty("maxConnect"));
        this.normalConnect = Integer.parseInt(p.getProperty("normalConnect"));
    }

    @Override
    public void createPool() {
        pool = new DBConnectionPool();
        if (pool != null) {
            System.out.println("创建线程池成功");
        } else {
            System.out.println("创建线程池失败");
        }
    }

    @Override
    public Connection getConnection() {
        Connection conn = null;
        if (freeConnections.size() > 0) {
            // 还有空余的连接
            num--;
            conn = (Connection)freeConnections.firstElement();
            freeConnections.removeElementAt(0);
            try {
                if (conn.isClosed()) {
                    System.out.println("从连接池删除一个无效连接");
                    conn = getConnection();
                }
            } catch (SQLException e) {
                System.out.println("从连接池删除一个无效连接");
                conn = getConnection();
            }
        }else if (maxConnect == 0 || checkedOut < maxConnect) {
            // 没有空余连接切当前连接小于最大允许值，最大值为0则不限制
            conn = newConnection();
        }
        if (conn != null) {
            // 当前连接数加1
            checkedOut++;
        }
        activeNum++;
        return conn;
    }

    // 获取一个可用连接
    @Override
    public Connection getConnection(long timeout) {
        long startTime = new Date().getTime();
        Connection conn;
        while ((conn = getConnection()) == null) {
            // 线程等待
            try {
                wait(timeout);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if ((new Date().getTime() - startTime) >= timeout) {
                // 如果超时，则返回
                return null;
            }
        }
        return conn;
    }

    // 如果不再使用某个连接对象时，可调此方法将该对象释放到连接池
    public void freeConnection(Connection conn) {
        freeConnections.addElement(conn);
        num++;
        checkedOut--;
        activeNum--;
        // 解锁
        notifyAll();
    }

    // 创建一个新连接
    private Connection newConnection() {
        Connection conn = null;
        try {
            if (userName == null) {
                conn = DriverManager.getConnection(url);
            } else {
                conn = DriverManager.getConnection(url, userName, password);
            }
            System.out.println("连接池创建一个新的连接");
        } catch (SQLException e) {
            System.out.println("无法创建这个URL的连接" + url);
        }
        return conn;
    }

    // 返回当前空余连接数
    public int getNum() {
        return num;
    }

    // 返回当前连接数
    public int getActiveNum() {
        return activeNum;
    }

    // 关闭所有连接
    public synchronized void release() {
        try {
            // 将当前连接复制到枚举中
            Enumeration<Connection> allConnections = freeConnections.elements();
            // 使用玄幻关闭所有连接
            while (allConnections.hasMoreElements()) {
                // 如果次枚举对象至少还有一个可提供的元素，则返回此枚举的下一个元素
                Connection conn = (Connection)allConnections.nextElement();
                try {
                    conn.close();
                    num--;
                } catch (SQLException e) {
                    e.printStackTrace();
                    System.out.println("无法关闭连接池中的连接");
                }
            }
            freeConnections.removeAllElements();
            activeNum = 0;
        } finally {
            super.release();
        }
    }
}
