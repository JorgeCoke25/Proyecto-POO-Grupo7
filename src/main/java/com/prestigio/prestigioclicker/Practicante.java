package com.prestigio.prestigioclicker;

import javafx.scene.control.Button;

public class Practicante extends Rango{
    public Practicante(Alumno alumno) {
        super(alumno);
        this.valor=2500;
        this.bono=250;
        this.activado=false;
        view = new Practicante_View(this);
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
