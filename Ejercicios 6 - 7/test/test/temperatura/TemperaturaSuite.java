package test.temperatura;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Carlos ExpÃ³sito.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({test.temperatura.DolarEuroTest.class, test.temperatura.TestTemperaturaTest.class, test.temperatura.RomDecTest.class})
public class TemperaturaSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
