package BusinessLogic;

import java.sql.SQLException;

import DataBase.OracleDB;
import DataBase.PersistanceManager;

public class Main 
{
	static PersistanceManager obj; 
	public Main() throws ClassNotFoundException, SQLException
	{
	
	}
	

	public static void main(String[] args) throws SQLException 
	{
		obj = new OracleDB();
	}

}
