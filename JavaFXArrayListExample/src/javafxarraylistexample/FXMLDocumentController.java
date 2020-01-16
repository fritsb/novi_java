/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxarraylistexample;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Streeksoft
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private ComboBox list;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You selected the following student:" + list.getValue() );
        label.setText("Hello World!");
        
        try {
            // Following lines will load the second fxml-file
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("StudentFXML.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));  
            stage.show();
            
            // Following lines will pass data to the second controller, so we can use data from first view in second view
            StudentFXMLController controller = fxmlLoader.<StudentFXMLController>getController();
            controller.setLabelName(list.getValue().toString());
            
            
            

        }
        catch(Exception e) {
            System.out.println("Exception loading fxml");
            
            
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Student student1 = new Student("Piet");
        Student student2 = new Student("Jan");
        Student student3 = new Student("Katrien");
        
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        
        for(int i = 0; i < students.size(); i++ ) {
            Student tempstudent = students.get(i);
            list.getItems().add(tempstudent.getName());
        }
    }    
    
}
