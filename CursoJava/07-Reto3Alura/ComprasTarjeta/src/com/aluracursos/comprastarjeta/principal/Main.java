package com.aluracursos.comprastarjeta.principal;

import com.aluracursos.comprastarjeta.calculos.CalculadoraTotal;
import com.aluracursos.comprastarjeta.modelos.Compra;
import com.aluracursos.comprastarjeta.modelos.Tarjeta;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        var calcular = new CalculadoraTotal();
        ArrayList<Compra> listaProductos = new ArrayList<>();
        int opc;


        System.out.println("Por favor escriba el limite de su tarjeta");
        var tarjetaUsuario = new Tarjeta(teclado.nextDouble());

        do{
            String producto = "";
            System.out.println("Escriba la descripción del producto:");
            while (producto.isEmpty()) {
                producto = teclado.nextLine().trim(); // Trim elimina espacios en blanco al principio y final
            }
            System.out.println("Escriba el precio del producto");
            double precio = teclado.nextDouble();
            var compra = new Compra(producto,precio);
            calcular.precioTotal(compra);
            if ( compra.getPrecio() < tarjetaUsuario.getCupoTarjeta() ){
                tarjetaUsuario.restarSaldo(compra.getPrecio());
                System.out.println("Compra realizada!");
                listaProductos.add(compra);
                System.out.println("Escriba 0 para salir o 1 para continuar");
                opc = teclado.nextInt();
            }else{
                System.out.println("¡¡Saldo insuficiente!!");
                mensajeSalida(listaProductos,tarjetaUsuario.getCupoTarjeta());
                break;
            }

            if (opc == 0){
                mensajeSalida(listaProductos,tarjetaUsuario.getCupoTarjeta());
                break;
            }

        }while(opc != 0);




    }

     public static void mensajeSalida(ArrayList listaProductos, double saldoTarjeta) {
        listaProductos.sort(Comparator.comparing(Compra::getPrecio));
        System.out.println("""
                **********************************
                COMPRAS REALIZADAS
                """);
        listaProductos.forEach(item -> System.out.println(item));
        System.out.println("\n**********************************\n");
         System.out.println("El saldo de la tarjeta es: " + saldoTarjeta);
    }



}