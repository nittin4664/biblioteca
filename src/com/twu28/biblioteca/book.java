package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: NITIN
 * Date: 7/17/12
 * Time: 9:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class book {
    String name; //name of the book
    int count; // no of books in the library
    public book(String name1, int count1)//constructor to assign values
    {
        name=name1;
        count=count1;

    }

    public String getname() //get value of name
    {
        return name;
    }

    public int getcount()// gat value of count
    {
        return count;
    }
}
