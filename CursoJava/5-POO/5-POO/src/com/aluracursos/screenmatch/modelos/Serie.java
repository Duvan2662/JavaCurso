package com.aluracursos.screenmatch.modelos;

public class Serie extends Titulo {

    private int temporada;

    private int episodiosPorTemporada;

    private int minutosPorEpisodio;

    public Serie(String nombre, int fechaDeLamzamiento) {
        super(nombre, fechaDeLamzamiento);
    }

    @Override
    public String toString() {
        return "Serie: "+this.getNombre() + " ("+ this.getFechaDeLamzamiento()+ ")";
    }

    @Override //Sobre escritura de metodos esta sobreEscribiendo el metodo getDuracionEnMinutos de la clase padre Titulo
    public int getDuracionEnMinutos() {
        return this.temporada * this.episodiosPorTemporada * this.minutosPorEpisodio;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
}
