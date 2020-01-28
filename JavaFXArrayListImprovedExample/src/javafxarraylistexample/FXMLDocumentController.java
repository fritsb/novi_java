/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxarraylistexample;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
    private ArrayList<Student> students; 
    
    @FXML
    private Label label;
    
    @FXML
    private ComboBox list;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You selected the following student:" + list.getValue() );
        label.setText("Button is clicked!");
        Student stud = (Student) list.getSelectionModel().getSelectedItem();
        
        try {
            // Following lines will load the second fxml-file
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("StudentFXML.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));  
            stage.show();
            
            // Following lines will pass data to the second controller, so we can use data from first view in second view
            StudentFXMLController controller = fxmlLoader.<StudentFXMLController>getController();
            controller.setStudent(stud);
        }
        catch(Exception e) {
            System.out.println("Exception loading fxml");
        }
    }
    
    @FXML
    private void handleSortButtonAction(ActionEvent event) {
        Collections.sort(students);   

        // add arraylist to combobox without a for loop, using a observablelist. 
        ObservableList<Student> oStudentLists = FXCollections.observableArrayList(students);
        list.setItems(oStudentLists);
    }
    
    @FXML
    private void handleReverseSortButtonAction(ActionEvent event) {
        Collections.sort(students, Collections.reverseOrder());   

        // add arraylist to combobox without a for loop, using a observablelist. 
        ObservableList<Student> oStudentLists = FXCollections.observableArrayList(students);
        list.setItems(oStudentLists);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Student student1 = new Student("Piet", 33);
        Student student2 = new Student("Jan", 22);
        Student student3 = new Student("Katrien", 27);
        
        students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        /*
        for(int i = 0; i < students.size(); i++ ) {
            Student tempstudent = students.get(i);
            list.getItems().add(tempstudent.getName());
        }*/
        
        for(Student stud : students) {
            System.out.println("Student: " + stud.toString());            
        }
        
        // add arraylist to combobox without a for loop, using a observablelist. 
        ObservableList<Student> oStudentLists = FXCollections.observableArrayList(students);
        list.setItems(oStudentLists);
    }    
    
}
