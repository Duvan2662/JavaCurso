package com.aluracursos.reproductor.modelos;

public class Audio {
    //Propiedades
    private String titulo;
    private int duracion;
    private int totalReproducciones;
    private int meGusta;
    private int clasificacion;

    //Metodos


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getTotalReproducciones() {
        return totalReproducciones;
    }

    public int getMeGusta() {
        return meGusta;
    }


    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }


    public void meGusta(){
        this.meGusta++;
    }

    public void reproducir(){
        this.totalReproducciones ++;
    }

}
