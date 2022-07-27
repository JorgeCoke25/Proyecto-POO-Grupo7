package com.prestigio.prestigioclicker;

import javafx.scene.control.Button;

public class Rector extends Rango{
    public Rector(Alumno alumno) {
        super(alumno);
        this.valor=50000000;
        this.bono=5000000;
        this.activado=false;
        view = new Rector_View(this);
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
