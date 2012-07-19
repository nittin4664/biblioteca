package com.twu28.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: NITIN
 * Date: 7/19/12
 * Time: 9:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class testmovie {

    @Test
    //to test the display movie function
    public void testgetname()
    {
        assertEquals("a",new movie("a","b","1").getname());
    }
    @Test
    //to test the display movie function
    public void testgetdiretor()
    {
        assertEquals("b",new movie("a","b","1").getdirector());
    }
}
