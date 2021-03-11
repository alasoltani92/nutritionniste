/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutsp1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

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
        
        try {
            Parent root = FXMLLoader.load(getClass().getResource("AjoutNut.fxml"));
               Stage mainStage = new Stage();
                Scene scene = new Scene(root);
                mainStage.setScene(scene);
                mainStage.show();
        } catch (IOException ex) {
            Logger.getLogger(AcceuilController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void affiche_modifier(ActionEvent event) {
        
          try {
            Parent root = FXMLLoader.load(getClass().getResource("update_nut.fxml"));
               Stage mainStage = new Stage();
                Scene scene = new Scene(root);
                mainStage.setScene(scene);
                mainStage.show();
        } catch (IOException ex) {
            Logger.getLogger(AcceuilController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void affiche_supprimer(ActionEvent event) {
        
              try {
            Parent root = FXMLLoader.load(getClass().getResource("delete_nut.fxml"));
               Stage mainStage = new Stage();
                Scene scene = new Scene(root);
                mainStage.setScene(scene);
                mainStage.show();
        } catch (IOException ex) {
            Logger.getLogger(AcceuilController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void affiche_affiche(ActionEvent event) {
             try {
            Parent root = FXMLLoader.load(getClass().getResource("page_main.fxml"));
               Stage mainStage = new Stage();
                Scene scene = new Scene(root);
                mainStage.setScene(scene);
                mainStage.show();
        } catch (IOException ex) {
            Logger.getLogger(AcceuilController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void mail_act(ActionEvent event) {
                try {
            Parent root = FXMLLoader.load(getClass().getResource("send_email.fxml"));
               Stage mainStage = new Stage();
                Scene scene = new Scene(root);
                mainStage.setScene(scene);
                mainStage.show();
        } catch (IOException ex) {
            Logger.getLogger(AcceuilController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    
}
