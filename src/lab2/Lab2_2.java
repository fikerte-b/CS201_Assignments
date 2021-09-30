package lab2;

import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args){
        String str;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter text");
        str = keyboard.nextLine();
        System.out.println(str.length());
        System.out.println(str.substring(0,1));
        System.out.println(str.charAt(str.length()-1));

    }
}
