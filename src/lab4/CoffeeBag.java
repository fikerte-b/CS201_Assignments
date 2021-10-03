package lab4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CoffeeBag {

    public static final double TAX_RATE = 0.0725;
    public static final double UNIT_PRICE = 5.99;
    public static int totalNumberOfBags;
    public static double unitWeight;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the number of coffee bags sold");
        int bags = keyboard.nextInt();
        System.out.println("Please enter the unit weight of a bag in pounds");
          double unitWt = keyboard.nextDouble();
        totalPriceOfSale(bags, unitWt);

    }

    public  static void totalPriceOfSale(int totalNumberOfBags, double unitWeight){
        double totalPrice = totalNumberOfBags * unitWeight * UNIT_PRICE;
        double totalPriceWithTax = totalPrice + totalPrice * TAX_RATE;
        DecimalFormat df = new DecimalFormat("0.00");
        String taxPercentage = df.format(TAX_RATE*100);
        System.out.println("Number of bags sold: "+ totalNumberOfBags + "\nWeight per bag: "+ unitWeight+ "lbs"+
                "\nPrice per pound: $"+ UNIT_PRICE + "\nSales tax: "+ taxPercentage +"%" +
                "\nTotal price: $"+ df.format(totalPriceWithTax));

    }
}
