module com.example.redsocial {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.example.redsocial to javafx.fxml;
    exports com.example.redsocial;
    exports com.example.redsocial.controller;
    opens com.example.redsocial.controller to javafx.fxml;
    opens com.example.redsocial.modelo to javafx.fxml;

}