package com.prestigio.prestigioclicker;

import javafx.scene.control.Button;

public class MAT023 extends Ramo{
    public MAT023(Alumno alumno){
        super(alumno);
        this.valor=1000000;
        this.cantidad=0;
        this.bono=100000;
        view= new MAT023_View(this);
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
