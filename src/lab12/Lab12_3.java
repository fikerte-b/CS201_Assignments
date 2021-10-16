package lab12;

public class Lab12_3 {
    public static void main(String[] args) {
        double[] array = {19,30,50,2};
        System.out.println(sumArray(array, 1, 2));

    }
    public static double sumArray(double[] arr, int index, int nextIndex){
        double sum = arr[index];
    if(index == arr.length -1)
        return arr[index];
    else {
        return sum + sumArray(arr, index +1,nextIndex);

    }

    }
}
//    public static void main(String[] args) {
//        double[] array = {19,30,50,2};
//        System.out.println(sumArray(array, 1));
//
//    }
//    public static double sumArray(double[] arr, int index){
//        double sum = arr[index];
//        if(index == arr.length -1)
//            return arr[index];
//        else {
//            return sum + sumArray(arr, index + 1);
