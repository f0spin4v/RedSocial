package com.example.redsocial.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;

import java.io.IOException;


public class VendedorController {


    @FXML
    private Button btnAgregarProducto_vendedor;

    @FXML
    private Button btnCharla_vendedor16;

    @FXML
    private Button btnComentarios_vendedor17;

    @FXML
    private Button btnGestionarAliados_vendedor16;

    @FXML
    private Button btnMeGusta_vendedor16;

    @FXML
    private Button btnSalir;

    @FXML
    private Button btnVerMegustas_vendedor17;

    @FXML
    private TableColumn<?, ?> colApellidoAliado9;

    @FXML
    private TableColumn<?, ?> colEstadoProducto9;

    @FXML
    private TableColumn<?, ?> colEstadoProductoVendedorActual9;

    @FXML
    private TableColumn<?, ?> colFechaPublicacionProducto9;

    @FXML
    private TableColumn<?, ?> colMeGustaProducto9;

    @FXML
    private TableColumn<?, ?> colNombreAliado9;

    @FXML
    private TableColumn<?, ?> colNombreProducto9;

    @FXML
    private TableColumn<?, ?> colNombreProductoVendedorActual9;

    @FXML
    private TableColumn<?, ?> colPrecioProducto9;

    @FXML
    private TableColumn<?, ?> colPrecioProductoVendedorActual9;

    @FXML
    private ImageView imageView9;

    @FXML
    private Label lbNombre9;

    @FXML
    private Label lblApellido9;

    @FXML
    private Label lblCedula9;

    @FXML
    private Label lblLikes9;

    @FXML
    private TableView<?> tblAliadosVendedor9;

    @FXML
    private Tab tblListaProductos6;

    @FXML
    private TableView<?> tblListaProductosVendedorActual9;

    @FXML
    private TableView<?> tblListaProductosVendedorAliado9;
    public void agregarProducto_vendedor1ViewAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/redsocial/AgregarProductoView.fxml"));
            Parent root = loader.load();
            AgregarProductoController controlador = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Agregar producto");
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
            Stage myStage = (Stage) this.btnSalir.getScene().getWindow();
            myStage.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void salir(ActionEvent actionEvent) {
    }

    public void comentarios_vendedor1ViewAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/redsocial/ComentariosView.fxml"));
            Parent root = loader.load();
            ComentariosController controlador = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Chat");
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
            Stage myStage = (Stage) this.btnSalir.getScene().getWindow();
            myStage.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void btnMeGusta(ActionEvent actionEvent) {
    }

    public void verMeGustasProductoSelecionado1(ActionEvent actionEvent) {
    }

    public void gestionarAliados_vendedor1ViewAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/redsocial/GestionarAmigosView.fxml"));
            Parent root = loader.load();
            GestionarAmigosController controlador = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Chat");
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
            Stage myStage = (Stage) this.btnSalir.getScene().getWindow();
            myStage.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void iniciarCharla_vendedor1ViewAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/redsocial/ChatView.fxml"));
            Parent root = loader.load();
            ChatController controlador = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Chat");
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
            Stage myStage = (Stage) this.btnSalir.getScene().getWindow();
            myStage.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
