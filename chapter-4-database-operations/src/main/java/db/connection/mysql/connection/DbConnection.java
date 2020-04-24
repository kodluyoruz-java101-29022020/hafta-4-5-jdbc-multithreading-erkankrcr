package db.connection.mysql.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	private final static String dbHost = "jdbc:mysql://remotemysql.com:3306/O0EMDoktci?useSSL=false";
	private final static String userName = "O0EMDoktci";
	private final static String password = "mnsfUm5FI1";
	private final static String jdbcDriver = "com.mysql.jdbc.Driver";
	
	private static Connection connection = null;
	
	public static Connection getDbConnection() {
		
		try {
			if(connection == null) {
				
				Class.forName(jdbcDriver);
				connection = DriverManager.getConnection(dbHost, userName, password);
			}
			return connection;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}
