package lab7;

import java.util.Scanner;

public class Lab7_4 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number to check ");
        int num = keyboard.nextInt();
        while(num >=0)

        {
            if((isPrime(num)))
                System.out.println("Prime");
            else
                System.out.println("Not Prime");
            System.out.println("Please enter another number to check");
            num = keyboard.nextInt();

        }
            System.out.println("out of boundary");


    }
        static boolean isPrime(int number)
        {

            if (number <= 1)
                return false;
           for (int i = 2; i < number; i++)
             if (number % i == 0)
                 return false;
         int i =2;
         while(i<number) {
             if (number % i == 0)
               return false;
             i++;



         }   return true;
    }
}
