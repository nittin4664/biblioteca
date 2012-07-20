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
    //
    public void getname()
    {

        assertEquals("xyz",new customer("xyz","acb").getname());
    }
}
