package BusinessLogic;

import java.util.ArrayList;

public class Vote 
{
	int voter_id;
	ArrayList<String> choice = new ArrayList<String>();
	
	Vote(int v_id,ArrayList<String> c)
	{
		voter_id = v_id;
		for(int i=0;i<5;i++)
		{
			choice.add(c.get(i));
		}
	}
	
	
}
