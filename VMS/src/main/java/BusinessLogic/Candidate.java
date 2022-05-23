package BusinessLogic;

import DataBase.OracleDB;

public class Candidate extends Voter
{
	private int party;
	//constructor
	Candidate()
	{

	}
	public Candidate(int i,String n,String e,String p, int ec,int prty)
	{
		setId(i);
		setName(n);
		setEmail(e);
		setPassword(p);
		setEE(ec);
		setParty(prty);
	}
	//getter setter
	public int getParty() 
	{
		return party;
	}
	public void setParty(int party) 
	{
		this.party = party;
	}
}
