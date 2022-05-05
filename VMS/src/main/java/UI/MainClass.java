package UI;

import java.sql.SQLException;

import DataBase.PersistanceManager;
import DataBase.OracleDB;

import BusinessLogic.CandidateCatalog;
import BusinessLogic.PartyCatalog;
import BusinessLogic.VoterCatalog;

public class MainClass 
{
	static OracleDB db; 
	static VoterCatalog v;
	static PartyCatalog p;
	static CandidateCatalog c;

	public MainClass()  throws ClassNotFoundException, SQLException
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		// TODO Auto-generated method stub
		//Man.launch(args);
		db = new OracleDB();
		v = new VoterCatalog();
		p = new PartyCatalog();
		c = new CandidateCatalog();
		MainUI.main(args);
	}
	

}
