package lab12;

public class Lab12_4 {
    public static void main(String[] args) {
     String str = "Java";
     reverseString(str);
     System.out.println();
     System.out.println(reverseString2(str));
    }
    public static void reverseString(String words){
        if(words.length() == 1)
            System.out.print(words);
        else{
            reverseString(words.substring(1));
          //  System.out.println(words);
            System.out.print(words.substring(0,1));
        }

    }

    // using for loop
    public static String reverseString2(String word){
        String reverse = "";
        for(int i= word.length()-1; i>=0; i--){
            reverse = reverse + word.charAt(i);
        }
        return reverse;
    }
}
