package lab5;

import java.util.Scanner;

public class MyJavaLoFatBurgers {
    public static final double HOURLY_WAGE = 7.25;
    public static final int REGULAR_HOUR = 40;
    public static final double SALE_THRESHOLD1 = 1.00;
    public static final double SALE_THRESHOLD2 = 99.99;
    public static final double SALE_THRESHOLD3 = 100.00;
    public static final double SALE_THRESHOLD4 = 299.99;
    public static final double COMMISSION1 = 0.05;
    public static final double COMMISSION2 = 0.1;
    public static final double COMMISSION3 = 0.15;


    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the hours the employee worked");
        double numberOfHours = keyboard.nextDouble();
        System.out.println("Please enter the total sales the employee generated");
        double sale = keyboard.nextDouble();
        System.out.println("Number of hours worked per week: "+ numberOfHours +
                "\nTotal sale per employee: "+ sale +
                "\nTotal wage earned: "+ MyJavaLoFatBurgers.employeeWage(numberOfHours, sale));

    }

    public static double employeeWage(double hours, double sales){

        double wage;
        double overTimeWage = 1.5 * (hours - REGULAR_HOUR)* HOURLY_WAGE;
        if(hours <= REGULAR_HOUR){
            wage = (REGULAR_HOUR * HOURLY_WAGE);
        }else{
            wage = (REGULAR_HOUR * HOURLY_WAGE) + overTimeWage;
        }

        System.out.println(wage);

        if(sales >= SALE_THRESHOLD1 && sales <= SALE_THRESHOLD2  ){
            wage = wage + (sales * COMMISSION1);


        }else if(sales >= SALE_THRESHOLD3 && sales <= SALE_THRESHOLD4 ){
            wage = wage + (sales * COMMISSION2);

        }else{
            wage = wage + (sales * COMMISSION3);

        }

        return wage;

    }
}
