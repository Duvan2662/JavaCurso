package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificable;

public class Pelicula extends Titulo implements Clasificable {

    private String director;


    public Pelicula(String nombre, int fechaDeLamzamiento ) {
        super(nombre, fechaDeLamzamiento);
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int  getClasificacion() {
        return (int) (calcularMedia()/2);
    }

    @Override
    public String toString() {
        return "Pelicula: " + this.getNombre() + " (" + this.getFechaDeLamzamiento() + ")";
    }
}

