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

}
