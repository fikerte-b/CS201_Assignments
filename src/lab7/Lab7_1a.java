package lab7;

import java.util.Scanner;

public class Lab7_1a {
    public static void main(String[] args) {

    // For part a
    // vari
        int x, a;
        int y = 0;
        int b = 0;
        for (int i = 10; i > 0; i++) {
            x = y;
            a = b;
            System.out.println(i);

        }

        // For part b
        //1. variable num is missing data type "int"  ----syntax error
        //2. The word "until" is not a syntax for do while loop ---syntax error

        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        do{
            int num = scanner.nextInt();
            sum += num;
        } while (sum > 10000);

        // For part c
        // 1. The boolean expression for the while loop is always false ----logical error
        // 2. The variables are missing data type  ----- syntax error
        // 3. "x" should be either initialized or input from keyboard -----syntax error


//            int k, j;
//            while (x < 1 && x > 10) {
//                k = b;
//            }
//        }
//        //For part d
//
//        while (a == b);
//        {
//            a = b;
//            x = y;
//        }
    }
}
