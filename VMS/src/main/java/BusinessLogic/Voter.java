package BusinessLogic;

import DataBase.OracleDB;

public class Voter 
{
	private int id;
	private String name;
	private String email;
	private String password;
	private int ee;
	
	public Voter()
	{
		setId(0);
		setName("");
		setEmail("");
		setPassword("");
		setEE(0);
	}
	public Voter(int i,String n,String e,String p, int ec)
	{
		setId(i);
		setName(n);
		setEmail(e);
		setPassword(p);
		setEE(ec);
	}
	//getter setter
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	public int IsEE() 
	{
		return ee;
	}
	public void setEE(int ee) 
	{
		this.ee = ee;
	}
}
