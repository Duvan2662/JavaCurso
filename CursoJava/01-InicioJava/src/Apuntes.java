import static java.lang.String.format;

public class Apuntes {
    public static void main(String[] args) {

        //Comparar string en java equals()
        String contrasena= "12345";
        if (contrasena.equals("12345")) {
            System.out.println("Acceso autorizado!");
        } else {
            System.out.println("Contraseña incorrecta.");
        }

        //Formatear textos en una cadena string
        String nombre = "Maria";
        int edad = 30;
        double valor = 55.9999;
        System.out.println(format("Mi nombre es %s, tengo %d años y hoy gasté %.2f dolares", nombre, edad, valor));

        String nombre2 = "Pepito";
        int aulas = 4;
        String mensaje= """
                  Hola, %s!
                  Bienvenido al curso de Java.
                  Tendremos %d aulas para mostrarte lo que es necesario para que puedas dar tu primeros pasos en este lenguaje                  """.formatted(nombre2, aulas);
        System.out.println(mensaje);

        //Casting implicito se usa para Parsear un valor pero java lo puede hacer sin necesidad de un metodo
        int x = 10;
        double y = x; // casting implícito

        //Cating explicito se usa para Parsear un valor directamente indicandole
        double z = 10.5;
        int w = (int) z; // casting explícito


        //SwitchCase
        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("El día 1 es lunes");
                break;
            case 2:
                System.out.println("El día 2 es martes");
                break;
            case 3:
                System.out.println("El día 3 es miércoles");
                break;
            // otros casos posibles...
            default:
                System.out.println("Día no válido");
        }

    }
}
