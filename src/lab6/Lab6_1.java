package lab6;

import java.util.Scanner;

public class Lab6_1 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please Enter for a, b, c, d");
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int c = keyboard.nextInt();
        int d = keyboard.nextInt();

        //question 6_1a
        if(a == b)
            if(c == d)
                a = 1;
            else
                b = 1;
        else
            c =1;

        // Question 6_1b
        if(a == b)
            a = 1;
        if(c == d)
            b =1;
        else
            c = 1;

        // Question 6_1c
        if(a == b){
            if(c == d)
                a = 1;
            b = 2;
        }else
            b = 1;

        // Question 6_1d
        if(a == b){
            if(c == d)
                a = 1;
            b = 2;
        }else
        {
            b =1;
            if( a == d)
                d = 3;
        }
    }


}
