//*****************************************************************************************************
//
//      File:               Validator.java
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
//      2.  FoodChargeApplication.java  -  Contains the FoodChargeApplication Method.
//      3.  FXMLDocumentController.java  -  Contains the FXMLDocumentController Class.
//
//*****************************************************************************************************

//package food.charge.application;

//*****************************************************************************************************

import javafx.scene.control.Alert;

//*****************************************************************************************************

public class Validator 
{
        public Alert alert = new Alert(Alert.AlertType.ERROR);
    
    //*****************************************************************************************************
    
    public Validator()
    {
        alert.setTitle("Error");
        alert.setHeaderText("Error");
    }
    
    //*****************************************************************************************************
    
    public double isPresent(String value, String name)
    {
        double mealChargeDouble = 0;
        
        if(value.isEmpty())
        {
           alert.setContentText(name + " must not be empty.");
           alert.showAndWait();
        }
        else
        {
            mealChargeDouble = isDouble(value, name, mealChargeDouble);
        }
        
        return mealChargeDouble;
    }
    
    //*****************************************************************************************************
    
    public double isDouble(String value, String name, double mealChargeDouble)
    {
        mealChargeDouble = 0;
        
        try
        {
            mealChargeDouble = Double.parseDouble(value);
        }
        catch(NumberFormatException e)
        {
            alert.setContentText(name + " must be a decimal value.");
            alert.showAndWait();
        }
        
        return mealChargeDouble;
    }
}
