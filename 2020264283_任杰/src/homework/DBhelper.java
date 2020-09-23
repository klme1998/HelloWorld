/**
 * 
 */
package homework;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * @author 任杰
 * @PackageName:homework
 * @ClassName: DBhelper
 * @Description:
 * @date 2020/9/19 22：10
 */
public class DBhelper {

	public String url = "jdbc:mysql://localhost:3306/library?useUnicode=true&characterEncoding=UTF-8&useSSL=false";
	public String username = "root";
	public String password = "19980910rj";
	public static DBhelper instance = null;

	// 通过静态代码块注册数据库驱动，保证注册只执行一次
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private DBhelper() {
	}

	/**
	 * 获得类实例
	 * 
	 * @return
	 */
	public static DBhelper getInstance() {
		// 给类加锁,防止线程并发
		synchronized (DBhelper.class) {
			if (instance == null) {
				instance = new DBhelper();
			}
		}
		return instance;
	}

	/**
	 * 获得连接
	 * 
	 * @return
	 * @throws SQLException
	 */
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, username, password);
	}

	/**
	 * 关闭连接
	 * 
	 * @param cn
	 * @param st
	 * @param rs
	 */
	public static void closeConnection(Connection cn, Statement st,
			ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (st != null) {
					st.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if (cn != null) {
						cn.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}