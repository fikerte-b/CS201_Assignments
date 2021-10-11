package lab8;

import java.util.Scanner;

public class Lab8_4 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please write the first sentence");
        String sentence = keyboard.nextLine();

        while(sentence.length() != 0){
            String reverse = "";
            for(int i= sentence.length()-1; i>=0; i--) {
                reverse = reverse + sentence.charAt(i);
            }
            // System.out.println("Reverse word: "+ reverse);
            if(reverse.equalsIgnoreCase(sentence))
                System.out.println("Is palindrome");
            else
                System.out.println("Is not palindrome");

            System.out.println("Please enter another sentence");
            sentence = keyboard.nextLine();
        }
        System.out.println("You have entered empty sentence!");
    }
}
