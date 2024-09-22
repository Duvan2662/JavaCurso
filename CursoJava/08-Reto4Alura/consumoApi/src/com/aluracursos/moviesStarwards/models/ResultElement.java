package com.aluracursos.moviesStarwards.models;

public class ResultElement {
    private String title;
    private long episodeID;
    private String director;
    private String producer;


    public ResultElement(String title, long episodeID, String director, String producer) {
        this.title = title;
        this.episodeID = episodeID;
        this.director = director;
        this.producer = producer;
    }

    public ResultElement(PeliculaUserOmdb pelicularesponse) {
        this.title = pelicularesponse.title();
        this.episodeID = pelicularesponse.episodeID();
        this.director = pelicularesponse.director();
        this.producer = pelicularesponse.producer();
    }

    public String getTitle() {
        return title;
    }

    public long getEpisodeID() {
        return episodeID;
    }

    public String getDirector() {
        return director;
    }

    public String getProducer() {
        return producer;
    }

    public String toString() {
        String mensaje = """
                Titulo: %s
                Episodio: %d
                Director: %s
                Productores: %s
                """.formatted(title,episodeID,director,producer);
        return mensaje;
    }
}
