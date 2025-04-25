package com.finaleddmdp.proyectofinal;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class NuevaPartidaMenuController {
    public Button volverMenuPrincipalButton;
    public Button crearNuevoTableroButton;

    @FXML
    protected void onVolverMenuPrincipalButtonClick() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuPrincipalMenu.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) volverMenuPrincipalButton.getScene().getWindow(); // reuse current stage
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onCrearNuevoTableroClick() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PrimerMenuCreacionTablero.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) crearNuevoTableroButton.getScene().getWindow(); // reuse current stage
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
