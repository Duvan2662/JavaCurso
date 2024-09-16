package com.aluracursos.screenmatch.calculos;
import com.aluracursos.screenmatch.modelos.Titulo;


public class CalculadoraDeTiempo {
    //Propiedades
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    //Metodos
    public void  incluye(Titulo titulo){//Polimorfismo
        tiempoTotal += titulo.getDuracionEnMinutos();
    }

}
