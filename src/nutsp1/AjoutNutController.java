/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutsp1;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 *
 * @author soltani med ala
 */
public class AjoutNutController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField nom;
    
    @FXML
    private TextField prenom;
    
    @FXML
    private TextField add;
    
    @FXML
    private TextField email;
    @FXML
    private TextField tel;
    
    @FXML
    private void AjoutNut(ActionEvent event) {
        //TextField txt = (TextField ) scene.lookup("#myTxtID");
        ajouter_nut();
    }
    @FXML
       private void btnAnnul(ActionEvent event) {
        label.setText("tahaaa!");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    public Connection connect_to_data()
    {
        
        Connection conn=null;
      try {

  conn = DriverManager.getConnection("jdbc:mysql://localhost/ala?user=ala&password=Ala123*");
  return conn;
      }
       catch (SQLException ex) {
    // handle any errors
    System.out.println("SQLException: " + ex.getMessage());
    System.out.println("SQLState: " + ex.getSQLState());
    System.out.println("VendorError: " + ex.getErrorCode());
    return conn;
}
    
    
    }
    private void ajouter_nut(){
        String requete_sql;
        Statement stmt = null;
        Connection conn= connect_to_data();
      try {

 // conn = DriverManager.getConnection("jdbc:mysql://localhost/ala?user=ala&password=Ala123*");
  
  stmt = conn.createStatement();
   requete_sql="INSERT INTO nutritionniste (`nom`, `prenom`, `adress`, `num`, `email`)"
           + " VALUES('"+nom.getText()+"','"+prenom.getText()+"','"+add.getText()+
           "','"+tel.getText()+"','"+email.getText()+"');";
  stmt.executeUpdate(requete_sql);
 // System.out.println("Insert nutri OK " );
 // label.setText("okkkkkkkkkkkkkkkkkkkkkkk!");
  JOptionPane.showMessageDialog(null,"Nutritionniste ajouté");
}
 catch (SQLException ex) {
    // handle any errors
    System.out.println("SQLException: " + ex.getMessage());
    System.out.println("SQLState: " + ex.getSQLState());
    System.out.println("VendorError: " + ex.getErrorCode());
}
    }
    
}
