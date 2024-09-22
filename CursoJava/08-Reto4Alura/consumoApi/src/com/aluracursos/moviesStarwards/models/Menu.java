package com.aluracursos.moviesStarwards.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Pelicula> menu = new ArrayList<>();
    private PeliculaOmdb menuresponse;

    public void conversion (String jsonResponse) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        this.menuresponse = gson.fromJson(jsonResponse,PeliculaOmdb.class);
//        System.out.println(menuresponse);
    }

    public void crearMenu() {
        int tamanoArregloPeliculas = this.menuresponse.count();

        for (int i = 0; i < tamanoArregloPeliculas; i++) {
            ResultElement elemento = this.menuresponse.results()[i];
            var pelicula = new Pelicula(i+1,elemento.getTitle());
            this.menu.add(pelicula);
        }
//        this.menu.forEach(System.out::println);
    }

    public ArrayList<Pelicula> getMenu() {
        return menu;
    }
}
