package com.prestigio.prestigioclicker;

import javafx.beans.InvalidationListener;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class Tienda_View extends VBox{
    public Tienda_View(Alumno alumno){

        GridPane gp = new GridPane();
        gp.setStyle("-fx-background-color: #9a1b25;-fx-border-color: black");
        gp.setHgap(10);
        gp.setVgap(10);
        gp.setPadding(new Insets(0, 10, 0, 10));
        gp.setAlignment(Pos.CENTER);

        IWG101 ing = new IWG101(alumno);
        TEL101 tel = new TEL101(alumno);
        MAT021 mat = new MAT021(alumno);
        FIS110 fis = new FIS110(alumno);
        ELO320 eda = new ELO320(alumno);
        MAT023 mat3= new MAT023(alumno);
        FIS120 fis2= new FIS120(alumno);
        TEL222 fts = new TEL222(alumno);

        Label lb = new Label("Ramos");
        lb.setFont(new Font(20));
        lb.setStyle("-fx-text-fill: #0d2b3f");
        HBox hb = new HBox(lb);
        hb.setAlignment(Pos.CENTER);
        hb.setStyle("-fx-color-label-visible: red");
        gp.add(hb,0,0,2,1);
        gp.add(ing.getView(),0,1);
        gp.add(tel.getView(),1,1);
        gp.add(mat.getView(),0,2);
        gp.add(fis.getView(),1,2);
        gp.add(eda.getView(),0,3);
        gp.add(mat3.getView(),1,3);
        gp.add(fis2.getView(),0,4);
        gp.add(fts.getView(),1,4);

        gp.setPrefHeight(800);
        getChildren().add(gp);
    }
}
