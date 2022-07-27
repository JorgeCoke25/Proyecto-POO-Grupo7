package com.prestigio.prestigioclicker;

import javafx.scene.control.Label;
import javafx.scene.text.Font;

import java.text.DecimalFormat;

public class Alumno {
    public Alumno(){
        this.prestigio=0;
        this.aumento=1;
        puntaje = new Label();
        puntaje.setStyle("-fx-text-fill: green");
        puntaje.setFont(new Font(20));
        view = new Alumno_View(this);
        lb= new Label("Prestigio por click: "+String.valueOf(aumento));
        lb.setFont(new Font(20));
    }

    public void subirPrestigio(){
        this.prestigio+=aumento;

    }

    public void setPrestigio(long prestigio) {
        this.prestigio = prestigio;
    }

    public void subirPrestigio(int aumento){
        this.prestigio+=aumento;
    }
    public void descontarPrestigio(float desc){
        this.prestigio-=desc;
    }

    public long getPrestigio(){
        return this.prestigio;
    }

    public long getAumento() {
        return aumento;
    }

    public Alumno_View getView(){
        return this.view;
    }

    public Label getLb() {
        return this.lb;
    }

    public Label getPuntaje() {
        return puntaje;
    }

    public void subirAumento(float aumento) {
        DecimalFormat df = new DecimalFormat("###,###");
        this.aumento += aumento;
        this.lb.setText("Prestigio por click: "+df.format(this.aumento).replace(",","."));
    }

    private long prestigio;
    private long aumento;
    private Alumno_View view;
    private Label lb;
    private Label puntaje;
}
