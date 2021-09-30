package lab2;

import java.util.Scanner;

public class Lab2_1 {
    public static void main(String[] args){
        String fName;
        String mName;
        String lName;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter  first name");
        fName = keyboard.next();
        System.out.println("Please enter middle name");
        mName = keyboard.next();
        System.out.println("Please enter last name");
        lName = keyboard.next();
        System.out.print(fName +" "+ mName.charAt(0)+". " + lName);



    }
}
