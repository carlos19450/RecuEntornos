/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuentornosexamen;

/**
 *
 * @author carlo
 */
public class TestTemperaturas {

    /**
     * Metodo para convertir los grados Fahrenheit a Celsius.
     *
     * @param num Variable de tipo double.
     * @return Devuelve la conversión de los grados Fahrenheit a Celsius.
     */
    public static double fahrenheittocelsius(double num) {
        return (num - 32) / 1.8;
    }

    /**
     * Metodo para convertir los grados Celsius a Fahrenheit.
     *
     * @param num Variable de tipo double.
     * @return Devuelve la conversión de los grados Celsius a Fahrenheit.
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
