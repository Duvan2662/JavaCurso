import java.util.Random;
import java.util.Scanner;

import static java.lang.String.format;

public class Main {
    public static void main(String[] args) {
        //Crea un programa que simule un juego de adivinanzas. El programa debe generar un número aleatorio entre 0 y 100,
        //y pedir al usuario que intente adivinar ese número en un máximo de 5 intentos. En cada intento, el programa debe informar
        //si el número ingresado por el usuario es mayor o menor que el número generado.
        //
        //Consejos:
        //Para generar un número aleatorio en Java: new Random().nextInt(100);
        //Utiliza el Scanner para obtener los datos del usuario.
        //Utiliza una variable para contar los intentos.
        //Utiliza un bucle para controlar los intentos.
        //Utiliza la instrucción ‘break;’ para salir del bucle.

        Scanner teclado = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int intentos = 5;
        int opcionUsuario;
        while (intentos != 0){
            System.out.printf(format("Adivina  el numero del 1 al 100\n Cantidad de intentos: %d",intentos));
            System.out.println("\nPor favor digite un numero:");
            opcionUsuario = teclado.nextInt();
            if (opcionUsuario == numeroAleatorio){
                System.out.println("Felicitaciones el numero es " + opcionUsuario + " Ganaste!!!! :)");
                break;
            }
            if (intentos == 1){
                System.out.println("No  conseguiste ganar esta vez :( el numero era " + numeroAleatorio);
            }
            intentos --;
        }
    }



}