package com.aluracursos.reproductor.modelos;

public class Potcast extends Audio {
    private String presentador;
    private String descripccion;


    @Override
    public int getClasificacion() {
        if (getTotalReproducciones()>100) {
            return 8;
        }else {
            return 4;
        }
    }

    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public String getDescripccion() {
        return descripccion;
    }

    public void setDescripccion(String descripccion) {
        this.descripccion = descripccion;
    }
}
