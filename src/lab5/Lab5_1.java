package lab5;

import java.util.Scanner;

public class Lab5_1 {

    public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number for the power of 10");
        int number = keyboard.nextInt();
        System.out.print("10 the power of "+ number + " : ");
        Lab5_1.toThePower(number);
    }
    public static void toThePower(int power){
        if(power == 6)
            System.out.println("Million");
        else if(power == 9)
            System.out.println("Billion");
        else if(power == 12)
            System.out.println("Trillion");
        else if(power == 15)
            System.out.println("Quadrillion");
        else if(power == 18)
            System.out.println("Quintillion");
        else if(power == 21)
            System.out.println("Sextillion");
        else if(power == 30)
            System.out.println("Nonillion");
        else if(power == 100)
            System.out.println("Googol");
        else
            System.out.println("The power number you entered doesn't included in this program");
    }
}
