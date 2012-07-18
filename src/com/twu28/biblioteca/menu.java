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
    int option;
    public menu(int op )
    {
        option=op;
    }
    public  void display()
    {
        book bi[]=new book[3];
        bi[0]=new book("abc",3);
        bi[1]=new book("def",4);
        bi[2]=new book("xyz",0);
        switch(option) // displaying a option using switch case
        {
            case 1: System.out.println("you have selected login");
                break;
            case 2: System.out.println("you have selected to view movies");
                break;
            case 3:System.out.println("you have selected to view books");
                System.out.println("name \t count");
                for(int i=0;i<bi.length;i++)
                    System.out.println(bi[i].viewbook());
                break;

            case 4: System.out.println("you have selected to reserve a book");
                System.out.println("enter the book name to be reserved");
                Scanner in = new Scanner(System.in);
                String book = in.nextLine();
                for(int i=0;i<bi.length;i++)
                {
                    if(bi[i].searchbook(book))
                        System.out.println(bi[i].reservebook());
                }

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
