package lab8;

import java.util.Scanner;

public class Lab8_3 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the  DNA strand");
        String sentence = keyboard.nextLine();

        while(sentence.length() != 0) {

            StringBuffer replace = new StringBuffer();
            for (int i = 0; i < sentence.length(); i++) {
                char c = sentence.charAt(i);
                if (c == 'A')
                    c = 'T';
                else if (c == 'T')
                    c = 'A';
                else if (c == 'G')
                    c = 'C';
                else if (c == 'C')
                    c = 'G';
                replace.append(c);
                //System.out.println(replace);
            }
            System.out.println(replace);
            System.out.println("Please enter the next DNA strand");
            sentence = keyboard.nextLine();
        }
        System.out.println("Invalid input");
    }
}
