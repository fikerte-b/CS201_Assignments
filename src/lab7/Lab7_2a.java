package lab7;

public class Lab7_2a {
    public static void main(String[] args) {

        // Using for loop
        System.out.println("Executing sum and product using For loop");
        int sumFor =0;
        double productFor = 1.0;
        for( int i =1; i <=100; i++){
            sumFor+=i;
            productFor*=i;

        }
        System.out.println( "The sum of integer numbers from 1 - 100 is: " + sumFor);
        System.out.println( "The product of integer numbers from 1 - 100 is: " + productFor);


        // Using while loop
        System.out.println("Executing sum and product using While loop");
        int j =1;
        int sumWhile =0;
        double productWhile =1.0;
        while(j<=100){
            sumWhile+=j;
            productWhile*=j;
            j++;

        }
        System.out.println( "The sum of integer numbers from 1 - 100 is: " + sumWhile);
        System.out.println( "The product of integer numbers from 1 - 100 is: " + productWhile);

        // Using do while loop;
        System.out.println("Executing sum and product using Do While loop");
        int num = 1;
        int sumDo = 0;
        double productDo = 1.0;
        do {
            sumDo+=num;
            productDo*=num;
            num++;
        }while(num <=100);
        System.out.println( "The sum of integer numbers from 1 - 100 is: " + sumDo);
        System.out.println( "The product of integer numbers from 1 - 100 is: " + productDo);

    }
}
