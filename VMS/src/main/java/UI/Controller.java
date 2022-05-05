package UI;

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
	public void Menu_to_EC(ActionEvent e) throws IOException
	{
		root=FXMLLoader.load(getClass().getResource("Election_Commission.fxml"));
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
		root=FXMLLoader.load(getClass().getResource("Voting_page2.fxml"));
		appStage=(Stage)((Node)e.getSource()).getScene().getWindow();
		scene=new Scene(root);
		appStage.setScene(scene);
		appStage.show();	
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

}
