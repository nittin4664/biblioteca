package com.twu28.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: NITIN
 * Date: 7/17/12
 * Time: 9:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class testbook {

        @Test
        //  to test getname()
        public void testgetname()
        {
            assertEquals("ac",new book("ac",1).getname());
        }

        @Test
        // to test getcount
        public void testgetcount()
        {
            assertEquals(1,new book("ac",1).getcount());
        }

    @Test
    // to test display or view book option
    public void testviewbook()
    {
        assertEquals("ac\t1",new book("ac",1).viewbook());
    }



    @Test
    // to test reservation of book
    public void testreservebook()
    {
        assertEquals("Book has been reserved",new book("ac",1).reservebook());
    }


    @Test
    // to test search of book
    public void testsearchbook()
    {
        String book="ac";
        assertEquals( "book present...Book has been reserved",new book("ac",1).searchbook(book));
    }





}
