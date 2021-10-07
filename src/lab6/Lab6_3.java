package lab6;

import java.util.Scanner;

public class Lab6_3 {
    public static void main(String[] args){
        int x = 10;
        int y = 20;
        int z = 30;


        boolean isTrueA = x < 10 || x > 10;
        System.out.println(isTrueA);
        boolean isTrueB = x > y && y > x;
        System.out.println(isTrueB);
        boolean isTrueC = (x<y+z) && (x + 10 <=20);
        System.out.println(isTrueC);
        boolean isTrueD = z-y == x && Math.abs(y-z) == x;
        System.out.println(isTrueD);
        boolean isTrueE = x < 10 && x > 10;
        System.out.println(isTrueE);
        boolean isTrueF = x > y || y > x;
        System.out.println(isTrueF);
        boolean isTrueG = !(x < y + z) || !(x < y || y < x);
        System.out.println(isTrueG);
        boolean isTrueH = !(x == y) && (x != y) && ( x<y || y<x);
        System.out.println(isTrueH);

    }
}
