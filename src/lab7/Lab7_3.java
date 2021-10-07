package lab7;

public class Lab7_3 {
    public static void main(String[] args) {
        int num = 10;
        for(int r =0; r<4;r++ ){
            for(int c = 0; c<10; c++) {
                System.out.print(num++ + "\t ");
            }
            System.out.println();
        }
    }
}
