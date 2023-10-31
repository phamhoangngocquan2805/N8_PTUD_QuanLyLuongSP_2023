package connectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	public static Connection con = null;
	private static ConnectDB instance = new ConnectDB();
	
	public static ConnectDB getInstance()
	{
		return instance;
	}
	
	public void connect() throws SQLException
	{
		String url = "jdbc:sqlserver://localhost:1433;databasename=LuongSP";
		String user = "sa";
		String passsword = "123456789";
		con = DriverManager.getConnection(url, user, passsword);
	}
	
	public void disconnect()
	{
		if(con != null)
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	public static Connection getConnection()
	{
		return con;
	}
}
