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
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * FXML Controller class
 *
 * @author soltani med ala
 */
public class Page_mainController implements Initializable {

    @FXML
    private Button afficher;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
     private void afficher(ActionEvent event) {
        
                 Statement stmt = null;
Connection conn=null;
        try {

  conn = DriverManager.getConnection("jdbc:mysql://localhost/ala?user=ala&password=Ala123*");
  
  stmt = conn.createStatement();
 String  requete_sql="select * from nutritionniste ;";
  ResultSet res=stmt.executeQuery(requete_sql);
  
   String columns[] = { "id", "nom", "prenom","num","adress","	email" };
      String data[][] = new String[6][6];
        int i = 0;
      while (res.next()) {
          
      
      
        int id = res.getInt("id");
        String nom = res.getString("nom");
        String prenom = res.getString("prenom");
        String tel = res.getString("num");
        String mail = res.getString("adress");
        String add = res.getString("email");
        data[i][0] = id + "";
        data[i][1] = nom;
        data[i][2] = prenom;
        data[i][3] = tel;
         data[i][4] = mail;
          data[i][5] = add;
        i++;
      }
      
        DefaultTableModel model = new DefaultTableModel(data, columns);
      JTable table = new JTable(model);
      table.setShowGrid(true);
      table.setShowVerticalLines(true);
      JScrollPane pane = new JScrollPane(table);
      JFrame f = new JFrame("Nutritionnistes");
      JPanel panel = new JPanel();
      panel.add(pane);
      f.add(panel);
      f.setSize(500, 250);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setVisible(true);
  
  
  
  
  conn.close();
res.close();
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
    

