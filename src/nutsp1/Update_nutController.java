/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutsp1;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author soltani med ala
 */
public class Update_nutController implements Initializable {

    @FXML
    private Button btnUpdate;
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
    private Button btnAnnul;
     @FXML
    private Button Rechercher;
      @FXML
    private TextField ID_nut;
    @FXML
    private TextField test;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void AjoutUpdate(ActionEvent event) {
        update_nut();
    }

    @FXML
    private void btnAnnul(ActionEvent event) {
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
      
       private void update_nut(){
        String requete_sql;
        Statement stmt = null;
        Connection conn= connect_to_data();
      try {

 // conn = DriverManager.getConnection("jdbc:mysql://localhost/ala?user=ala&password=Ala123*");
  
  stmt = conn.createStatement();
   requete_sql="update `nutritionniste`  SET `nom`='"+nom.getText()+"', `prenom`='"+prenom.getText()+
           "', `adress`='"+add.getText()+"', `num`='"+tel.getText()+"', `email`='"+email.getText()+"' where id="+ID_nut.getText()+";";
          System.out.println(""+requete_sql);
  stmt.executeUpdate(requete_sql);
 // System.out.println("Insert nutri OK " );
 // label.setText("okkkkkkkkkkkkkkkkkkkkkkk!");
  JOptionPane.showMessageDialog(null,"Nutritionniste modifier ");
  
  conn.close();
}
 catch (SQLException ex) {
    // handle any errors
    System.out.println("SQLException: " + ex.getMessage());
    System.out.println("SQLState: " + ex.getSQLState());
    System.out.println("VendorError: " + ex.getErrorCode());
}
    } 

    @FXML
    private void Rechercher(ActionEvent event) {
        
        recher();
        
        
    }
    
    
    
    
    
           private void recher(){
        String requete_sql;
        Statement stmt = null;
        Connection conn= connect_to_data();
        String nom1="";
      try {

 // conn = DriverManager.getConnection("jdbc:mysql://localhost/ala?user=ala&password=Ala123*");
  
    stmt = conn.createStatement();
   requete_sql="select * from nutritionniste where `id` ="+ID_nut.getText()+";";
  ResultSet rs=stmt.executeQuery(requete_sql);
  
  while(!rs.next())  
System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
 nom1=rs.getString(2).toString();

     nom.setText(nom1); 
prenom.setText(rs.getString("prenom"));
  tel.setText(rs.getString("num"));
  add.setText(rs.getString("adress"));
  email.setText(rs.getString("email"));


conn.close();
rs.close();
stmt.close();
    }
             catch (SQLException ex) {
    // handle any errors
    System.out.println("SQLException: " + ex.getMessage());
    System.out.println("SQLState: " + ex.getSQLState());
    System.out.println("VendorError: " + ex.getErrorCode());
}
    
           }
           
          
      
      
    
}
