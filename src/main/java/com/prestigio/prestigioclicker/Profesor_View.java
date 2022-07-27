package com.prestigio.prestigioclicker;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.text.DecimalFormat;

public class Profesor_View extends Button {
    public Profesor_View(Profesor persona){
        DecimalFormat df = new DecimalFormat("###,###");
        Label titulo = new Label("Profesor");
        Label precio = new Label();
        Label bono = new Label("Bono +"+df.format(persona.getBono()).replace(",",".")+"\npor segundo");
        precio.setText("Prestigio:"+df.format(persona.getValor()).replace(",","."));
        bono.setStyle("-fx-text-fill: green");
        VBox vb = new VBox();
        setOnAction((event)->{
            if(persona.alumno.getPrestigio()>=persona.getValor()){
                persona.subirRango();
                setDisable(true);
            }
        });
        vb.setAlignment(Pos.CENTER);
        vb.getChildren().addAll(titulo,precio,bono);
        setGraphic(vb);
        setMinWidth(150);
        setMaxWidth(200);
    }
}
