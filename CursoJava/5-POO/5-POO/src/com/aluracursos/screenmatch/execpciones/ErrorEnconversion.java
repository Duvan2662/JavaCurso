package com.aluracursos.screenmatch.execpciones;

public class ErrorEnconversion extends RuntimeException {

    private String mensaje;
    public ErrorEnconversion(String mensaje) {
    this.mensaje = mensaje;
    }

    public String getMensaje() {
        return this.mensaje;
    }
}
