package com.twu28.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: NITIN
 * Date: 7/19/12
 * Time: 5:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class libraryTest  {

    @Test
    // to test display  book
    public void testdisplayhbook()
    {

        book bi=new book("abc",3);
        assertEquals("abc \t 3", new library().displaybook( bi));
    }

    @Test
    // to test search of book
    public void testsearchbook()
    {
        String s="abc";
        book bi=new book("abc",3);
        assertEquals( true,new library().searchbook(bi,s));
    }



}
