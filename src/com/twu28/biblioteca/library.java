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
    private
    String permission=null;

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
        if(bi.available())
        {   s="Book "+bi.getname()+" has been reserved";
            bi.reducebook();
        }
        else
        {
            s="Book "+bi.getname()+" out of stock";
        }
        return s;
    }



    public String moviedisplay(movie mv) {

        return mv.getname()+" \t "+mv.getdirector()+" \t "+mv.getrating();
    }

    public String customerlogin(customer[] cus,String username,String password) {
        int pos=3;
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

    public void setpermission(String s) {
          permission=s;
    }

    public String getpermission() {
        return  permission;
    }
}

