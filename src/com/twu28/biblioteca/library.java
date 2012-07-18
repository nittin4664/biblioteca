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
    public static void main(String ar[])
    {   int opt;
        while(true)
        {
        System.out.println("enter one of the options\n 1:login  \n 2:view movies \n 3:view books \n 4:reserve book \n 5:library no \n 6:exit ");
        Scanner in = new Scanner(System.in);
        opt = in.nextInt();
        option op=new option(opt);
        System.out.println(op.testoption1to6());
        menu mu=new menu(op.getoption());
        mu.display();
        }
    }
}
