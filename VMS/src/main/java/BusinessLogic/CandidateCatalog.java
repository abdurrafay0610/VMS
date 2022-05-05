package BusinessLogic;

import java.sql.SQLException;
import java.util.ArrayList;

import DataBase.PersistanceManager;
import DataBase.OracleDB;

public class CandidateCatalog 
{
	public static ArrayList<Candidate> candidate_list = new ArrayList<Candidate>();
	
	public CandidateCatalog() throws ClassNotFoundException, SQLException
	{
		//populate the candidate list using database
		candidate_list = OracleDB.getCandidates();
	}

}
