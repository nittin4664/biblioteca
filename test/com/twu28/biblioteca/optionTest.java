package com.twu28.biblioteca;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: NITIN
 * Date: 7/17/12
 * Time: 7:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class optionTest
{

   @Test
   // test to check if get option works properly
    public void testgetoption()
   {
       int option=1;
      assertEquals(option,new option(option).getoption());
   }





}
