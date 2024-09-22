package com.aluracursos.moviesStarwards.principal;

import com.aluracursos.moviesStarwards.models.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        var conectionOfServices = new Conexion();
        var menu = new Menu();
        ArrayList<Pelicula> listaMenu;
        ArrayList<ResultElement> peliculasUsuario = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();


        String jsonResponse = conectionOfServices.listaPeliculas();
        menu.conversion(jsonResponse);
        menu.crearMenu();
        listaMenu = menu.getMenu();

        while(true){
            int opc;
            System.out.println("\nSeñor usuario digite 0 para salir del menu o escoja una de las peliculas para mirar su informacion");
            listaMenu.forEach(item ->{
                    System.out.println("("+item.getIndice()+") - " + item.getNombre());
                    });


            opc = teclado.nextInt();
            if (opc > 6) {
                System.out.println("Opción no válida");
            } else if (opc != 0) {
                mostrarInformacion(conectionOfServices, opc, peliculasUsuario);
            } else {
                break;
            }
        }
        FileWriter escritura = new FileWriter("peliculasUsuario.json");
        escritura.write(gson.toJson(peliculasUsuario));
        escritura.close();
    }

    public static void mostrarInformacion (Conexion conectionOfServices, int opc, ArrayList<ResultElement> peliculasUsuario) throws IOException, InterruptedException {
        String jsonResponseUser = conectionOfServices.peliculaUsuario(opc);
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        PeliculaUserOmdb pelicularesponse = gson.fromJson(jsonResponseUser,PeliculaUserOmdb.class);
        ResultElement pelicula = new ResultElement(pelicularesponse);
        peliculasUsuario.add(pelicula);
        System.out.println(pelicula);
    }

}