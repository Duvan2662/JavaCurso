public class Main {
    public static void main(String[] args) {

        /*
            Escribe un programa que convierta una temperatura en grados Celsius a Fahrenheit. Utiliza variables para representar los valores de las temperaturas
            e imprime en la consola el valor convertido de Celsius a Fahrenheit. Consejo: La fórmula para convertir temperaturas de grados Celsius a Fahrenheit es:
            (temperatura * 1.8) + 32.
            Después de terminar, probar y verificar que tu programa se haya ejecutado correctamente, crea una variable entera para mostrar la temperatura en Fahrenheit
            sin decimales. Recuerda que probablemente necesitarás realizar un casting de valores.
        */

        double temperaturaCelsius = 12.5;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) +32;
        int parseoFarenheit = (int) temperaturaFahrenheit;
        System.out.println("""
                La temperatura en Grados Celcius es: 
                """ + temperaturaCelsius + """
                \n La temperatura en Grados Fahrenheit es:
                """+temperaturaFahrenheit + """
                \n La temperatura en Grados Fahrenheit sin decimales es:
                """+ parseoFarenheit);


    }

}