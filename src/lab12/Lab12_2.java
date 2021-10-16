package lab12;

import java.util.Scanner;

public class Lab12_2 {
    public static void main(String[] args) {

        int[] arr = {1,56,3,5,9};
        System.out.println(smallest(arr,2,3));

    }
    public static int smallest(int[] arrs, int index, int nextIndex){
        int nextValue;
        if(index == arrs.length-1)
            return arrs[index];
        else
            nextValue = smallest(arrs, index +1, nextIndex);
        if(arrs[index ] < nextValue)
            return arrs[index ];
        else
            return nextValue;

    }
}
