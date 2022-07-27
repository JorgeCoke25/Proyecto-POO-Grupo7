package com.prestigio.prestigioclicker;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.text.DecimalFormat;

public class IWG101_View extends Button {
    public IWG101_View(IWG101 curso){
        Label titulo = new Label("IWG101");
        Label precio = new Label();
        Label cant = new Label();
        Label bono = new Label("Bono +" +String.valueOf(curso.getBono()));
        bono.setStyle("-fx-text-fill: green");
        DecimalFormat df = new DecimalFormat("###,###");
        precio.setText("Prestigio:"+df.format(curso.getValor()).replace(",","."));
        cant.setText(String.valueOf(curso.getCantidad()));
        VBox vb = new VBox();
        setOnAction((event)->{
            if(curso.alumno.getPrestigio()>=curso.getValor()){
                curso.agregarCantidad();
                precio.setText("Prestigio:"+df.format(curso.getValor()).replace(",","."));        cant.setText(String.valueOf(curso.getCantidad()));
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
