package thys.org.wowpersonmaker;

import thys.org.personmaker.RandomAddressFactoryImpl;
import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import thys.org.personmaker.models.Address;

/**
 *
 * @author meithy0
 */
public class RandomAddressFactoryImplTest {

    public RandomAddressFactoryImplTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getAddress method, of class RandomAddressFactoryImpl.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        RandomAddressFactoryImpl instance = new RandomAddressFactoryImpl();     
        Address result = instance.getAddress();
        System.out.println(result);
    }
}
