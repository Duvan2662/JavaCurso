package com.aluracursos.reproductor.principal;

import com.aluracursos.reproductor.modelos.Cancion;
import com.aluracursos.reproductor.modelos.MisFavoritos;
import com.aluracursos.reproductor.modelos.Potcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Patealo fuera de la casa");
        miCancion.setCantante("Hico");
        miCancion.setAlbum("Patealo fuera de la casa");


        Potcast miPodcast = new Potcast();
        miPodcast.setTitulo("La enfermedad del guajiro");
        miPodcast.setPresentador("Gabriel murillo");
        miPodcast.setDescripccion("Potcast de comedia de 3 viejitos");

        for (int i = 0; i < 250; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 250; i++) {
            miCancion.reproducir();
        }
        for (int i = 0; i < 150; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 200; i++) {
            miPodcast.reproducir();
        }

        System.out.println("""
                Cancion: %s
                Cantidad de reproducciones: %d
                Cantidad de megusta: %d
                """.formatted(miCancion.getTitulo(), miCancion.getTotalReproducciones(),miCancion.getMeGusta()));

        System.out.println("""
                Podcast: %s
                Cantidad de reproducciones: %d
                Cantidad de megusta: %d
                """.formatted(miPodcast.getTitulo(), miPodcast.getTotalReproducciones(),miPodcast.getMeGusta()));


        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicion(miCancion);
        favoritos.adicion(miPodcast);

    }
}