package com.twu28.biblioteca;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: NITIN
 * Date: 7/17/12
 * Time: 9:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class menu {

    public  static void main(String arg[])
    {

        //values for book class
        book bi[]=new book[3];
        bi[0]=new book("abc",3);
        bi[1]=new book("def",4);
        bi[2]=new book("xyz",0);


        //values for movie class
        movie mv[]=new movie[15];
        mv[0]=new movie("a1","b1","6");
        mv[1]=new movie("a2","b2");
        mv[2]=new movie("a3","b3","10");
        mv[3]=new movie("a4","b4","11");
        mv[4]=new movie("a5","b5","1");
        mv[5]=new movie("a6","b6","c");
        mv[6]=new movie("a7","b7","2");
        mv[7]=new movie("a8","b8");
        mv[8]=new movie("a9","b9","9");
        mv[9]=new movie("a10","b10","4");
        mv[10]=new movie("a11","b11","11");
        mv[11]=new movie("a12","b12","2");
        mv[12]=new movie("a13","b13","8");
        mv[13]=new movie("a14","b14");
        mv[14]=new movie("a15","b15","5");
        int opt;
        while(true)
        {
            System.out.println("enter one of the options\n 1:login  \n 2:view movies \n 3:view books \n 4:reserve book \n 5:library no \n 6:exit ");
            Scanner in = new Scanner(System.in);
            opt = in.nextInt();
            option op=new option(opt);
            library lib=new library();
         if(op.testoption1to6())
         {
        switch(opt) // displaying a option using switch case
        {
            case 1: System.out.println("you have selected login");
                System.out.println("enter username>>");
                Scanner in1 = new Scanner(System.in);
                String username = in1.nextLine();
                System.out.println("enter password>>");
                Scanner in2 = new Scanner(System.in);
                String password = in2.nextLine();
                               break;
            case 2: System.out.println("you have selected to view movies");
                System.out.println("Name  Director  Rating");
                for(int i = 0;i<mv.length;i++)
                {
                    System.out.println(lib.moviedisplay(mv[i]));
                }
                break;
            case 3:System.out.println("you have selected to view books");
                System.out.println("name \t count");
                for(int i = 0;i<bi.length;i++)
                {
                    System.out.println(lib.displaybook(bi[i]));
                }

                break;

            case 4: System.out.println("you have selected to reserve a book");
                System.out.println("enter the name of the book to be reserved");
                Scanner in4 = new Scanner(System.in);
                String s = in4.nextLine();
                System.out.println(lib.takebook(bi,s));

                break;

            case 5: System.out.println("you have selected to check library no");
                break;

            case 6: System.out.println("you have selected to exit");
                System.exit(0);
                break;
            default:
                System.out.println("you have selected a wrong option");
        }
         }

    }
    }
}
