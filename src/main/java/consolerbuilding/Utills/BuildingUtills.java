package consolerbuilding.Utills;

import java.sql.Connection;
import java.sql.DriverManager;

public class BuildingUtills {
		private static  String DB_URL = "jdbc:mysql://localhost:3306/student";
		private static String USER = "root";
		private static String PASS = "123456789";
		
		public static Connection getconnection() {
			Connection connection = null;
			try {
				connection = DriverManager.getConnection(DB_URL, USER, PASS);
				return connection;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			return null;
		}
}

