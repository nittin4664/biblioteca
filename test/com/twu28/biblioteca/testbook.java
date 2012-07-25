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
    // to test getcount
    public void testavailability()
    {
        assertEquals(true,new book("ac",1).available());
    }

    @Test
    // to test getcount
    public void testreducecount()
    {    book book=new book("ac",2);
        book.reducebook();
        assertEquals(1,book.getcount());
    }




}
