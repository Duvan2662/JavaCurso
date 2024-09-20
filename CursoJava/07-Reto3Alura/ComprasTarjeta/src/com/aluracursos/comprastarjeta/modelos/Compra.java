package com.aluracursos.comprastarjeta.modelos;

public class Compra {
    private String producto;
    private double precio;

    public Compra(String producto, double precio) {
        this.producto = producto;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return this.producto + " - " + this.precio;
    }
}
