package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto",2021);
        miPelicula.evalua(9);
        Pelicula miPelicula2 = new Pelicula("Matrix",2020);
        miPelicula2.evalua(6);
        var miPelicula3 = new Pelicula("El señor de los anillos",180);
        miPelicula3.evalua(10);
        Serie miSerie = new Serie("La casa del dragon",2022);


        Pelicula peliculaPrueba = miPelicula;//No copia el objeto copia la refenrencia del objeto el espacio en memoria


        List<Titulo> lista =new LinkedList<>();
        lista.add(miPelicula);
        lista.add(miPelicula2);
        lista.add(miPelicula3);
        lista.add(miSerie);

//
//        for(Titulo item:lista){
//            System.out.println(item);
//            Pelicula pelicula = (Pelicula) item;
//            System.out.println(pelicula.getClasificacion());
//        }
//

        lista.forEach(item -> {
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion()>3){
                System.out.println(pelicula.getClasificacion());
            }

        });


        ArrayList<String> listaArtistas = new ArrayList<>();
        listaArtistas.add("Bethoven");
        listaArtistas.add("Hico");
        listaArtistas.add("Norick");
        listaArtistas.add("Canserbero");
        listaArtistas.add("Akapellah");



        System.out.println("Lista de artistas no ordenada" + listaArtistas);
        Collections.sort(listaArtistas);
        System.out.println("Lista de artistas ordenada por nombre " + listaArtistas);

        System.out.println("Lista de Titulos no ordenada" + lista);
        Collections.sort(lista);
        System.out.println("Lista de Titulos ordenada por nombre " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLamzamiento));
        System.out.println("Lista de Titulos ordenada por fecha de lanzamiento" + lista);


    }
}
