package com.twu28.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: NITIN
 * Date: 7/20/12
 * Time: 7:47 AM
 * To change this template use File | Settings | File Templates.
 */
public class testcustomer {

    @Test
    //  test getname
    public void testgetname()
    {

        assertEquals("xyz",new customer("xyz","acb").getname());
    }
    @Test
    //   test setusername
    public void teststusername()
    {

        assertEquals("111-1113",new customer("xyz","acb").setusername());
    }
    @Test
    //  test getpassword
    public void testgetpassword()
    {

        assertEquals("acb",new customer("xyz","acb").getpassword());
    }
    @Test
    //  test getpassword
    public void testgetusername()
    {

        assertEquals("111-1111",new customer("xyz","acb").getusername());
    }
}
