package com.example.redsocial.controller;

import com.example.redsocial.modelo.Usuario;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    Usuario usuarioLogin ;

    @FXML
    private TextField txtUsuario_loginView;

    @FXML
    private PasswordField txtContraseña_loginView;

    @FXML
    private Button btnIngresar_loginView;

    @FXML
    private Button btnCancelar_loginView;

    @FXML
    private void btnIngresar_loginView() {
        String usuario = txtUsuario_loginView.getText();
        String contraseña = txtContraseña_loginView.getText();

        if (validarCredenciales(usuario, contraseña) && usuarioLogin != null) {
            //mostrarAlerta(Alert.AlertType.INFORMATION, "Login Exitoso", "Bienvenido " + usuario + "!");
            // Aquí podrías redirigir a la siguiente pantalla de tu aplicación
            if(usuarioLogin.isAdmin()== true){


                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/redsocial/RedSocialView.fxml"));
                    Parent root = loader.load();
                    RedSocialController controlador = loader.getController();
                    Scene scene = new Scene(root);
                    Stage stage = new Stage();
                    stage.initModality(Modality.APPLICATION_MODAL);
                    stage.setTitle("Panel Administrador");
                    stage.setScene(scene);
                    stage.setResizable(false);
                    stage.show();
                    Stage myStage = (Stage) this.btnIngresar_loginView.getScene().getWindow();
                    myStage.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }else{
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/redsocial/VendedorView.fxml"));
                    Parent root = loader.load();
                    VendedorController controlador = loader.getController();
                    Scene scene = new Scene(root);
                    Stage stage = new Stage();
                    stage.initModality(Modality.APPLICATION_MODAL);
                    stage.setTitle("Panel Vendedor");
                    stage.setScene(scene);
                    stage.setResizable(false);
                    stage.show();
                    Stage myStage = (Stage) this.btnIngresar_loginView.getScene().getWindow();
                    myStage.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        } else {
            mostrarAlerta(Alert.AlertType.ERROR, "Login Fallido", "Usuario o contraseña incorrectos.");
        }
    }

    @FXML
    private void btnCancelar_loginView() {
        Stage stage = (Stage) btnCancelar_loginView.getScene().getWindow();
        stage.close();
    }

    private boolean validarCredenciales(String usuario, String contraseña) {
        // Lógica de validación. Aquí puedes verificar con datos duros o realizar una consulta a una base de datos.
        // Ejemplo sencillo con datos duros:
        Usuario nuevo = new Usuario (usuario,contraseña,false);

        usuarioLogin = nuevo;

        return "admin".equals(usuario) && "admin123".equals(contraseña);

    }

    private void mostrarAlerta(Alert.AlertType alertType, String titulo, String mensaje) {
        Alert alerta = new Alert(alertType);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
}
