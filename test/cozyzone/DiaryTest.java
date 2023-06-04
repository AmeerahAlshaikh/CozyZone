/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cozyzone;

import java.io.PrintWriter;
import java.util.ArrayList;
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
public class DiaryTest {
    
    public DiaryTest() {
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
     * Test of getDiaryTitle method, of class Diary.
     */
    @Test
    public void testGetDiaryTitle() {
        System.out.println("getDiaryTitle");
        Diary instance = new Diary();
        String expResult = "";
        String result = instance.getDiaryTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiaryDate method, of class Diary.
     */
    @Test
    public void testGetDiaryDate() {
        System.out.println("getDiaryDate");
        Diary instance = new Diary();
        String expResult = "";
        String result = instance.getDiaryDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiaryBody method, of class Diary.
     */
    @Test
    public void testGetDiaryBody() {
        System.out.println("getDiaryBody");
        Diary instance = new Diary();
        String expResult = "";
        String result = instance.getDiaryBody();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDiaryTitle method, of class Diary.
     */
    @Test
    public void testSetDiaryTitle() {
        System.out.println("setDiaryTitle");
        String DiaryTitle = "";
        Diary instance = new Diary();
        instance.setDiaryTitle(DiaryTitle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDiaryDate method, of class Diary.
     */
    @Test
    public void testSetDiaryDate() {
        System.out.println("setDiaryDate");
        String DiaryDate = "";
        Diary instance = new Diary();
        instance.setDiaryDate(DiaryDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDiaryBody method, of class Diary.
     */
    @Test
    public void testSetDiaryBody() {
        System.out.println("setDiaryBody");
        String DiaryBody = "";
        Diary instance = new Diary();
        instance.setDiaryBody(DiaryBody);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchDiary method, of class Diary.
     */
    @Test
     public void testSearchDiary() {
         Diary instance = new Diary("title");
        System.out.println("searchDiary");
        ArrayList<Diary> diaryPages = new ArrayList<>();
        diaryPages.add(instance);
        String title = "title";
        Diary expResult = instance;
        Diary page = new Diary();
        Diary result = page.searchDiary(diaryPages, title);
        assertSame(expResult, result);
    }

    /**
     * Test of showNewPageInfo method, of class Diary.
     */
    @Test
    public void testShowNewPageInfo() {
        System.out.println("showNewPageInfo");
        Diary WriteDiary = null;
        Diary instance = new Diary();
        instance.showNewPageInfo(WriteDiary);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printNewPageInfo method, of class Diary.
     */
    @Test
    public void testPrintNewPageInfo() {
        System.out.println("printNewPageInfo");
        PrintWriter diaryprint = null;
        Diary WriteDiary = null;
        Diary instance = new Diary();
        instance.printNewPageInfo(diaryprint, WriteDiary);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
