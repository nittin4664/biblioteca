package com.twu28.biblioteca;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: NITIN
 * Date: 7/25/12
 * Time: 4:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class main {

    public  static void main(String arg[])
    {

        //values for book class
        book bi[]=new book[3];
        bi[0]=new book("abc",3);
        bi[1]=new book("def",4);
        bi[2]=new book("xyz",0);


        //values for movie class
        movie mv[]=new movie[15];
        mv[0]=new movie("a1","b1",6);
        mv[1]=new movie("a2","b2");
        mv[2]=new movie("a3","b3",10);
        mv[3]=new movie("a4","b4",11);
        mv[4]=new movie("a5","b5",1);
        mv[5]=new movie("a6","b6",6);
        mv[6]=new movie("a7","b7",2);
        mv[7]=new movie("a8","b8");
        mv[8]=new movie("a9","b9",9);
        mv[9]=new movie("a10","b10",4);
        mv[10]=new movie("a11","b11",11);
        mv[11]=new movie("a12","b12",2);
        mv[12]=new movie("a13","b13",8);
        mv[13]=new movie("a14","b14");
        mv[14]=new movie("a15","b15",5);


        //customer initialization
        customer cus[]=new customer[2];
        cus[0]=new customer("library","password");
        cus[1]=new customer("nitin","abc");

        menu menu=new menu();
        library lib=new library();

        int opt; //to select an option
        String permission=null;//to give permission
        while(true)
        {

          menu.menudisplay();
            Scanner in = new Scanner(System.in);
            opt = in.nextInt();
            option op=new option(opt);

            if(op.testoption1to6())
            {
               menu.menuselected( opt, bi, mv, cus, lib);
            }
         }
    }
 }