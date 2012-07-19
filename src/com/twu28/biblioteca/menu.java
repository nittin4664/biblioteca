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
        book bi[]=new book[3];
        bi[0]=new book("abc",3);
        bi[1]=new book("def",4);
        bi[2]=new book("xyz",0);
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
                               break;
            case 2: System.out.println("you have selected to view movies");

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
                Scanner in1 = new Scanner(System.in);
                String s = in1.nextLine();
                System.out.println(lib.reservebook(bi,s));

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
