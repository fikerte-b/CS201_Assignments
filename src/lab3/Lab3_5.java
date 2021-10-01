package lab3;

import java.time.Year;
import java.util.Scanner;
// calculating the age of a person
public class Lab3_5 {
    public static void main(String[] args){
       // final  int CURRENT_YEAR = 2021;
        int year = Year.now().getValue();
        int bornYear, age;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the year the person born");
        bornYear = keyboard.nextInt();
       // System.out.println(year);
        age = year - bornYear;
        System.out.println("You were born "+ bornYear + " and will be "+ age + " this year");




    }
}
