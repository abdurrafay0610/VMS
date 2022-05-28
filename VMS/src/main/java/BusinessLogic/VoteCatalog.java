package BusinessLogic;

import java.sql.SQLException;
import java.util.ArrayList;

import DataBase.OracleDB;

public class VoteCatalog 
{
	public static ArrayList<Vote> vote_list = new ArrayList<Vote>();
	
	public VoteCatalog() throws ClassNotFoundException, SQLException
	{
		vote_list = OracleDB.getVotes();
		//populate the vote_list using database
	}
	
	public void addVote(Vote obj)
	{
		VoteCatalog.vote_list.add(obj);
		OracleDB.addVote(obj);
	}
	

}
