package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodios;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto",2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidosEnElPlan(true);
        miPelicula.muestraFiichaTecnica();
        miPelicula.evalua(9.8);
        miPelicula.evalua(5);
        System.out.println("Total de las  evaluaciones de la pelicula: " + miPelicula.getCantidadEvaluaciones());
        System.out.println("Media de las evaluaciones  de la pelicula: " + miPelicula.calcularMedia());

        Pelicula miPelicula2 = new Pelicula("Matrix",2020);
        miPelicula2.setDuracionEnMinutos(150);
        miPelicula2.setIncluidosEnElPlan(false);
        miPelicula2.evalua(9.8);
        miPelicula2.evalua(5);


        Serie miSerie = new Serie("La casa del dragon",2022);
        miSerie.setTemporada(1);
        miSerie.setEpisodiosPorTemporada(10);
        miSerie.setMinutosPorEpisodio(50);
        miSerie.setIncluidosEnElPlan(false);
        miSerie.muestraFiichaTecnica();
        System.out.println("Duracion de toda la temporada: " + miSerie.getDuracionEnMinutos()+ " minutos");



        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(miPelicula2);
        calculadora.incluye(miSerie);
        System.out.println("Tiempo necesario para ver tus titulos favoritos: " + calculadora.getTiempoTotal() + " minutos");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtro(miPelicula);
        Episodios episodios = new Episodios();
        episodios.setNombre("La casa Targaryen");
        episodios.setNumero(1);
        episodios.setSerie(miSerie);
        episodios.setTotalVisualizaciones(50);
        filtroRecomendacion.filtro(episodios);


        var miPelicula3 = new Pelicula("El señor de los anillos",180);
        miPelicula3.setFechaDeLamzamiento(2001);


        ArrayList<Pelicula> listaDePeliculas =new ArrayList<>();

        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(miPelicula2);
        listaDePeliculas.add(miPelicula3);

        System.out.println("Tamaño de la lista de peliculas: "+ listaDePeliculas.size());
        System.out.println("La primera pelicula es: "+ listaDePeliculas.get(0).getNombre());
        System.out.println(listaDePeliculas);
        System.out.println("toString de la pelicula: " + listaDePeliculas.get(0).toString());








    }
}
