/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication7;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Streeksoft
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Label label1;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        //label.setText("Hello World!");
        
        User myNewUser = new User();
        myNewUser.setName("Frits");
        myNewUser.setFullName("Frits", "Bosschert");
        
        Car myCar = new Car(myNewUser);
        
        
         // label.setText( myNewUser.getName() );
         label.setText(  MyStaticClass.welcomeText );
         
         label1.setText( myCar.getOwner().getFullName()  );
         
         //User carOwner = myCar.getOwner(); 
        //label.setText( carOwner.getName() );
        
         
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
