package lab7;

public class Lab7_2b {
    public static void main(String[] args) {

        // Using for loop
        System.out.println("Executing sum and product using For loop");
        int sumFor =0;
        long productFor = 1;
        for( int i = 5; i <= 50; i+=5){
            sumFor+=i;
            productFor*=i;
//            System.out.println("i:"+i);
//            System.out.println( "Sum: " + sumFor);
//            System.out.println( "Product: " + productFor);
        }
        System.out.println( "Sum: " + sumFor);
        System.out.println( "Product: " + productFor);


        // Using while loop
        System.out.println("Executing sum and product using While loop");
        int i =5;
        int sumWhile =0;
        long productWhile =1;
        while(i<=50){
            sumWhile+=i;
            productWhile*=i;
            i+=5;

        }
        System.out.println( "Sum: " + sumWhile);
        System.out.println( "Product: " + productWhile);

        // Using do while loop;
        System.out.println("Executing sum and product using Do-While loop");
        int num = 5;
        int sumDo = 0;
        long productDo = 1l;
        do {
            sumDo+=num;
            productDo*=num;
            num+=5;
        }while(num <=50);
        System.out.println( "Sum: " + sumDo);
        System.out.println( "Product: " + productDo);

    }

}
