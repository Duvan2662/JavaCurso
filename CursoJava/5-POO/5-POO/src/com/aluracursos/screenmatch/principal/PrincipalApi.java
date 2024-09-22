package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.execpciones.ErrorEnconversion;
import com.aluracursos.screenmatch.modelos.Titulo;
import com.aluracursos.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalApi {
    public static void main(String[] args) throws IOException, InterruptedException {

        String baseUrl = "https://www.omdbapi.com/?";
        String apikey = "&apikey=ed2932eb";
        String movie;
        String movieUrl;
        Scanner keyboard = new Scanner(System.in);
        List<Titulo> misPeliculas = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (true){
            System.out.println("Escriba el nombre de la pelicula que desea buscar");
            movie = keyboard.nextLine();
            movieUrl = URLEncoder.encode(movie, StandardCharsets.UTF_8);
            if (movie.equalsIgnoreCase("salir")){
                break;
            }

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(baseUrl + "t=" + movieUrl + apikey))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String jsonResponse = response.body();
                System.out.println(jsonResponse);



                TituloOmdb miMovieOfServices = gson.fromJson(jsonResponse, TituloOmdb.class);
                System.out.println("Mi pelicula: " + miMovieOfServices);

                Titulo pelicula = new Titulo(miMovieOfServices);
                System.out.println(pelicula);

                misPeliculas.add(pelicula);



            } catch (NumberFormatException e) {
                System.out.println("Ocurrio un error: ");
                System.out.println(e.getMessage());
            }catch (IllegalArgumentException e){
                System.out.println("Ocurrio un error en la URL de la request: ");
                System.out.println(e.getMessage());
            }catch (ErrorEnconversion e){
                System.out.println(e.getMessage());
            }

        }
        misPeliculas.forEach(System.out::println);
        FileWriter escritura = new FileWriter("misPeliculas.json");
        escritura.write(gson.toJson(misPeliculas));
        escritura.close();

        System.out.println("Finalizo la ejecucion del programa");


    }

}
