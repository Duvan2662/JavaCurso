
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a Screen Match");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento = 1999;//Enteros
        boolean incluidoEnElPlan = true;//Boolean
        double notaDeLaPelicula = 8.2; //double

        double media = (8.2 + 6.0 + 9.0)/ 3 ;
        System.out.println("La media es: " + media);

        String sinopsis = """
                Matrix es una paradoja
                La mejor pelicula del fin del milenio
                Fue lanzada en:
                """ + fechaDeLanzamiento + """
                La nota de esta pelicula es de 
                """ + notaDeLaPelicula;

        System.out.println(sinopsis);
        System.out.println(sinopsis);

        int clasificacionCasteo = (int) media/2;
        System.out.println(clasificacionCasteo);
    }
}