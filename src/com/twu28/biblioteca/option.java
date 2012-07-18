package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: NITIN
 * Date: 7/17/12
 * Time: 7:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class option {
        int option;

    public option(int i) {
        //To change body of created methods use File | Settings | File Templates.
         option=i;
    }

    public int getoption() {
        return option;  //return value of option
    }

       public String testoption1to6()
       {
        if(option>0&&option<7)
        {

            return "you have selected option"+option;
        }
        else
        {

              return "option does not exist.....plz try again";//check the limits of options
        }
       }
}
