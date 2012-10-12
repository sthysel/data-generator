package com.ageofwant.wowpersonmaker;

import com.ageofwant.personmaker.RandomAddressFactoryImpl;
import com.ageofwant.personmaker.models.Address;
import org.junit.*;

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
