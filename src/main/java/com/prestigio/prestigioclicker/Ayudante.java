package com.prestigio.prestigioclicker;

import javafx.scene.control.Button;

public class Ayudante extends Rango {
    public Ayudante(Alumno alumno) {
        super(alumno);
        this.valor=100;
        this.bono=10;
        this.activado=false;
        view = new Ayudante_View(this);
    }

    public void subirRango() {
        this.activado=true;
    }

    public int getBono() {
        return bono;
    }

    public long getValor() {
        return valor;
    }

    public boolean isActivado() {
        return activado;
    }

    public Button getView() {
        return view;
    }

    private long valor;
    private boolean activado;
    private int bono;
    private Button view;
}
