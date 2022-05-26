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
public class DolarEuroTest {
    
    public DolarEuroTest() {
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
     * Test of dollar2euro method, of class DolarEuro.
     */
    @Test
    public void testDollar2euro() {
        System.out.println("dollar2euro");
        double dollar = 0.0;
        DolarEuro instance = new DolarEuro();
        double expResult = 0.0;
        double result = instance.dollar2euro(dollar);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of euro2dollar method, of class DolarEuro.
     */
    @Test
    public void testEuro2dollar() {
        System.out.println("euro2dollar");
        double euro = 0.0;
        DolarEuro instance = new DolarEuro();
        double expResult = 0.0;
        double result = instance.euro2dollar(euro);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
