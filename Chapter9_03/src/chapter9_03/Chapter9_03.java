 /*     
Chapter 9 Programming excercise 03
Riky Hernandez
9/28/21
Description: Use the Date Class, se its elapsed from 1000 to 1000000000000,display the date and time usin the toString() method
─▄▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▄
█░░░█░░░░░░░░░░▄▄░██░█
█░▀▀█▀▀░▄▀░▄▀░░▀▀░▄▄░█
█░░░▀░░░▄▄▄▄▄░░██░▀▀░█
─▀▄▄▄▄▄▀─────▀▄▄▄▄▄▄▀
         
*/
package chapter9_03;

import java.util.Date;


public class Chapter9_03 {

    
    public static void main(String[] args) {
        Date date;                      //using the Date class
        long time = 1000;                                       //startin the value at 10000
        
        for (int i = 0; i < 8; i++, time *=10){                 //increasin the value until we have 12 zeros
            date = new Date(time);
            System.out.println(date.toString());        //printin the loop
        }
        
        
    }
    
}
