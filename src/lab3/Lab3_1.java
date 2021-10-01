package lab3;

import java.util.Scanner;

public class Lab3_1 {
    public static void main(String[] args){
        double a, b, c, x, y;
        double r;


        Scanner keyboard = new Scanner(System.in);
        // solution for  Lab3_1a
        System.out.println("Please enter the value for a");
        a = keyboard.nextDouble();
        System.out.println("Please enter the value for b");
        b = keyboard.nextDouble();
        System.out.println("Please enter the value for c");
        c = keyboard.nextDouble();
        double sqrRoot = Math.sqrt(Math.pow(b,2) + (4*a*c));

        System.out.println("The solution for Lab3_1a:");
        System.out.println(sqrRoot);
        //Solution for Lab3_b
        System.out.println("Please enter the value for x");
        x = keyboard.nextDouble();
        System.out.println("Please enter the value for y");
        y = keyboard.nextDouble();
        double sqrRoot1 = Math.sqrt(x + 4 * Math.pow(y, 3));
        System.out.println("The solution for Lab3_1b:");
        System.out.println(sqrRoot1);
        System.out.println();
        // Solution for Lab3_c
        System.out.println("The solution for Lab3_1c:");
        double cubeRoot = Math.cbrt(x * y);
        System.out.println(cubeRoot);
        //Solution for Lab3_d
        System.out.println("Please enter the radius r");
        r = keyboard.nextDouble();
        System.out.println("The solution for Lab3_1d:");
        double area = Math.PI * Math.pow(r, 2);
        System.out.println("The area of the circle is:" + area);




    }
}
