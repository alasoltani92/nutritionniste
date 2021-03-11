/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutsp1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author soltani med ala
 */
public class Recherch_poidsController implements Initializable {

    @FXML
    private TextField taille;
    @FXML
    private TextField poids;
    @FXML
    private ComboBox<String> sexe;
   //  private ObservableList<String> listsexe = FXCollections.observableArrayList("femme","homme");
    @FXML
    private Button calcul;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //sexe.setItems(listsexe);
    }    
    
}
