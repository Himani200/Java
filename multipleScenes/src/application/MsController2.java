package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MsController2 {
	
	public void changeScene(ActionEvent event) throws IOException
	{
		Parent page2parent = FXMLLoader.load(getClass().getResource("multiplescenes.fxml"));
		Scene page2scene = new Scene(page2parent);
		
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(page2scene);
		window.show();
		
	}

}
