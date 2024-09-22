package com.aluracursos.moviesStarwards.models;

import java.util.Arrays;

public record PeliculaOmdb(int count, ResultElement[] results) {
    public String toString() {
        String messagge =  """
                PeliculaOmdb
                count: %d
                results: %s
                """.formatted(count,Arrays.toString(results));
        return messagge;
    }
}
