package utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class databaseUtils {

	public static Connection getConnection() {
		try {
			String dbURL = "jdbc:mysql://localhost:3306/petDB?serverTimezone=UTC";
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(dbURL, "root", "isjaki0,0");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
