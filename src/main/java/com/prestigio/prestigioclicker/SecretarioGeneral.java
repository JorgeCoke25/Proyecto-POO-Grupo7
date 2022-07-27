package com.prestigio.prestigioclicker;

import javafx.scene.control.Button;

public class SecretarioGeneral extends Rango{
    public SecretarioGeneral(Alumno alumno) {
        super(alumno);
        this.valor=10000000;
        this.bono=1000000;
        this.activado=false;
        view = new SecretarioGeneral_View(this);
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
