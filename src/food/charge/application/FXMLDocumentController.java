//*****************************************************************************************************
//
//      File:               FXMLDocumentController.java
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
//      3.  FoodChargeApplication.java  -  Contains the FoodChargeApplication Method.
//
//*****************************************************************************************************

//package food.charge.application;

//*****************************************************************************************************

import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

//*****************************************************************************************************

public class FXMLDocumentController implements Initializable 
{
    
    @FXML
    private TextField mealChargeInputField;
    @FXML
    private TextField tipInputField;
    @FXML
    private TextField taxInputField;
    @FXML
    private TextField totalInputField;
    private final double TIP = 0.18,
            TAX = 0.07;
    
    //*****************************************************************************************************
    
    @FXML
    private void handleButtonAction(ActionEvent event) 
    {
        String mealCharge;
        double mealChargeDouble,
                tip,
                tax,
                total;
        
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        
        Validator v = new Validator();
        
        mealChargeDouble = v.isPresent(mealChargeInputField.getText(), 
                "Meal Charge");
        
        tip = mealChargeDouble * TIP;
        tax = mealChargeDouble * TAX;
        total = mealChargeDouble + tip + tax;
        
        System.out.println(tip + "\n" + tax + "\n" + total);
        
        if(mealChargeDouble != 0)
        {
            tipInputField.setText(nf.format(tip));
            taxInputField.setText(nf.format(tax));
            totalInputField.setText(nf.format(total));
        }
        else
        {
            tipInputField.setText("");
            taxInputField.setText("");
            totalInputField.setText("");
        }
        
    }
    
    //*****************************************************************************************************
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        tipInputField.setEditable(false);
        taxInputField.setEditable(false);
        totalInputField.setEditable(false);
    }    
}
