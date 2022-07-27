package com.prestigio.prestigioclicker;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Alumno alumno = new Alumno();
        Tienda_View tienda = new Tienda_View(alumno);
        Titulos_view titulos = new Titulos_view(alumno);
        BorderPane pane = new BorderPane();
        HBox hb = new HBox(alumno.getLb());
        hb.setAlignment(Pos.CENTER);
        hb.setStyle("-fx-background-color: #9a1b25;-fx-border-color: black;-fx-border-width: 1 ");
        pane.setTop(hb);
        VBox al = new VBox(alumno.getPuntaje(), alumno.getView());
        al.setAlignment(Pos.CENTER);
        pane.setCenter(al);
        pane.setRight(tienda);
        pane.setLeft(titulos);
        pane.setId("pane");
        Scene scene = new Scene(pane, 1080, 480);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        stage.setTitle("Prestigio Clicker");
        stage.getIcons().add(new Image("https://www.nestleprofessional-latam.com/sites/default/files/styles/product/public/media/prestigio_nuevo.png?itok=8YkS-XZK"));
        stage.setScene(scene);
        stage.show();
    }
}