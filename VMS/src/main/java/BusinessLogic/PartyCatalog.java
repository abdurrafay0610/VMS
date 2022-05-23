package BusinessLogic;

import java.sql.SQLException;
import java.util.ArrayList;
import DataBase.OracleDB;

public class PartyCatalog 
{
	public static ArrayList<Party> party_list = new ArrayList<Party>();

	public PartyCatalog() throws ClassNotFoundException, SQLException
	{
		//populate the party_list using database
		party_list = OracleDB.getParty();
	}
	//adding party to database and list
	public void addParty(Party obj)
	{
		PartyCatalog.party_list.add(obj);
		OracleDB.addParty(obj);
	}
}
