package com.twu28.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: NITIN
 * Date: 7/19/12
 * Time: 8:32 AM
 * To change this template use File | Settings | File Templates.
 */
public class testmovie {

    @Test
    //to test the display movie function
    public void testdisplay()
    {
        assertEquals("a\tb\tN/A",new movie("a","b").display());
    }
    @Test
    public  void testrating()
    {
        assertEquals("N/A",new movie("a","b").rating() );
    }
}
