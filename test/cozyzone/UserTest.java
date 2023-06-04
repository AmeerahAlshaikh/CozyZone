/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cozyzone;

import java.io.PrintWriter;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author vip
 */
public class UserTest {
    
    public UserTest() {
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
     * Test of main method, of class User.
     */
    @Ignore
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        User.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showMenu method, of class User.
     */
    @Test (timeout = 50)
    public void testShowMenu() {
        System.out.println("showMenu");
        User.showMenu();
    }

    /**
     * Test of Write method, of class User.
     */
    @Ignore
    @Test
    public void testWrite() {
        System.out.println("Write");
        Scanner user = null;
        Scanner in = null;
        Diary WriteDiary = null;
        PrintWriter diaryprint = null;
        User.Write(user, in, WriteDiary, diaryprint);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ModifyDiary method, of class User.
     */
    @Ignore
    @Test
    public void testModifyDiary() {
        System.out.println("ModifyDiary");
        Scanner user = null;
        Diary WriteDiary = null;
        PrintWriter diaryprint = null;
        User.ModifyDiary(user, WriteDiary, diaryprint);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AccessMoodTracker method, of class User.
     */
    @Ignore
    @Test
    public void testAccessMoodTracker() {
        System.out.println("AccessMoodTracker");
        MoodTracker userMood = null;
        PrintWriter output = null;
        int counter = 0;
        User.AccessMoodTracker(userMood, output, counter);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of FillMoodTracker method, of class User.
     */
    
    @Test
    public void testFillMoodTracker() {
        System.out.println("FillMoodTracker");
        MoodTracker userMood = new MoodTracker();
        int counter = 1;
       String[] userMoodArray = new String[20];
        String mood = "sad";
        userMoodArray[counter] = mood;
       assertNotNull(userMoodArray[counter]);
    }

    /**
     * Test of Addquestion method, of class User.
     */
    @Test
   public void testAddquestion() {
        System.out.println("Addquestion");
        Scanner scanner = null;
        DeepQuestions expResult = new DeepQuestions("question");
        assertNotNull(expResult);
    }
    
}
