package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	private static Connection connect = null;
	
	public static Connection getConnection() throws ClassNotFoundException , SQLException {
		if (connect==null) {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracledb","system","hpsystem");
			System.out.println("connected");
		}
		return connect;
	}	
}
