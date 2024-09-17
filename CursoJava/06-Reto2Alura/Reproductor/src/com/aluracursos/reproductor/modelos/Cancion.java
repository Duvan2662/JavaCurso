package com.aluracursos.reproductor.modelos;

public class Cancion extends Audio{
    private String album;
    private String genero;
    private String cantante;


    @Override
    public int getClasificacion() {
        if (getMeGusta()>100){
            return 10;
        }else{
            return 5;
        }
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }
}
