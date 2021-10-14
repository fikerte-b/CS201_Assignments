package lab10;

public class Lab10_1 {
    public static void main(String[] args) {
        double[] temp = new double[365];
       // double temp[] = {79.0, 90.8, 104.5, 110, 23, -4, 45.9, 32, -10.9};

        double hottestDayOfYear = temp[0];
        double coldestDayOfYear = temp[0];
        int hottestDate = 0;
        int coldestDate = 0;
        for(int i =1; i < temp.length; i++){
            if(temp[i] > hottestDayOfYear) {
                hottestDayOfYear = temp[i];
                hottestDate = i;
            }
            else if(temp[i] < coldestDayOfYear) {
                coldestDayOfYear = temp[i];
                coldestDate = i;
            }   }
        System.out.println("The hottest day of the year: day "+ (hottestDate+1)+ " tempreture in F: "+ hottestDayOfYear);
        System.out.println("The coldest day of the year: day "+ (coldestDate+1) + " tempreture in F: "+ coldestDayOfYear);
        System.out.println();

        // Average Temperature of each Month
        // Assume tem[0] is monday and first day of January
        double t = 0;
        for (int i = 0; i < 30; i++) {
            t += temp[i];
        }

        System.out.println("January average temperature: " + (t / 31));
        hottestColdest(temp, 0,5);

        for (int i = 31; i < 59; i++) {
            t += temp[i];
        }
        System.out.println();
        System.out.println("February average temperature: " + (t / 28));
        hottestColdest(temp, 5,9);
        System.out.println();
        for(int i=59; i<90; i++){
            t+=temp[i];
        }
        System.out.println("March average temperature: "+ (t/31));
         hottestColdest(temp,59,90);
        System.out.println();

        for(int i=90; i<120; i++){
            t+=temp[i];
        }
        System.out.println("April average temperature: "+ (t/30));
        hottestColdest(temp, 90,120);
        System.out.println();

        for(int i=120; i<151; i++){
            t+=temp[i];
        }
        System.out.println("May average temperature: "+ (t/31));
        hottestColdest(temp, 120,151);
        System.out.println();

        for(int i=151; i<181; i++){
            t+=temp[i];
        }
        System.out.println("June average temperature: "+ (t/30));
        hottestColdest(temp, 151,181);
        System.out.println();

        for(int i=181; i<212; i++){
            t+=temp[i];
        }
        System.out.println("July average temperature: "+ (t/31));
        hottestColdest(temp, 181,212);
        System.out.println();

        for(int i=212; i<242; i++){
            t+=temp[i];
        }
        System.out.println("August average temperature: "+ (t/31));
        hottestColdest(temp, 212,242);
        System.out.println();

        for(int i=242; i<273; i++){
            t+=temp[i];
        }
        System.out.println("September average temperature: "+ (t/30));
        hottestColdest(temp, 242,273);
        System.out.println();

        for(int i=273; i<303; i++){
            t+=temp[i];
        }
        System.out.println("October average temperature: "+ (t/31));
        hottestColdest(temp, 273,303);
        System.out.println();

        for(int i=303; i<334; i++){
            t+=temp[i];
        }
        System.out.println("November average temperature: "+ (t/31));
        hottestColdest(temp, 303,334);
        System.out.println();

        for(int i=334; i<365; i++){
            t+=temp[i];
        }
        System.out.println("December average temperature: "+ (t/31));
        hottestColdest(temp, 334,365);
        System.out.println();


    }
        public static void hottestColdest(double[] tempArray, int initialIndex, int subLength){

            double hottestDayValue = tempArray[initialIndex];
            double coldestDayValue = tempArray[initialIndex];

            for(int j = initialIndex +1; j < subLength; j++){
                if(tempArray[j] > hottestDayValue)
                    hottestDayValue = tempArray[j];

                else if(tempArray[j] < coldestDayValue)
                    coldestDayValue = tempArray[j];
            }
            System.out.println("The difference between hottest and coldest day: "+ hottestDayValue +
                    "-"+ coldestDayValue +" = "+(hottestDayValue - coldestDayValue));

        }



}
