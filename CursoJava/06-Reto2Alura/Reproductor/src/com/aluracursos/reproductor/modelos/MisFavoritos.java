package com.aluracursos.reproductor.modelos;

public class MisFavoritos {
    public void adicion(Audio audio){
        if (audio.getClasificacion()>=8){
            System.out.println("""
                    %s
                    Es uno de los favoritos del momento
                    """.formatted(audio.getTitulo()));
        }else{
            System.out.println("""
                    %s
                    Ha estado muy suavesongo
                    """.formatted(audio.getTitulo()));
        }
    }
}
