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
	
	//adding voter to database and list
	public static void addVoter(Voter obj)
	{
		VoterCatalog.voter_list.add(obj);
		OracleDB.addVoter(obj);
	}
	public static Voter getAdmin()
	{
		for(int i=0;i<voter_list.size();i++)
		{
			if(voter_list.get(i).IsEE() == 1)
			{
				return voter_list.get(i);
			}
		}
		return null;
	}
	public static Voter getVoter(int cnic)
	{
		for(int i=0;i<voter_list.size();i++)
		{
			if(voter_list.get(i).getId() == cnic)
			{
				return voter_list.get(i);
			}
		}
		return null;
	}
}
