package BusinessLogic;

public class Party 
{
	private int p_id;
	private int ph_id;
	private String name;
	private String password;
	
	//constructors
	Party()
	{
		setP_id(0);
		setPh_id(0);
		setName("");
		setPassword("");
	}
	public Party(int p_id,int ph_id,String name,String password)
	{
		setP_id(p_id);
		setPh_id(ph_id);
		setName(name);
		setPassword(password);
	}
	//getter setter functions
	public int getP_id() 
	{
		return p_id;
	}
	public void setP_id(int p_id) 
	{
		this.p_id = p_id;
	}
	public int getPh_id() 
	{
		return ph_id;
	}
	public void setPh_id(int ph_id) 
	{
		this.ph_id = ph_id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
}
