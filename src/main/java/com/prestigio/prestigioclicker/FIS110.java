package com.prestigio.prestigioclicker;

import javafx.scene.control.Button;

public class FIS110 extends Ramo{
    public FIS110(Alumno alumno){
        super(alumno);
        this.valor=10000;
        this.cantidad=0;
        this.bono=1000;
        view= new FIS110_View(this);
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
