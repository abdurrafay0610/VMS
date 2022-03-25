package BusinessLogic;

import java.sql.SQLException;

import DataBase.OracleDB;
import DataBase.PersistanceManager;

public class Main 
{
	static PersistanceManager obj; 
	public Main() throws ClassNotFoundException, SQLException
	{
	//	OracleDB db=new OracleDB();
	}
	

	public static void main(String[] args) throws SQLException 
	{
		obj = new OracleDB();
		//a1.addTeacher("Gulsher", "gulsherkhan0707@gmail.com");
	}

}
