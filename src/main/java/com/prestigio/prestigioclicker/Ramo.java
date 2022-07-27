package com.prestigio.prestigioclicker;

public abstract class Ramo {
    public Ramo(Alumno alumno){
        this.alumno = alumno;
    }
    public abstract void agregarCantidad();
    protected Alumno alumno;
}
