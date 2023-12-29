package Entity;

public class Database {
	private static String connectionString;
	
	//Khối static
	static {
		connectionString ="jdbc:mysql://localhost:3306/sample_db";
	}
	public static String getConnectionString() {
		return connectionString;
	}
}
