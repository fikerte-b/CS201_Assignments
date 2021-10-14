package lab10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab10_2 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Please enter a value for N:");
        int num=keyboard.nextInt();
        double arr[]=new double[num];
        System.out.println("Please enter "+ num +" values of the array");
        for(int i =0;i<num; i++)
        arr[i] = keyboard.nextDouble();
        System.out.print("The standard deviation is: ");
        System.out.println(standardDeviation(arr));

    }
    public static double standardDeviation(double[] arrays){
        int n = arrays.length;
        double sum = 0;
        for(int i =0; i<n; i++){
            sum+=arrays[i];
        }

        double xAverage = sum/n;
        double sDBeforeSquareRoot =0;
        for(int i =0; i<n; i++){
            sDBeforeSquareRoot+= Math.pow(arrays[i]-xAverage, 2);
        }
        double s = Math.sqrt(sDBeforeSquareRoot/n);

        return s;
    }

}
