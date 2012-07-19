package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: NITIN
 * Date: 7/19/12
 * Time: 9:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class movie {
   private
   String name;
   String director;
   String rating;
    public movie(String a, String b, String c)
    {
        name=a;
        director=b;
        rating=c;
    }
    public movie(String a, String b)
    {
        name=a;
        director=b;
        rating=" ";
    }

    public String getname() {
        return name;
    }

    public String getdirector() {
        return  director;
    }

    public String getrating() {
        return  rating;
    }
}
