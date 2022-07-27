package com.prestigio.prestigioclicker;

public abstract class Rango {
    public Rango(Alumno alumno) {this.alumno =alumno;}
    public abstract void subirRango();
    protected Alumno alumno;
}
