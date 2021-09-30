package lab2;

import java.util.Scanner;

public class Lab2_3 {
    // Display the middle character of a word of an odd character number

    public static void main(String[] args){
        String word;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter  an odd character number of word");
        word = keyboard.next();
        char middleChar = word.charAt(word.length()/2);
        System.out.println("The middle character of the word: " + word + " is: "+ middleChar);
    }
}
