package BusinessLogic;

public class ElectionCommission extends Voter
{
	//constructor
	ElectionCommission()
	{
		setEE(1);
	}
	public ElectionCommission(int i,String n,String e,String p)
	{
		setId(i);
		setName(n);
		setEmail(e);
		setPassword(p);
		setEE(1);
	}
}
