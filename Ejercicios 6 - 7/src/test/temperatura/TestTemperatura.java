package test.temperatura;

/**
 * Clase para convertir de grados 'Fahrenheit' a 'Celsius' y viceversa.
 *
 * @author Carlos Expósito.
 */
public class TestTemperatura {

    /**
     * MÃ©todo para pasar de grados 'Fahrenheit' a 'Celsius'.
     *
     * @param num Variable de tipo double para guardar los greados Fahrenheit.
     * @return Devuelve los grados convertidos de Fahrenheit a Celsius.
     */
    public static double fahrenheittocelsius(double num) {
        return (num - 32) / 1.8;
    }

    /**
     * MÃ©todo para pasar de grados 'Celsius' a 'Fahrenheit'.
     *
     * @param num Variable de tipo double para guardar los greados Celsius.
     * @return Devuelve los grados convertidos de Celsius a Fahrenheit.
     */
    public static double celsiustofahrenheit(double num) {
        return (num * 1.8) + 32;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double celsius = 23, fahrenheit = 5;
        System.out.println(fahrenheittocelsius(fahrenheit));
        System.out.println(celsiustofahrenheit(celsius));
    }
}
