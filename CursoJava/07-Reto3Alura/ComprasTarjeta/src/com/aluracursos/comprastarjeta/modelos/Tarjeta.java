package com.aluracursos.comprastarjeta.modelos;

public class Tarjeta {
    private double cupoTarjeta;

    public double getCupoTarjeta() {
        return cupoTarjeta;
    }

    public Tarjeta(double cupoTarjeta) {
        this.cupoTarjeta = cupoTarjeta;
    }

    public void restarSaldo(double restar){
        this.cupoTarjeta -= restar;
    }

}
