package UI;

import java.sql.SQLException;

import DataBase.PersistanceManager;
import DataBase.OracleDB;

import BusinessLogic.CandidateCatalog;
import BusinessLogic.PartyCatalog;
import BusinessLogic.VoterCatalog;
import BusinessLogic.Election;

public class MainClass 
{
	public MainClass()  throws ClassNotFoundException, SQLException
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		// TODO Auto-generated method stub
		//Man.launch(args);
		Election e = new Election();
		MainUI.main(args);
	}
}
