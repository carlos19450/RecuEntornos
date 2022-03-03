package test.temperatura;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carlos ExpÃ³sito.
 */
public class TestTemperaturaTest {
    
    public TestTemperaturaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test donde se comprueba la soluciÃ³n con -5 grados ÂºF a ÂºC
     */
    @Test
    public void testFahrenheittocelsiu_5() {
        System.out.println("fahrenheittocelsius");
        double num = -5.0;
        double expResult = -20.5556;
        double result = TestTemperatura.fahrenheittocelsius(num);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test donde se comprueba la soluciÃ³n con 0 grados ÂºF a ÂºC
     */
    @Test
    public void testFahrenheittocelsius_0() {
        System.out.println("fahrenheittocelsius");
        double num = 0.0;
        double expResult = -17.7778;
        double result = TestTemperatura.fahrenheittocelsius(num);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test donde se comprueba la soluciÃ³n con 15 grados ÂºF a ÂºC
     */
    @Test
    public void testFahrenheittocelsius_15() {
        System.out.println("fahrenheittocelsius");
        double num = 15.0;
        double expResult = -9.4444;
        double result = TestTemperatura.fahrenheittocelsius(num);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test donde se comprueba la soluciÃ³n con 32 grados ÂºF a ÂºC
     */
    @Test
    public void testFahrenheittocelsius_32() {
        System.out.println("fahrenheittocelsius");
        double num = 32.0;
        double expResult = 0.0;
        double result = TestTemperatura.fahrenheittocelsius(num);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test donde se comprueba la soluciÃ³n con -5 grados ÂºC a ÂºF
     */
    @Test
    public void testCelsiustofahrenheit5() {
        System.out.println("celsiustofahrenheit");
        double num = -5.0;
        double expResult = 23.0;
        double result = TestTemperatura.celsiustofahrenheit(num);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test donde se comprueba la soluciÃ³n con 0 grados ÂºC a ÂºF
     */
    @Test
    public void testCelsiustofahrenheit0() {
        System.out.println("celsiustofahrenheit");
        double num = 0.0;
        double expResult = 32.0;
        double result = TestTemperatura.celsiustofahrenheit(num);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test donde se comprueba la soluciÃ³n con 15 grados ÂºC a ÂºF
     */
    @Test
    public void testCelsiustofahrenheit15() {
        System.out.println("celsiustofahrenheit");
        double num = 15.0;
        double expResult = 59.0;
        double result = TestTemperatura.celsiustofahrenheit(num);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test donde se comprueba la soluciÃ³n con 32 grados ÂºC a ÂºF
     */
    @Test
    public void testCelsiustofahrenheit32() {
        System.out.println("celsiustofahrenheit");
        double num = 32.0;
        double expResult = 89.6;
        double result = TestTemperatura.celsiustofahrenheit(num);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of main method, of class TestTemperatura.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TestTemperatura.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
