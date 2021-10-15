package lab11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab11_2 {
    /**
     * a) num = -1, output:
     *                Error: Not zero
     *                Finally Clause Executed
     * b) num = 0, output:
     *                I'm happy with input.
     *                Finally Clause Executed
     * c) num = 12XY, output:
     *                Invalid Entry
     *                Finally Clause Executed
     */
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
        } finally{
            System.out.println("Finally Clause Executed");
        }

    }
}
