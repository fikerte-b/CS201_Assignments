package lab7;

import java.util.Scanner;

public class Lab7_1a {
    public static void main(String[] args) {

        // For part a
        // the variables are missing data type in declaration ----syntax error
        // at least variable y and b should be initialized ---- syntax error
        // it is infinite loop
        int x, a;
        int y = 0;
        int b = 0;
        for (int i = 10; i > 0; i++) {
            x = y;
            a = b;

        }

        // For part b
        //1. variable num is missing data type "int"  ----syntax error
        //2. The word "until" is not a syntax for do while loop ---syntax error

        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            int num = scanner.nextInt();
            sum += num;
        } while (sum > 10000);

        // For part c
        // 1. The boolean expression for the while loop is always false ----logical error
        // 2. The variables aC,bC,xC are missing data type  ----- syntax error
        // 3. "xC" and "bC" should be either initialized  or input from keyboard -----syntax error


        int aC, bC, xC;
        xC = 0;
        bC = 0;
        while (xC < 1 && xC > 10) {
            aC = bC;
        }

        //For part d
        //1. In declaration, the variables are missing data type-----syntax error
        //2. There shouldn't be a ";" after while ----syntax error
        //3. variables 'aD', 'bD' and 'yD' should be initialized
        int aD, bD, xD, yD;
        aD = 0;
        bD =0;
        yD =0;
        while (aD == bD) {
            aD = bD;
            xD = yD;
        }
    }
}
