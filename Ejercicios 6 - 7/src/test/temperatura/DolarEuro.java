package test.temperatura;

/**
 * Clase para convertir de euros a dolares.
 *
 * @author Carlos ExÃ³sito.
 */
public class DolarEuro {

    /**
     * MÃ©todo que covierte los dolares a euros.
     *
     * @param dollar Variable de tipo double donde se guardaran los dolares.
     * @return Devuelve los dolares convertidos a euros.
     */
    public double dollar2euro(double dollar) {
        return (dollar * 0.88);
    }

    /**
     * MÃ©todo que covierte los euros a dolares.
     *
     * @param euro Variable de tipo double donde se guardaran los euros.
     * @return Devuelve los euros convertidos a dolares.
     */
    public double euro2dollar(double euro) {
        return (euro * 1.13);
    }
}
