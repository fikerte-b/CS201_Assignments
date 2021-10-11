package lab8;

import java.util.Scanner;

public class Lab8_2 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please write the first sentence");
        String sentence = keyboard.nextLine();

        while(sentence.length() != 0){
            int count = 0;
            for(int i= 0; i< sentence.length(); i++){

                if(Character.isUpperCase(sentence.charAt(i)))
                    count++;
            }
            System.out.println("No of upper case characters: "+ count);
            System.out.println("Please enter another sentence");
            sentence = keyboard.nextLine();
        }
        System.out.println("You have entered empty sentence!");
    }
}
