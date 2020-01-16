/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxarraylistexample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Streeksoft
 */
public class JavaFXArrayListExample extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    /** 
     * The following sources have been used:
     *  - https://riptutorial.com/javafx/example/8803/passing-data-to-fxml---accessing-existing-controller
     *  - https://docs.oracle.com/javafx/2/ui_controls/combo-box.htm
     *  - http://java-buddy.blogspot.com/2013/06/javafx-combobox-for-custom-object.html
     *  - https://stackoverflow.com/questions/27160951/javafx-open-another-fxml-in-the-another-window-with-button 
     */
    
}
