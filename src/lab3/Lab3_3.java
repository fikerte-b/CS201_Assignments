package lab3;

import java.util.Scanner;
// This method converts Degree Celsius to Degree Fahrenheit

public class Lab3_3 {
    public static void main(String[] args){
        double celsius, fahrenheit;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter temperature in Celsius");
        celsius = keyboard.nextDouble();
        fahrenheit = 1.8 * celsius + 32;
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);


    }
}
