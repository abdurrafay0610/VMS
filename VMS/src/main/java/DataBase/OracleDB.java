
package DataBase;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class OracleDB extends PersistanceManager
{
	public OracleDB()
	{
		//Database connection
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("Driver loaded successfully");
					
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SYED","scott","1234");
					
				System.out.println("Connection Established");
			}
			catch(Exception e)
			{
				System.out.println("Database Connection Failed!");
			}
	}

}
