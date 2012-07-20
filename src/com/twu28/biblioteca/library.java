package com.twu28.biblioteca;


import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: NITIN
 * Date: 7/17/12
 * Time: 9:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class library {

    public String displaybook(book buk) {
        {
            return  buk.getname()+" \t "+buk.getcount();
        }
    }

    public boolean searchbook(book buk,String s)
    {
         if(s.equals(buk.getname()))
             return true;
        else
             return false;
    }



    public String takebook(book[] buk,String s) {
        int flag=0;
        int pos=0;
        for(int i = 0;i<buk.length;i++)
        {
            if(searchbook(buk[i], s))
            {
                flag=1;
                pos=i;
            }
        }
        if(flag==1)
            return "book found...."+reservebook(buk[pos]);
        else
            return "Book not found";

    }

    public String reservebook(book bi)
    {
        String s;
        if(bi.getcount()>0)
        {   s="Book "+bi.getname()+" has been reserved";
            bi.count--;
        }
        else
        {
            s="Book "+bi.getname()+" out of stock";
        }
        return s;
    }

    public String rating(String s) {
        if(s.equals("1")||s.equals("2")||s.equals("3")||s.equals("4")||s.equals("5")||s.equals("6")||s.equals("7")||s.equals("8")||s.equals("9")||s.equals("10"))
            return s;
        else
            return "N/A";
    }

    public String moviedisplay(movie mv) {

        return mv.getname()+" \t "+mv.getdirector()+" \t "+rating(mv.getrating());
    }

    public String customerlogin(customer[] cus,String username,String password) {
        int pos=0;
        int flag=0;

        for(int i=0;i<cus.length;i++)
        {
            if(username.equals(cus[i].getusername())&&password.equals(cus[i].getpassword()))
            {  pos=i; flag=1;  }

        }
        if(flag==1)
            return cus[pos].username;
            else
            return null;

    }
}

