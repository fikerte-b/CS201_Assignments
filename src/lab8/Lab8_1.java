package lab8;

import java.util.Scanner;

public class Lab8_1 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please write a sentence");
        String sentence = keyboard.nextLine();
        while(sentence.length() != 0){
            int a =0;
            int e =0;
            int i =0;
            int o =0;
            int u =0;

            for(int j =0; j < sentence.length(); j++){
                if(sentence.charAt(j) == 'a')
                    a++;
                else if(sentence.charAt(j) == 'e')
                    e++;
                else if(sentence.charAt(j) == 'i')
                    i++;
                else if(sentence.charAt(j) == 'o')
                    o++;
                else if(sentence.charAt(j) == 'u')
                    u++;
            }
            System.out.println("# of 'a' : "+ a);
            System.out.println("# of 'e' : "+ e);
            System.out.println("# of 'i' : "+ i);
            System.out.println("# of 'o' : "+ o);
            System.out.println("# of 'u' : "+ u);
            System.out.println("Please enter the next sentence");
            sentence = keyboard.nextLine();

        }
        System.out.println("You have entered empty string.");

    }
}
