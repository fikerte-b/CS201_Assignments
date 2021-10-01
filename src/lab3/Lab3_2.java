package lab3;

import java.util.Scanner;
// The method converts centimeters in feet and inches
public class Lab3_2 {

    public static void main(String[] args){
        double inCentimeters, convertedInInch;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number in centimeters");
        inCentimeters = keyboard.nextDouble();
        convertedInInch = inCentimeters / 2.54;
        //System.out.println(convertedInInch);
        int inFeet = (int)convertedInInch/12;
        int inInch = (int)convertedInInch%12;
        System.out.println(inCentimeters + "cm is: "+ inFeet +" feet and "+ inInch + " inches");

    }
}
