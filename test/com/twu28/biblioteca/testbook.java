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





}
