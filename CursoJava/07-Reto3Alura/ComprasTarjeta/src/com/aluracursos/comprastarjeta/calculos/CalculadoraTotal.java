package com.aluracursos.comprastarjeta.calculos;

import com.aluracursos.comprastarjeta.modelos.Compra;

public class CalculadoraTotal {
    private double totalCompra = 0;

    public double precioTotal (Compra producto) {
        return this.totalCompra += producto.getPrecio();
    }
}
