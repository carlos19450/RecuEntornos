package recuentornosexamen;

/**
 *
 * @author carlo
 */
public class DolarEuro {

    /**
     * Método para convertir los dolares a euros.
     * @param dollar Variable de tipo double.
     * @return Devuelve la variable dollar convertidos a euros.
     */
    public double dollar2euro(double dollar) {
        return (dollar * 0.88);
    }

    /**
     * Método para convertir los euros a dolares.
     * @param euro Variable de tipo double.
     * @return Devuelve la variable dollar convertidos a dolares.
     */
    public double euro2dollar(double euro) {
        return (euro * 1.13);
    }
}
