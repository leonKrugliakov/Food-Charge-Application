//*****************************************************************************************************
//
//      File:               FoodChargeApplication.java
//
//      Student:            Leon Krugliakov
//
//      Assignment:         Assignment #10
//
//      Course Name:        Java I
//
//      Course Number:      COSC 2050 - 01
//
//      Due:                April 15th, 2020
//
//
//      This is a program that displays the user with a GUI interface and
//      allows them to calculate the cost of their meal. This application 
//      validates user input for having a value as well as being a double.
//      If the input is invalid, the program sets the input forms to be empty
//      and displays an error alert. If the input is valid, then the program 
//      computes the tip, tax, and total and then displays them to the user.
//
//      Other files required:
//      1.  FXMLDocument.java  -  Contains the application's controller.
//      2.  Validator.java  -  Contains the Validator Class.
//      3.  FXMLDocumentController.java  -  Contains the FXMLDocumentController Class.
//
//*****************************************************************************************************

//package food.charge.application;

//*****************************************************************************************************

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//*****************************************************************************************************

public class FoodChargeApplication extends Application 
{
    
    @Override
    public void start(Stage stage) throws Exception 
    {
        Parent root = FXMLLoader.load(
                getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    
    //*****************************************************************************************************
    
    public static void main(String[] args) 
    {
        launch(args);
    }
    
}
