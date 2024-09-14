import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre  = "Toni Starck";
        String tipoCuenta = "Corriente";
        double saldoDisponible = 1599.99;
        int opcionUsuario;
        double valorRetirar;
        double valorDepositar;
        String mensaje = """
                ******************************************
                
                Nombre del cliente: %s
                Tipo de cuenta: %s
                Saldo disponible: %f$
                
                ******************************************
                """.formatted(nombre,tipoCuenta,saldoDisponible);


        System.out.println(mensaje);
        do{
            System.out.println("""
                    ** Escriba el numero de la opcion deseada **
                    1 - Consultar saldo
                    2 - Retirar
                    3 - Depositar
                    9 - Salir
                    """);
            opcionUsuario = teclado.nextInt();

            switch (opcionUsuario){
                case 1:
                    System.out.println("El saldo actualizado es: " + saldoDisponible);
                    break;
                case 2:
                    System.out.println("¿Cual es el valor que deseas retirar?");
                    valorRetirar = teclado.nextDouble();
                    if (valorRetirar<saldoDisponible){
                        saldoDisponible -= valorRetirar;
                        System.out.println("Saldo restante: " + saldoDisponible);
                    }else{
                        System.out.println("Saldo insuficiente\n");
                    }
                    break;
                case 3:
                    System.out.println("¿Cual es el valor que vas a depositar?");
                    valorDepositar = teclado.nextDouble();
                    saldoDisponible += valorDepositar;
                    System.out.println("El saldo actualizado es: " + saldoDisponible);
                    break;
                case 9:
                    System.out.println("Finalizado el programa. Muchas gracias por usar nuestro servicio");
                    break;
                default:
                    System.out.println("Opcion no valida");

            }

        }while(opcionUsuario != 9);
    }
}