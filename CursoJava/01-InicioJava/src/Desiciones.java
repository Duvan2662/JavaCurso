public class Desiciones {

    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;//Enteros
        boolean incluidoEnElPlan = true;//Boolean
        double notaDeLaPelicula = 8.2; //double
        String tipoPlan = "Plus";

        if ( fechaDeLanzamiento >= 2022 ) {
            System.out.println("Peliculas mas populares");
        }else {
            System.out.println("Peliculas Retro que aun vale la pena ver");
        }

//        if (incluidoEnElPlan || tipoPlan.equals("Plus") ) {
//            System.out.println("Disfrute de su pelicula");
//        } else {
//            System.out.println("Pelicula no disponible para su plan ");
//        }
        if (incluidoEnElPlan && tipoPlan.equals("Plus") ) {
            System.out.println("Disfrute de su pelicula");
        } else {
            System.out.println("Pelicula no disponible para su plan ");
        }

    }
}
