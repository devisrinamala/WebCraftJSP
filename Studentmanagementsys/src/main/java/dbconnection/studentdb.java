package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class studentdb {

	private static final String Driver = "com.mysql.cj.jdbc.Driver";
	private static final String Username = "root";
	private static final String Password = "akshaya@123";
	private static final String Url = "jdbc:mysql://localhost:3306/student";
	private static Connection conn = null;
	
	public static Connection conn() {
		try {
			Class.forName(Driver);
			conn = DriverManager.getConnection(Url, Username, Password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
		
}
