package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: NITIN
 * Date: 7/19/12
 * Time: 8:35 AM
 * To change this template use File | Settings | File Templates.
 */
public class movie {
    String name;
    String director;
    String rating;
    public movie(String a, String b, String c) {
        name=a;
        director=b;
        rating=c;
    }
    public movie(String a, String b) {
        name=a;
        director=b;
        rating="0";
    }
    //to display the name director and the rating
    public String display()
    {
        return name+"\t"+director+"\t"+rating();
    }

    public String rating()
    {

        if(rating.equals("1")||rating.equals("2")||rating.equals("3")||rating.equals("4")||rating.equals("5")||rating.equals("6")||rating.equals("7")||rating.equals("8")||rating.equals("9")||rating.equals("10"))
            return rating;
        else
            return "N/A";
    }
}

