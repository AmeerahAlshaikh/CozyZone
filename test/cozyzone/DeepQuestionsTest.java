/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cozyzone;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
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
public class DeepQuestionsTest {
    
    public DeepQuestionsTest() {
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
     * Test of getQuestionTitle method, of class DeepQuestions.
     */
    @Test
    public void testGetQuestionTitle() {
        System.out.println("getQuestionTitle");
        DeepQuestions instance = null;
        String expResult = "";
        String result = instance.getQuestionTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOpenEndedAnswer method, of class DeepQuestions.
     */
    @Test
    public void testGetOpenEndedAnswer() {
        System.out.println("getOpenEndedAnswer");
        DeepQuestions instance = null;
        String expResult = "";
        String result = instance.getOpenEndedAnswer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCloseEndedAnswer method, of class DeepQuestions.
     */
    @Test
    public void testGetCloseEndedAnswer() {
        System.out.println("getCloseEndedAnswer");
        DeepQuestions instance = null;
        String[] expResult = null;
        String[] result = instance.getCloseEndedAnswer();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuestionTitle method, of class DeepQuestions.
     */
    @Test
    public void testSetQuestionTitle() {
        System.out.println("setQuestionTitle");
        String questionTitle = "";
        DeepQuestions instance = null;
        instance.setQuestionTitle(questionTitle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOpenEndedAnswer method, of class DeepQuestions.
     */
    @Test
    public void testSetOpenEndedAnswer() {
        System.out.println("setOpenEndedAnswer");
        String openEndedAnswer = "";
        DeepQuestions instance = null;
        instance.setOpenEndedAnswer(openEndedAnswer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCloseEndedAnswer method, of class DeepQuestions.
     */
    @Test
    public void testSetCloseEndedAnswer() {
        System.out.println("setCloseEndedAnswer");
        String[] CloseEndedAnswer = null;
        DeepQuestions instance = null;
        instance.setCloseEndedAnswer(CloseEndedAnswer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateQuestions method, of class DeepQuestions.
     */
    @Test
    public void testGenerateQuestions() {
        System.out.println("generateQuestions");
        DeepQuestions[] questions = null;
        Scanner input = null;
        DeepQuestions.generateQuestions(questions, input);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class DeepQuestions.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        DeepQuestions instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add2File method, of class DeepQuestions.
     */
    @Test
    public void testAdd2File() {
        System.out.println("add2File");
        DeepQuestions[] questions = null;
        File deepQuestionsOutput = null;
        FileWriter myWriter = null;
        DeepQuestions.add2File(questions, deepQuestionsOutput, myWriter);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
