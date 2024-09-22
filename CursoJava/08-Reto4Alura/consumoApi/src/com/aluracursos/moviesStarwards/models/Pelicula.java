package com.aluracursos.moviesStarwards.models;

public class Pelicula {
    private String nombre;
    private int indice;


    public Pelicula(int indice , String nombre) {
        this.nombre = nombre;
        this.indice = indice;
    }

    @Override
    public String toString() {
        String mensaje =
                """
                (%s) %s
                """.formatted(this.indice,this.nombre);

        return mensaje;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIndice() {
        return indice;
    }
}
