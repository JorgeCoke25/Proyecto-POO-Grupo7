package com.prestigio.prestigioclicker;

import javafx.scene.control.Button;

public class Profesor extends Rango{
    public Profesor(Alumno alumno) {
        super(alumno);
        this.valor=50000;
        this.bono=5000;
        this.activado=false;
        view = new Profesor_View(this);
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
