package lab11;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
* a) num = -1, output: Error: Not zero
 * b) num = 0, output: I'm happy with input.
 * c) num = 12XY, output: Invalid Entry
 */
public class Lab11_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            int num = scanner.nextInt();
            if(num != 0){
                throw new Exception("Not zero");
            }
            System.out.println("I'm happy with the input.");
        } catch (InputMismatchException e){
            System.out.println("Invalid Entry");
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }

}
