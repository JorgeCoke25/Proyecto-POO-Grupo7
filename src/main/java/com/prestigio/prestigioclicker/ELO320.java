package com.prestigio.prestigioclicker;

import javafx.scene.control.Button;

public class ELO320 extends Ramo{
    public ELO320(Alumno alumno){
        super(alumno);
        this.valor=100000;
        this.cantidad=0;
        this.bono=10000;
        view= new ELO320_View(this);
    }

    public void agregarCantidad(){
        alumno.descontarPrestigio(valor);
        cantidad+=1;
        valor*=1.5;
        valor= Math.round(valor);
        alumno.subirAumento(bono);
        alumno.getView().setTittle(alumno.getPrestigio());
    }

    public Button getView() {
        return view;
    }

    public long getValor() {
        return valor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getBono() {
        return bono;
    }
    private int bono;

    private long valor;
    private int cantidad;

    private Button view;
}
