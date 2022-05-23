package BusinessLogic;

import java.util.ArrayList;

public class Vote 
{
	private int voter_id;
	private int choice1;
	private int choice2;
	private int choice3;
	private int choice4;
	private int choice5;
	
	public Vote(int v_id,int c1,int c2,int c3,int c4,int c5)
	{
		setVoter_id(v_id);
		setChoice1(c1);
		setChoice2(c2);
		setChoice3(c3);
		setChoice4(c4);
		setChoice5(c5);
	}

	public int getVoter_id()
	{
		return voter_id;
	}

	public void setVoter_id(int voter_id) 
	{
		this.voter_id = voter_id;
	}

	public int getChoice1() 
	{
		return choice1;
	}

	public void setChoice1(int choice1) 
	{
		this.choice1 = choice1;
	}

	public int getChoice2() 
	{
		return choice2;
	}

	public void setChoice2(int choice2) 
	{
		this.choice2 = choice2;
	}

	public int getChoice3() 
	{
		return choice3;
	}

	public void setChoice3(int choice3) 
	{
		this.choice3 = choice3;
	}

	public int getChoice4() 
	{
		return choice4;
	}

	public void setChoice4(int choice4) 
	{
		this.choice4 = choice4;
	}

	public int getChoice5() 
	{
		return choice5;
	}

	public void setChoice5(int choice5) 
	{
		this.choice5 = choice5;
	}
	
	
}
