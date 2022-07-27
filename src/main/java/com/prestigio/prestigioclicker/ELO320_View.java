package com.prestigio.prestigioclicker;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.text.DecimalFormat;
import java.util.Timer;

public class ELO320_View extends Button {
    public ELO320_View(ELO320 curso){
        Label titulo = new Label("EL0320");
        Label precio = new Label();
        Label cant = new Label();
        DecimalFormat df = new DecimalFormat("###,###");
        Label bono = new Label("Bono +"+df.format(curso.getBono()).replace(",","."));
        precio.setText("Prestigio:"+df.format(curso.getValor()).replace(",","."));
        bono.setStyle("-fx-text-fill: green");
        cant.setText(String.valueOf(curso.getCantidad()));
        VBox vb = new VBox();
        setOnAction((event)->{
            if(curso.alumno.getPrestigio()>=curso.getValor()){
                curso.agregarCantidad();
                precio.setText("Prestigio:"+df.format(curso.getValor()).replace(",","."));
                cant.setText(String.valueOf(curso.getCantidad()));
            }
        });
        vb.setAlignment(Pos.CENTER);
        vb.getChildren().addAll(titulo,precio,cant,bono);
        setGraphic(vb);
        setMinWidth(150);
        setMaxWidth(200);
    }
}
