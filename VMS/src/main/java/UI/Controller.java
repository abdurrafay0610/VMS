package UI;

import DataBase.OracleDB;
import BusinessLogic.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class Controller implements Initializable
{
	public Stage appStage;
	public Scene scene;
	public Parent root;
	
	//these labels will only be used in election Commission login page
	@FXML
	private Label ec_login_label = new Label("Enter your details:");
	@FXML
	private TextField ec_login_user_name = new TextField();
	@FXML
	private TextField ec_login_password = new TextField();
	@FXML
	private Button ec_login_sign_up_Button = new Button();
	@FXML
	private Button ec_login_login_Button = new Button();
	
	//these labels will only be used in election Commission sign up page
	@FXML
	private Label ec_signup_label = new Label("Kindly enter info to signup");
	@FXML
	private TextField ec_signup_user_name = new TextField();
	@FXML
	private TextField ec_signup_password = new TextField();
	@FXML
	private TextField ec_signup_email = new TextField();
	@FXML
	private Button ec_signup_sign_up_Button = new Button();
	@FXML
	private Button ec_signup_login_Button = new Button();
	
	//these labels will only be used in voter login page
	@FXML
	private Label voter_login_label = new Label("Kindly enter your CNIC and password");
	@FXML
	private TextField voter_login_cnic = new TextField();
	@FXML
	private TextField voter_login_password = new TextField();
	
	//these labels will only be used in voter login page 2
	@FXML
	private Label voter_options_label = new Label("These are the candidates: ");
	@FXML
	private Label voter_label = new Label("HELLO! please vote");
	@FXML
	private TextField voter_first = new TextField();
	@FXML
	private TextField voter_second = new TextField();
	@FXML
	private TextField voter_third = new TextField();
	@FXML
	private TextField voter_fourth = new TextField();
	@FXML
	private TextField voter_fifth = new TextField();
	
	//these labels will only be used in voter register page
	@FXML
	private Label voter_register_label = new Label("Enter voter details:");
	@FXML
	private TextField voter_register_cnic = new TextField();
	@FXML
	private TextField voter_register_name = new TextField();
	@FXML
	private TextField voter_register_email = new TextField();
	@FXML
	private TextField voter_register_password = new TextField();

	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		// TODO Auto-generated method stub
		
	}
	public void go_to_MainMenu(ActionEvent e) throws IOException
	{
		root=FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
		appStage=(Stage)((Node)e.getSource()).getScene().getWindow();
		scene=new Scene(root);
		appStage.setScene(scene);
		appStage.show();	
	}
	public void ECLogin_to_EC(ActionEvent e) throws IOException
	{
		try
		{
			Voter ec = BusinessLogic.VoterCatalog.getAdmin();
			
			String name = ec_login_user_name.getText();
			String password = ec_login_password.getText();
			
			System.out.println(name + " " + password + " " + ec.getName() + " " + ec.getPassword());
			
			if(name.equals(ec.getName()))
			{
				if(password.equals(ec.getPassword()))
				{
					root=FXMLLoader.load(getClass().getResource("Election_Commission.fxml"));
					appStage=(Stage)((Node)e.getSource()).getScene().getWindow();
					scene=new Scene(root);
					appStage.setScene(scene);
					appStage.show();
				}
				else
				{
					ec_login_label.setText("Wrong password");
				}
			}
			else
			{
				ec_login_label.setText("Wrong username");
			}
		}
		catch(Exception a)
		{
			ec_login_label.setText("Currently no Election Commission set! Kindly login");
		}
	}
	public void ECSignup_to_EC(ActionEvent e) throws IOException
	{
		try
		{
			Voter ec = BusinessLogic.VoterCatalog.getAdmin();
			
			String name = ec_signup_user_name.getText();
			String password = ec_signup_password.getText();
			String email = ec_signup_email.getText();
			
			Voter election_commission = new Voter(0,name,email,password,1);
			
			if(ec == null)
			{
				BusinessLogic.VoterCatalog.addVoter(election_commission);
				root=FXMLLoader.load(getClass().getResource("Election_Commission.fxml"));
				appStage=(Stage)((Node)e.getSource()).getScene().getWindow();
				scene=new Scene(root);
				appStage.setScene(scene);
				appStage.show();
			}
			else
			{
				ec_signup_label.setText("Election Commission already exist! kindly login");
			}
		}
		catch(Exception a)
		{
			ec_signup_label.setText("Kindly login");
		}
	}
	public void to_ECsignup(ActionEvent e) throws IOException
	{
		root=FXMLLoader.load(getClass().getResource("Election_Commission_signup.fxml"));
		appStage=(Stage)((Node)e.getSource()).getScene().getWindow();
		scene=new Scene(root);
		appStage.setScene(scene);
		appStage.show();	
	}
	public void Menu_to_EClogin(ActionEvent e) throws IOException
	{
		root=FXMLLoader.load(getClass().getResource("Election_Commission_login.fxml"));
		appStage=(Stage)((Node)e.getSource()).getScene().getWindow();
		scene=new Scene(root);
		appStage.setScene(scene);
		appStage.show();	
	}
	public void Back_to_Menu(ActionEvent e) throws IOException
	{
		root=FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
		appStage=(Stage)((Node)e.getSource()).getScene().getWindow();
		scene=new Scene(root);
		appStage.setScene(scene);
		appStage.show();	
	}
	public void Menu_to_Voter(ActionEvent e) throws IOException
	{
		root=FXMLLoader.load(getClass().getResource("Voting_page.fxml"));
		appStage=(Stage)((Node)e.getSource()).getScene().getWindow();
		scene=new Scene(root);
		appStage.setScene(scene);
		appStage.show();
	}
	public void Voter_to_Voter2(ActionEvent e) throws IOException
	{
		try
		{
			String cnic = voter_login_cnic.getText();
			String password = voter_login_password.getText();
			
			if(cnic.length() == 5)
			{
				try
				{
					int CNIC = Integer.parseInt(cnic);
					Voter v = VoterCatalog.getVoter(CNIC);
					if(password.equals(v.getPassword()))
					{	
						voter_label.setText("Hello "+ v.getName()+". Please cast your vote!");
						root=FXMLLoader.load(getClass().getResource("Voting_page2.fxml"));
						appStage=(Stage)((Node)e.getSource()).getScene().getWindow();
						scene=new Scene(root);
						appStage.setScene(scene);
						appStage.show();
					}
					else
					{
						voter_login_label.setText("Wrong password!");
					}
				}
				catch(Exception b)
				{
					voter_login_label.setText("CNIC should be all numbers! or incorrect CNIC");
				}
			}
			else
			{
				voter_login_label.setText("Incorrect CNIC!");
			}
			
		}
		catch(Exception a)
		{
			voter_login_label.setText("Error Ocuured!");
		}
	}
	public void Menu_to_party(ActionEvent e) throws IOException
	{
		root=FXMLLoader.load(getClass().getResource("Party.fxml"));
		appStage=(Stage)((Node)e.getSource()).getScene().getWindow();
		scene=new Scene(root);
		appStage.setScene(scene);
		appStage.show();	
	}
	public void Start_Election_to_Result(ActionEvent e) throws IOException
	{
		root=FXMLLoader.load(getClass().getResource("result.fxml"));
		appStage=(Stage)((Node)e.getSource()).getScene().getWindow();
		scene=new Scene(root);
		appStage.setScene(scene);
		appStage.show();	
	}
	public void to_register_voter(ActionEvent e) throws IOException
	{
		root=FXMLLoader.load(getClass().getResource("Register_Voter.fxml"));
		appStage=(Stage)((Node)e.getSource()).getScene().getWindow();
		scene=new Scene(root);
		appStage.setScene(scene);
		appStage.show();
	}
	public void to_Election_Commission(ActionEvent e) throws IOException
	{
		root=FXMLLoader.load(getClass().getResource("Election_Commission.fxml"));
		appStage=(Stage)((Node)e.getSource()).getScene().getWindow();
		scene=new Scene(root);
		appStage.setScene(scene);
		appStage.show();
	}
	public void to_Voting_page(ActionEvent e) throws IOException
	{
		root=FXMLLoader.load(getClass().getResource("Voting_page.fxml"));
		appStage=(Stage)((Node)e.getSource()).getScene().getWindow();
		scene=new Scene(root);
		appStage.setScene(scene);
		appStage.show();
	}
	public void Register_Voter(ActionEvent e) throws IOException
	{
		try
		{
			String cnic = voter_register_cnic.getText();
			String name = voter_register_name.getText();
			String email = voter_register_email.getText();
			String password = voter_register_password.getText();
			
			if(cnic.length() == 5)
			{
				try
				{
					int CNIC = Integer.parseInt(cnic);
					Voter vv = VoterCatalog.getVoter(CNIC);
					if(vv == null)
					{
						if(email.contains("@"))
						{	
							Voter v = new Voter(CNIC,name,email,password,0);
							VoterCatalog.addVoter(v);
							root=FXMLLoader.load(getClass().getResource("Voter_Registration_Success.fxml"));
							appStage=(Stage)((Node)e.getSource()).getScene().getWindow();
							scene=new Scene(root);
							appStage.setScene(scene);
							appStage.show();
						}
						else
						{
							voter_register_label.setText("Wrong email format!");
						}
					}
					else
					{
						voter_register_label.setText("Voter already Exist!");
					}
				}
				catch(Exception b)
				{
					voter_register_label.setText("CNIC should be all numbers! or incorrect CNIC");
				}
			}
			else
			{
				voter_register_label.setText("Incorrect CNIC!");
			}
			
		}
		catch(Exception a)
		{
			voter_register_label.setText("Error Ocuured!");
		}
	}
}
