package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: NITIN
 * Date: 7/20/12
 * Time: 8:00 AM
 * To change this template use File | Settings | File Templates.
 */
public class customer {
    static int autoinc=1111111;
    String username;
    String password;
    String name;
    public customer(String s1, String s2) {
        name=s1;
        password=s2;

    }

    public String getname()
    {
         return name;
    }
}