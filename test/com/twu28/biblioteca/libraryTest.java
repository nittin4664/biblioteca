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

    @Test
    // to test search of book
    public void testtakebook()
    {

        book bi[]=new book[1];
        bi[0]=new book("abc",2);
        assertEquals( "book found....Book abc has been reserved",new library().takebook(bi,"abc"));
    }

    @Test
    // to test search of book
    public void testreservebook()
    {

        book bi=new book("abc",2);
        assertEquals( "Book abc has been reserved",new library().reservebook(bi));
    }
    @Test
    // test if ration is b/w 1 and 10
    public  void testrating1to10()
    {

        assertEquals("1",new library().rating("1") );
    }
    @Test
    // test movie display function
    public  void testmoviedisplay()
    {
        movie mv=new movie("a","b","1");
        assertEquals("a \t b \t 1",new library().moviedisplay(mv));
    }
    @Test
    // test movie display function
    public  void testcustomerlogin()
    {
        customer cus[]=new customer[1];
        cus[0]=new customer("a","b");
        assertEquals("111-1111",new library().customerlogin(cus,"111-1111","b"));
    }

}
