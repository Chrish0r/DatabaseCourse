package averageValue;

import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        int n = 1000000000;

        System.out.println("The average value after " + n + " dice rolls is:   " + calcMean(n));

    }

    private static double calcMean(int n) {
        Random ran = new Random();
        int lowerBound = 1;
        int upperBound = 7; //6+1 -> since upperBound is exclusive
        double sum = 0;

        for(int i = 0; i < n; i++) {
            int temp = ran.nextInt(upperBound-lowerBound) + lowerBound;
            sum = sum += temp;
        }
        return sum/n;
    }
}
