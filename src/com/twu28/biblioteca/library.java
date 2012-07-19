package com.twu28.biblioteca;


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
}

