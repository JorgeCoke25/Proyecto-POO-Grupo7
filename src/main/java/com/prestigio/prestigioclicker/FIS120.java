package com.prestigio.prestigioclicker;

import javafx.scene.control.Button;

public class FIS120 extends Ramo{
    public FIS120(Alumno alumno){
        super(alumno);
        this.valor=10000000;
        this.cantidad=0;
        this.bono=1000000;
        view= new FIS120_View(this);
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

    public long getBono() {
        return bono;
    }
    private long bono;

    private long valor;
    private int cantidad;

    private Button view;
}
