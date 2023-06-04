/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cozyzone;

import java.io.PrintWriter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vip
 */
public class MoodTrackerTest {
    
    public MoodTrackerTest() {
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
     * Test of getMoodOptions method, of class MoodTracker.
     */
    @Test
    public void testGetMoodOptions() {
        System.out.println("getMoodOptions");
        MoodTracker instance = new MoodTracker();
        String[] expResult = null;
        String[] result = instance.getMoodOptions();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMoodOptions method, of class MoodTracker.
     */
    @Test
    public void testSetMoodOptions() {
        System.out.println("setMoodOptions");
        String[] moodOptions = null;
        MoodTracker instance = new MoodTracker();
        instance.setMoodOptions(moodOptions);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ShowMoodTracker method, of class MoodTracker.
     */
    @Test
    public void testShowMoodTracker() {
        System.out.println("ShowMoodTracker");
        MoodTracker instance = new MoodTracker();
        instance.ShowMoodTracker();
        assertNotNull(instance);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of SaveMoodInfo method, of class MoodTracker.
     */
    @Test
    public void testSaveMoodInfo() {
        System.out.println("SaveMoodInfo");
        String userMood = "";
        int counter = 0;
        MoodTracker instance = new MoodTracker();
        instance.SaveMoodInfo(userMood, counter);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of analyzeMoods method, of class MoodTracker.
     */
    @Test
    public void testAnalyzeMoods() {
        System.out.println("analyzeMoods");
        PrintWriter output = null;
        int counter = 0;
        MoodTracker instance = new MoodTracker();
        instance.analyzeMoods(output, counter);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
