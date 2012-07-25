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

    public void menudisplay()
    {
       System.out.println("enter one of the options\n 1:login  \n 2:view movies \n 3:view books \n 4:reserve book \n 5:library no \n 6:exit ");
    }

    public void menuselected(int opt,book [] bi,movie [] mv,customer [] cus,library lib)
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
                lib.setpermission(lib.customerlogin(cus,username,password)) ;
                if(lib.getpermission()!=null)
                    System.out.println("login successful");
                else
                    System.out.println("Please try again");
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
                if(lib.getpermission()!=null)
                {
                System.out.println("enter the name of the book to be reserved");
                Scanner in4 = new Scanner(System.in);
                String s = in4.nextLine();
                System.out.println(lib.takebook(bi,s));
                }
                else
                    System.out.println("Not logged in....... login to reserve a book ");
                break;

            case 5: System.out.println("you have selected to check library no");
                if(lib.getpermission()!=null)
                    System.out.println("library no is"+lib.getpermission());
                else
                    System.out.println("Please talk to your Librarian");
                break;

            case 6: System.out.println("you have selected to exit");
                System.exit(0);
                break;
            default:
                System.out.println("you have selected a wrong option");
        }
    }

 }


