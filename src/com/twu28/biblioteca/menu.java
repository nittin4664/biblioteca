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

        // assigning vales to movies
        movie mv[]=new movie[15];
        mv[0]=new movie("movie0","director0","4");
        mv[1]=new movie("movie1","director1","6");
        mv[2]=new movie("movie2","director2","4");
        mv[3]=new movie("movie3","director3","7");
        mv[4]=new movie("movie4","director4","2");
        mv[5]=new movie("movie5","director5");
        mv[6]=new movie("movie6","director6","10");
        mv[7]=new movie("movie7","director7","9");
        mv[8]=new movie("movie8","director8","4");
        mv[9]=new movie("movie9","director9","8");
        mv[10]=new movie("movie10","director10");
        mv[11]=new movie("movie11","director11");
        mv[12]=new movie("movie12","director12","5");
        mv[13]=new movie("movie13","director13");
        mv[14]=new movie("movie14","director14","10");

        switch(option) // displaying a option using switch case
        {
            case 1: System.out.println("you have selected login");
                               break;
            case 2: System.out.println("you have selected to view movies");
                for(int i=0;i<mv.length;i++)
                    System.out.println(mv[i].display());
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
                    System.out.println(bi[i].searchbook(book));
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
