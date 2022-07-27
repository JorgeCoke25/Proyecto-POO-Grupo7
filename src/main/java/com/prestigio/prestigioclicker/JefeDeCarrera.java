package com.prestigio.prestigioclicker;

import javafx.scene.control.Button;

public class JefeDeCarrera extends Rango{
    public JefeDeCarrera(Alumno alumno) {
        super(alumno);
        this.valor=750000;
        this.bono=75000;
        this.activado=false;
        view = new JefeDeCarrera_View(this);
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
