/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutsp1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author soltani med ala
 */
public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("AjoutNut.fxml"));
       // Parent root = FXMLLoader.load(getClass().getResource("update_nut.fxml"));
      // Parent root = FXMLLoader.load(getClass().getResource("delete_nut.fxml"));
    //Parent root = FXMLLoader.load(getClass().getResource("page_main.fxml"));
    //Parent root = FXMLLoader.load(getClass().getResource("acceuil.fxml"));
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
