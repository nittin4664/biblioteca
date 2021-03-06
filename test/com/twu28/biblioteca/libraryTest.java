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
    // to test get permission  book
    public void testgetpermission()
    {

        book bi=new book("abc",3);
        assertEquals("aba", new library().getpermission());
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
    // test movie display function
    public  void testmoviedisplay()
    {
        movie mv=new movie("a","b",1);
        assertEquals("a \t b \t 1",new library().moviedisplay(mv));
    }
    @Test
    // test movie display function
    public  void testcustomerlogin()
    {
        customer cus[]=new customer[2];
        cus[0]=new customer("1","b");
        cus[1]=new customer("2","c");
        assertEquals("111-1112",new library().customerlogin(cus,"111-1112","c"));
    }

}
