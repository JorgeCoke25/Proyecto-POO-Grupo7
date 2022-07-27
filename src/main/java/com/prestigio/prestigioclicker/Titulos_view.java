package com.prestigio.prestigioclicker;

import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

import java.util.Timer;
import java.util.TimerTask;

public class Titulos_view extends VBox {
    public Titulos_view(Alumno alumno){

        GridPane gp = new GridPane();
        gp.setStyle("-fx-background-color: #9a1b25;-fx-border-color: black");
        gp.setHgap(10);
        gp.setVgap(10);
        gp.setPadding(new Insets(0, 10, 0, 10));
        gp.setAlignment(Pos.CENTER);

        Ayudante ayudante = new Ayudante(alumno);
        Practicante practicante = new Practicante(alumno);
        Profesor profesor = new Profesor(alumno);
        JefeDeCarrera jefeDeCarrera = new JefeDeCarrera(alumno);
        SecretarioGeneral secretarioGeneral = new SecretarioGeneral(alumno);
        Rector rector = new Rector(alumno);

        Label lb = new Label("Titulos");
        Label ganancia = new Label("Alumno +0 por segundo");

        ganancia.setFont(new Font(20));
        ganancia.setStyle("-fx-text-fill: white;");

        lb.setFont(new Font(20));
        lb.setStyle("-fx-text-fill: #0d2b3f");
        HBox hb = new HBox(lb);
        hb.setAlignment(Pos.CENTER);
        gp.add(hb,0,0,2,1);
        gp.add(ayudante.getView(),0,1);
        gp.add(practicante.getView(),1,1);
        gp.add(profesor.getView(),0,2);
        gp.add(jefeDeCarrera.getView(),1,2);
        gp.add(secretarioGeneral.getView(),0,3);
        gp.add(rector.getView(),1,3);
        gp.add(ganancia,0,4,2,1);


        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(()->{
                    if (ayudante.isActivado()){
                        alumno.subirPrestigio(ayudante.getBono());
                        alumno.getView().setTittle(alumno.getPrestigio());
                        ganancia.setText("Ayudante +10 por Segundo");
                    }
                    if (practicante.isActivado()){
                        alumno.subirPrestigio(practicante.getBono());
                        alumno.getView().setTittle(alumno.getPrestigio());
                        ganancia.setText("Practicante +260 por Segundo");
                    }
                    if (profesor.isActivado()){
                        alumno.subirPrestigio(profesor.getBono());
                        alumno.getView().setTittle(alumno.getPrestigio());
                        ganancia.setText("Profesor +5.260 por Segundo");
                    }
                    if (jefeDeCarrera.isActivado()){
                        alumno.subirPrestigio(jefeDeCarrera.getBono());
                        alumno.getView().setTittle(alumno.getPrestigio());
                        ganancia.setText("Jefe de Carrera +80.260 por Segundo");
                    }
                    if (secretarioGeneral.isActivado()){
                        alumno.subirPrestigio(secretarioGeneral.getBono());
                        alumno.getView().setTittle(alumno.getPrestigio());
                        ganancia.setText("Secretario General +1.080.260 por Segundo");
                    }
                    if (rector.isActivado()){
                        alumno.subirPrestigio(rector.getBono());
                        alumno.getView().setTittle(alumno.getPrestigio());
                        ganancia.setText("Darcy +6.080.260 por Segundo");
                    }
                });
            }
        }, 0, 1000);


        gp.setPrefHeight(800);
        getChildren().addAll(gp);
    }
}
