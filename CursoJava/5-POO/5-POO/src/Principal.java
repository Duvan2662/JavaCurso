import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodios;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLamzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidosEnElPlan(true);
        miPelicula.muestraFiichaTecnica();
        miPelicula.evalua(9.8);
        miPelicula.evalua(5);
        System.out.println("Total de las  evaluaciones de la pelicula: " + miPelicula.getCantidadEvaluaciones());
        System.out.println("Media de las evaluaciones  de la pelicula: " + miPelicula.calcularMedia());

        Pelicula miPelicula2 = new Pelicula();
        miPelicula2.setNombre("Matrix");
        miPelicula2.setFechaDeLamzamiento(2020);
        miPelicula2.setDuracionEnMinutos(150);
        miPelicula2.setIncluidosEnElPlan(false);
        miPelicula2.evalua(9.8);
        miPelicula2.evalua(5);


        Serie miSerie = new Serie();
        miSerie.setNombre("La casa del dragon");
        miSerie.setFechaDeLamzamiento(2022);
        miSerie.setTemporada(1);
        miSerie.setEpisodiosPorTemporada(10);
        miSerie.setMinutosPorEpisodio(50);
        miSerie.setIncluidosEnElPlan(false);
        miSerie.muestraFiichaTecnica();
        System.out.println("Duracion de toda la temporada: " + miSerie.getDuracionEnMinutos()+ " minutos");



        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(miPelicula2);
        calculadora.incluye(miSerie);
        System.out.println("Tiempo necesario para ver tus titulos favoritos: " + calculadora.getTiempoTotal() + " minutos");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtro(miPelicula);
        Episodios episodios = new Episodios();
        episodios.setNombre("La casa Targaryen");
        episodios.setNumero(1);
        episodios.setSerie(miSerie);
        episodios.setTotalVisualizaciones(50);
        filtroRecomendacion.filtro(episodios);







    }
}
