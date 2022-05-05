package BusinessLogic;

import DataBase.PersistanceManager;
import DataBase.OracleDB;

import java.sql.SQLException;
import java.util.ArrayList;

public class VoterCatalog 
{
	public static ArrayList<Voter> voter_list = new ArrayList<Voter>();
	
	public VoterCatalog() throws ClassNotFoundException, SQLException
	{
		//populate the voter list using database
		voter_list = OracleDB.getVoters();
	}

}
