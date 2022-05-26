/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package test.temperatura;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carlo
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
     * Test of fahrenheittocelsius method, of class TestTemperatura.
     */
    @Test
    public void testFahrenheittocelsius() {
        System.out.println("fahrenheittocelsius");
        double num = 0.0;
        double expResult = 0.0;
        double result = TestTemperatura.fahrenheittocelsius(num);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of celsiustofahrenheit method, of class TestTemperatura.
     */
    @Test
    public void testCelsiustofahrenheit() {
        System.out.println("celsiustofahrenheit");
        double num = 0.0;
        double expResult = 0.0;
        double result = TestTemperatura.celsiustofahrenheit(num);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        fail("The test case is a prototype.");
    }
    
}
