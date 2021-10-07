package lab6;

import java.util.Scanner;



// Method 'A' and 'c' are equivalent

public class Lab6_2 {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the values for a, b, c, d");
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();
        d = keyboard.nextInt();


        // Question 6_2a

        if(a == b)
            if(c == d)
                a =1;
            else
                b =1;

        // Question 6_2b
        if(a == b){
            if(c == d)
                a =1;
        }else
            b = 1;

        // Question 6-2c

        if(a == b)
            if(c == d)
                a = 1;
            else
                b = 1;
    }

}
