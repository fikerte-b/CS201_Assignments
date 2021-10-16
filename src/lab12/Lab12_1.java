package lab12;

import java.util.Scanner;

public class Lab12_1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the word and the number where to start counting");
        String word = keyboard.next();
        int num = keyboard.nextInt();
        System.out.print("The word "+ word + " has ");
        System.out.print(countCharacters(word, num));
        System.out.print(" characters");


    }

    public static int countCharacters(String words, int index){
        if(index == words.length())
            return 0;
        else
           return 1 + countCharacters(words, index +1);
    }
}

