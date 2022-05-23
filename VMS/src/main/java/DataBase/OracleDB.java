package DataBase;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import BusinessLogic.Candidate;
import BusinessLogic.ElectionCommission;
import BusinessLogic.Party;
import BusinessLogic.Vote;
import BusinessLogic.Voter;

public class OracleDB extends PersistanceManager
{
	public OracleDB() throws SQLException
	{
		//Database connection
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded successfully");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:SYED","scott","1234");		
			System.out.println("Connection Established");
		}
		catch(Exception e)
		{	
			System.out.println("Database Connection Failed!");
		}	
			
		//DataBase Schema
		Statement stmt = con.createStatement();
		
//		System.out.println("Dropping schema tables");
//		try
//		{
//			stmt.executeQuery("DROP TABLE party CASCADE CONSTRAINTS");
//			System.out.println("party table dropped");
//		}
//		catch(Exception e)
//		{
//			System.out.println("party table does not exist, so it cannot be dropped");
//		}
//		try
//		{
//			stmt.executeQuery("DROP TABLE voter CASCADE CONSTRAINTS");
//			System.out.println("voter table dropped");
//		}
//		catch(Exception e)
//		{
//			System.out.println("voter table does not exist, so it cannot be dropped");
//		}
//		try
//		{
//			stmt.executeQuery("DROP TABLE vote CASCADE CONSTRAINTS");
//			System.out.println("vote table dropped");
//		}
//		catch(Exception e)
//		{
//			System.out.println("vote table does not exist, so it cannot be dropped");
//		}
//		try
//		{
//			stmt.executeQuery("DROP TABLE candidate CASCADE CONSTRAINTS");
//			System.out.println("candidate table dropped");
//		}
//		catch(Exception e)
//		{
//			System.out.println("candidate table does not exist, so it cannot be dropped");
//		}
//		
//		System.out.println("Creating tables!");
//		try
//		{
//			ResultSet rs;
//			//Voter table
//			stmt.executeQuery("CREATE TABLE voter"
//					+ "(v_id NUMBER(10) PRIMARY KEY,"
//					+ "name VARCHAR(30),"
//					+ "email VARCHAR(30) UNIQUE,"
//					+ "password VARCHAR(30),"
//					+ "ee NUMBER(5))");
//			//Candidate table
//			stmt.executeQuery("CREATE TABLE candidate"
//					+ "(c_id NUMBER(10) PRIMARY KEY,"
//					+ "p_id NUMBER(10))");
//			//Party table
//			stmt.executeQuery("CREATE TABLE party"
//					+ "(p_id NUMBER(10) PRIMARY KEY,"
//					+ "ph_id NUMBER(10),"
//					+ "name VARCHAR(30),"
//					+ "password VARCHAR(30))");
//			//Vote table
//			stmt.executeQuery("CREATE TABLE vote"
//					+ "(v_id NUMBER(10) PRIMARY KEY,"
//					+ "choice1 NUMBER(10),"
//					+ "choice2 NUMBER(10),"
//					+ "choice3 NUMBER(10),"
//					+ "choice4 NUMBER(10),"
//					+ "choice5 NUMBER(10))");
//			System.out.println("DataBase table creation successfull");
//			
//		}
//		catch(Exception e)
//		{
//			System.out.println("*******Problem occured in table creation*******");
//		}
	}
	///////////////////////////////////////////////////////////////
	////////////////functions to add data/////////////////////////
	/////////////////////////////////////////////////////////////
	//add Election Commission
	public static void addElectionCommission(ElectionCommission obj)
	{	
		try 
		{	
			String sql="INSERT INTO voter(v_id,name,email,password,ee) VALUES (?,?,?,?,?)";
			PreparedStatement statement=con.prepareStatement(sql);
			statement.setInt(1,obj.getId());
			statement.setString(2,obj.getName());
			statement.setString(3,obj.getEmail());
			statement.setString(4,obj.getPassword());
			statement.setInt(5, 1);
			statement.executeUpdate();
			
			System.out.println("Election Commission addittion successfull");
		}
		catch(Exception e) 
		{
			System.out.println("Election Commission NOT added");
		}	
	}
	//add single Candidate
	public static void addCandidate(Candidate obj)
	{	
		try 
		{	
			String sql="INSERT INTO voter(v_id,name,email,password,ee) VALUES (?,?,?,?,?)";
			PreparedStatement statement=con.prepareStatement(sql);
			statement.setInt(1,obj.getId());
			statement.setString(2,obj.getName());
			statement.setString(3,obj.getEmail());
			statement.setString(4,obj.getPassword());
			statement.setInt(5, 0);
			statement.executeUpdate();
			
			sql="INSERT INTO candidate(c_id,p_id) VALUES (?,?)";
			statement=con.prepareStatement(sql);
			statement.setInt(1,obj.getId());
			statement.setInt(2,obj.getParty());
			
			System.out.println("candidate addittion successfull");
		}
		catch(Exception e) 
		{
			System.out.println("Candidate NOT added");
		}	
	}
	//add list of candidate
	public static void addCandidateList(ArrayList<Candidate> obj)
	{
		int size = obj.size();
		
		for(int i = 0;i < size;i++)
		{
			addCandidate(obj.get(i));
		}
	}
	//add single vote
	public static void addVote(Vote obj)
	{
		try 
		{	
			String sql="INSERT INTO vote(v_id,choice1,choice2,choice3,choice4,choice5) VALUES (?,?,?,?,?,?)";
			PreparedStatement statement=con.prepareStatement(sql);
			statement.setInt(1,obj.getVoter_id());
			statement.setInt(2,obj.getChoice1());
			statement.setInt(3,obj.getChoice2());
			statement.setInt(4,obj.getChoice3());
			statement.setInt(5,obj.getChoice4());
			statement.setInt(6,obj.getChoice5());
			statement.executeUpdate();
			
			System.out.println("vote addittion successfull");
		}
		catch(Exception e) 
		{
			System.out.println("Vote NOT added");
		}
	}
	//add vote as list
	public static void addVoteList(ArrayList<Vote> obj)
	{
		int size = obj.size();
		
		for(int i = 0;i < size;i++)
		{
			addVote(obj.get(i));
		}
	}
	//add single voter
	public static void addVoter(Voter obj)
	{	
		try 
		{	
			String sql="INSERT INTO voter(v_id,name,email,password,ee) VALUES (?,?,?,?,?)";
			PreparedStatement statement=con.prepareStatement(sql);
			statement.setInt(1,obj.getId());
			statement.setString(2,obj.getName());
			statement.setString(3,obj.getEmail());
			statement.setString(4,obj.getPassword());
			statement.setInt(5, obj.IsEE());
			statement.executeUpdate();
			
			System.out.println("voter addittion successfull");
		}
		catch(Exception e) 
		{
			System.out.println("Voter NOT added");
		}	
	}
	//add voter as list
	public static void addVoterList(ArrayList<Voter> obj)
	{
		int size = obj.size();
		
		for(int i = 0;i < size;i++)
		{
			addVoter(obj.get(i));
		}
	}
	//add single party
	public static void addParty(Party obj)
	{	
		try 
		{	
			String sql="INSERT INTO party(p_id,ph_id,name,password) VALUES (?,?,?,?)";
			PreparedStatement statement=con.prepareStatement(sql);
			statement.setInt(1,obj.getP_id());
			statement.setInt(2,obj.getPh_id());
			statement.setString(3,obj.getName());
			statement.setString(4,obj.getPassword());
			statement.executeUpdate();
			
			System.out.println("Party addittion successfull");
		}
		catch(Exception e) 
		{
			System.out.println("Party NOT added");
		}	
	}
	//add party as list
	public static void addPartyList(ArrayList<Party> obj)
	{
		int size = obj.size();
		
		for(int i = 0;i < size;i++)
		{
			addParty(obj.get(i));
		}
	}
	//////////////////////////////////////////////////////////////////
	////////////////functions to get data from database//////////////
	////////////////////////////////////////////////////////////////
	//to get voter as list 
	public static ArrayList<Voter> getVoters() throws ClassNotFoundException, SQLException
	{
		try
		{
			ArrayList<Voter>temp=new ArrayList<Voter>();
		
			Statement smt=con.createStatement();
			ResultSet rs=smt.executeQuery("select * from voter");
		
			while(rs.next()) 
			{
				int id=rs.getInt("v_id");
				String name=rs.getString("name");
				String email=rs.getString("email");
				String pass=rs.getString("password");
				int e=rs.getInt("ee");
				
				temp.add(new Voter(id,name,email,pass,e));
			}
			System.out.println("Voter list get successfull");
			return temp;
		}
		catch(Exception e)
		{
			System.out.println("Failed to get voter list from database");
			return null;
		}
	}
	public static ArrayList<Candidate> getCandidates() throws ClassNotFoundException, SQLException
	{
		try
		{
			ArrayList<Candidate>temp=new ArrayList<Candidate>();
		
			Statement smt=con.createStatement();
			ResultSet rs=smt.executeQuery("select * from candidate");
		
			while(rs.next()) 
			{
				int id=rs.getInt("c_id");
				int p_id=rs.getInt("p_id");
				
				
				String sql="SELECT * FROM candidate WHERE c_id = ?";
				PreparedStatement st=con.prepareStatement(sql);
				st.setInt(1,id);
				
				ResultSet result=st.executeQuery();
					
				String name = result.getString("name");
				String email = result.getString("email");
				String pass = result.getString("password");
				
				temp.add(new Candidate(id,name,email,pass,0,p_id));
			}
			System.out.println("Candidate list get successfull");
			return temp;
		}
		catch(Exception e)
		{
			System.out.println("Failed to get candidate list from database");
			return null;
		}
	}
	public static ArrayList<Vote> getVotes() throws ClassNotFoundException, SQLException
	{
		try
		{
			ArrayList<Vote>temp=new ArrayList<Vote>();
			
			Statement smt=con.createStatement();
			ResultSet rs=smt.executeQuery("select * from vote");
		
			while(rs.next()) 
			{
				int id=rs.getInt("v_id");
				int c1=rs.getInt("choice1");
				int c2=rs.getInt("choice2");
				int c3=rs.getInt("choice3");
				int c4=rs.getInt("choice4");
				int c5=rs.getInt("choice5");
				
				temp.add(new Vote(id,c1,c2,c3,c4,c5));
			}
			System.out.println("Vote list get successfull");
			return temp;
		}
		catch(Exception e)
		{
			System.out.println("Failed to get vote list from database");
			return null;
		}
	}
	public static ArrayList<Party> getParty() throws ClassNotFoundException, SQLException
	{
		try
		{
			ArrayList<Party>temp=new ArrayList<Party>();
			
			Statement smt=con.createStatement();
			ResultSet rs=smt.executeQuery("select * from party");
		
			while(rs.next()) 
			{
				int pid=rs.getInt("p_id");
				int phid=rs.getInt("ph_id");
				String name=rs.getString("name");
				String password=rs.getString("password");
				
				
				temp.add(new Party(pid,phid,name,password));
			}
			System.out.println("Party list get successfull");
			return temp;
		}
		catch(Exception e)
		{
			System.out.println("Failed to get Party list from database");
			return null;
		}
	}
}
