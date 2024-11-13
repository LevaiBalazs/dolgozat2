/*
* File: mainController.java
* Author: Lévai Balázs
* Copyright: 2024, Lévai Balázs
* Group: Szoft II/1/N
* Date: 2024-11-12
* Github: https://github.com/levaibalazs/
* Licenc: GNU GPL
*/

package com.example;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private TextField aField;

    @FXML
    private TextField areaField;

    @FXML
    private TextField bField;

    @FXML
    private TextField cField;

    @FXML
    private TextField dField;

    @FXML
    private Button alertButton;

    @FXML
    private void showAlert() {
        // Create an alert
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Készítette");
        alert.setHeaderText(null);
        alert.setContentText("Lévai Balázs");

        // Show the alert
        alert.showAndWait();
    }


    @FXML
    void gombExit(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void gombCalc(ActionEvent event) {
        startCalc();
    }
    private void startCalc() {
        String a = aField.getText();
        String b = bField.getText();
        String c = cField.getText();
        String d = dField.getText();

        double aDouble = Double.parseDouble(a);
        double bDouble = Double.parseDouble(b);
        double cDouble = Double.parseDouble(c);
        double dDouble = Double.parseDouble(d);

        double area = calcArea(aDouble, bDouble, cDouble, dDouble);
        areaField.setText(String.valueOf(area));

        calcArea(aDouble, bDouble, cDouble, dDouble);
    }

    private double calcArea(double a, double b, double c, double d) {
        double area = ((a+c) / (4*(a-c))) * Math.sqrt(((a+b-c+d) * (a-b-c+d) * (a+b-c-d) * (-a+b+c+d)));
        return area;
    }

}
