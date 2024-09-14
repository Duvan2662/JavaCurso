import java.util.Scanner;

public class CicloWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluacion = 0;
        double totalEvaluaciones = 3;

        while (totalEvaluaciones != 0) {
            System.out.println("Escribe la nota que le daria a la pelicula Matrix");
            nota = teclado.nextDouble();
            mediaEvaluacion += nota;
            totalEvaluaciones --;
        }
        System.out.println("La media de evaluaciones de la pelicula es: " + mediaEvaluacion/3);
    }
}
