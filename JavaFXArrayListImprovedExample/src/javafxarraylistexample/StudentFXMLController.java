/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxarraylistexample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Streeksoft
 */
public class StudentFXMLController implements Initializable {
    private Student currentStudent;
    
    @FXML
    private Label studentNameLabel;
    
    @FXML
    private TextField textAge;
    
    @FXML
    private Button closeButton;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void setFormData(String name, int age) {
        studentNameLabel.setText("De volgende student is geselecteerd: " + name);
        textAge.setText(Integer.toString(age));
    }
    
    public void setStudent(Student stud) {
        this.currentStudent = stud;
        this.setFormData(stud.getName(), stud.getAge());
    }
    
    @FXML
    private void handleCloseButtonAction(ActionEvent event) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        // do what you have to do
        stage.close();
    }
    
    @FXML
    private void handleSubmitButtonAction(ActionEvent event) {
        
        // Try-Catch example for checking a number. 
        try {
            int tempAge = Integer.parseInt(textAge.getText());
            //Some operations with the number tempAge
            studentNameLabel.setText("De volgende student is geselecteerd: " + currentStudent.getName() + ". De leeftijd is " + Integer.toString(tempAge    ) );
            
        } catch (NumberFormatException e) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Dialog");
            alert.setHeaderText("Error processing form data");
            alert.setContentText("Ooops, there was an error! Please enter a number. ");
            alert.showAndWait();

            // remove data from textfield
            textAge.setText("");
            
            //Here for example prompt some window notifying user
            System.out.println("Error processing form data! ");
            System.out.println(e);
        }
        
        
        // code from:
        // - https://stackoverflow.com/questions/44184684/how-to-validate-textfield-if-passing-argument-is-string
        // - https://code.makery.ch/blog/javafx-dialogs-official/ 

    }
}
