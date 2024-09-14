import java.util.Scanner;

public class CicloFor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Escribe la nota que le daria a la pelicula Matrix");
            nota = teclado.nextDouble();
            mediaEvaluaciones += nota;
        }
        System.out.println("La media de evaluaciones de la pelicula es: " + mediaEvaluaciones/3);

    }
}
