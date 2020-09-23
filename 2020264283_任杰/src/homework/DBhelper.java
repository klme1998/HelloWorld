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
 * @author �ν�
 * @PackageName:homework
 * @ClassName: DBhelper
 * @Description:
 * @date 2020/9/19 22��10
 */
public class DBhelper {

	public String url = "jdbc:mysql://localhost:3306/library?useUnicode=true&characterEncoding=UTF-8&useSSL=false";
	public String username = "root";
	public String password = "19980910rj";
	public static DBhelper instance = null;

	// ͨ����̬�����ע�����ݿ���������֤ע��ִֻ��һ��
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
	 * �����ʵ��
	 * 
	 * @return
	 */
	public static DBhelper getInstance() {
		// �������,��ֹ�̲߳���
		synchronized (DBhelper.class) {
			if (instance == null) {
				instance = new DBhelper();
			}
		}
		return instance;
	}

	/**
	 * �������
	 * 
	 * @return
	 * @throws SQLException
	 */
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, username, password);
	}

	/**
	 * �ر�����
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