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

    public String rating(movie mv) {
        if("1".equals(mv.getrating())||"2".equals(mv.getrating())||"3".equals(mv.getrating())||"4".equals(mv.getrating())||"5".equals(mv.getrating())||"6".equals(mv.getrating())||"7".equals(mv.getrating())||"8".equals(mv.getrating())||"9".equals(mv.getrating())||"10".equals(mv.getrating()))
            return mv.getrating();
        else
            return "N/A";
    }
}

