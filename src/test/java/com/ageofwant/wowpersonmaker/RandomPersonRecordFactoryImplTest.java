package com.ageofwant.wowpersonmaker;

import com.ageofwant.personmaker.RandomPersonRecordFactoryImpl;
import com.ageofwant.personmaker.models.PersonRecord;
import org.junit.*;

public class RandomPersonRecordFactoryImplTest {

    public RandomPersonRecordFactoryImplTest() {
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
     * Test of getPersonRecord method, of class RandomPersonRecordFactoryImpl.
     */
    @Test
    public void testGetPersonRecord() {
        System.out.println("getPersonRecord");
        RandomPersonRecordFactoryImpl instance = new RandomPersonRecordFactoryImpl();
        PersonRecord record = instance.getPersonRecord();
        System.out.println(record.toString());
    }
}
