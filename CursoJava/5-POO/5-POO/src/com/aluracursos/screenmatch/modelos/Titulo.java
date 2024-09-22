package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.execpciones.ErrorEnconversion;

public class Titulo implements  Comparable<Titulo> {
    private String nombre;

    private int fechaDeLamzamiento;

    private int duracionEnMinutos;

    private boolean incluidosEnElPlan;

    private double sumaDeLasEvaluaciones;

    private int cantidadEvaluaciones;


    public Titulo(String nombre, int fechaDeLamzamiento) {
        this.nombre = nombre;
        this.fechaDeLamzamiento = fechaDeLamzamiento;
    }


    public Titulo(TituloOmdb miMovieOfServices) {
        this.nombre = miMovieOfServices.title();
        this.fechaDeLamzamiento = Integer.parseInt(miMovieOfServices.year());
        if (miMovieOfServices.runtime().contains("N/A")){
            throw new ErrorEnconversion("No pude convertir la duracion por que contiene un N/A");
        }
        this.duracionEnMinutos = Integer.parseInt(miMovieOfServices.runtime().substring(0,1).replace("",""));
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLamzamiento(int fechaDeLamzamiento) {
        this.fechaDeLamzamiento = fechaDeLamzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidosEnElPlan(boolean incluidosEnElPlan) {
        this.incluidosEnElPlan = incluidosEnElPlan;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLamzamiento() {
        return fechaDeLamzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidosEnElPlan() {
        return incluidosEnElPlan;
    }

    public int getCantidadEvaluaciones(){
        return this.cantidadEvaluaciones;
    }

    public void muestraFiichaTecnica(){
        String bolean;
        if (this.incluidosEnElPlan){
            bolean = "Si";
        }else{
            bolean = "No";
        }
        System.out.printf("""
                El nombre de la pelicula es: %s
                Su fecha de lanzamiendo fue en: %d
                Y tiene una duracion de %d minutos.
                Y %s esta incluida en el plan.
                %n""", this.nombre,this.fechaDeLamzamiento,getDuracionEnMinutos(),bolean);
    }

    public void evalua(double nota) {
        this.sumaDeLasEvaluaciones += nota;
        this.cantidadEvaluaciones ++;
    }

    public double calcularMedia() {
        return this.sumaDeLasEvaluaciones / this.cantidadEvaluaciones;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }

    @Override
    public String toString() {
        String mensaje =
                """
                Titulo: %s
                Fecha de lanzamiento: %d
                Duracion en minutos: %d
                """.formatted(this.nombre,this.fechaDeLamzamiento,this.duracionEnMinutos);
        return mensaje;
    }
}
