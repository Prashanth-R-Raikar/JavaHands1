
import java.sql.Connection;
import java.sql.DriverManager;


public class ConnDemo {
	static Connection connection;
	
	public static Connection createConn()  {
		try {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ipm002", "root", "12345");
		}catch (Exception e) {
			System.out.println("Error in DB Connection : "+e);
		}
		return connection;
	}
	
	public static void closeConn() {
		try {
			connection.close();
		} catch (Exception e) {
			System.out.println("Error in DB Connection Close : "+e);
		}
	}

}
