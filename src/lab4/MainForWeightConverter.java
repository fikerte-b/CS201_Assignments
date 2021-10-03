package lab4;

import java.util.Scanner;

public class MainForWeightConverter {
    public static final double MOON_GRAVITY_RATIO = 0.167;


    public static void main(String[] args){

        WeightConverter moonWeight = new WeightConverter(MOON_GRAVITY_RATIO);
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your weight on earth in pounds");
        double weightOnEarth = keyboard.nextDouble();
        moonWeight.convert(weightOnEarth);


    }
}
