/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutsp1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author soltani med ala
 */
public class AcceuilController implements Initializable {

    @FXML
    private Button affiche_ajout;
    @FXML
    private Button affiche_modifier;
    @FXML
    private Button affiche_supprimer;
    @FXML
    private Button affiche_affiche;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void affiche_ajout(ActionEvent event) {
      /* Parent root = FXMLLoader.load(getClass().getResource("acceuil.fxml"));
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        */
    }

    @FXML
    private void affiche_modifier(ActionEvent event) {
    }

    @FXML
    private void affiche_supprimer(ActionEvent event) {
    }

    @FXML
    private void affiche_affiche(ActionEvent event) {
    }
    
}
