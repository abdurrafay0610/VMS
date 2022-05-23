package BusinessLogic;

import java.sql.SQLException;

import DataBase.OracleDB;

public class Election 
{
	public OracleDB db; 
	public VoteCatalog obj_vt;
	public VoterCatalog obj_vtr;
	public CandidateCatalog obj_cn;
	public PartyCatalog obj_pt;
	
	public Election() throws ClassNotFoundException, SQLException
	{
		db = new OracleDB();
		obj_vt = new VoteCatalog();
		obj_vtr = new VoterCatalog();
		obj_cn = new CandidateCatalog();
		obj_pt = new PartyCatalog();
	}
}
