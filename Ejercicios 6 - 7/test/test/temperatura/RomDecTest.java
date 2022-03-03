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
public class RomDecTest {
    
    public RomDecTest() {
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
     * Test of roman2dec method, of class RomDec.
     */
    @Test
    public void testRoman2dec() {
        System.out.println("roman2dec");
        String rom = "XXI";
        RomDec instance = new RomDec();
        int expResult = 21;
        int result = instance.roman2dec(rom);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of dec2roman method, of class RomDec.
     */
    @Test
    public void testDec2roman() {
        System.out.println("dec2roman");
        int dec = 21;
        RomDec instance = new RomDec();
        String expResult = "XXI";
        String result = instance.dec2roman(dec);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
