package lab4;

import java.util.Scanner;

public class WeightConverter {

    private static double conversionFactor;
  public WeightConverter(double conversionFactor){
      this.conversionFactor = conversionFactor;

    }

    public static void convert(double weight){
        double yourWeightOnMoon = conversionFactor * weight;
        System.out.println("Your weight on Moon is: " + yourWeightOnMoon);
    }
}
