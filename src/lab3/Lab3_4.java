package lab3;

import java.util.Scanner;

//The method calculates daily calories need based on person's weight

public class Lab3_4 {
    public static void main(String[] args){
        double weight;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter person's body weight in pound");
        weight = keyboard.nextDouble();
        int calories = (int)weight * 19;
        System.out.println("Calories needed for a day is: " + calories);



    }
}