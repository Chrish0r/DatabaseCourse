package quantile;

public class Quantil_Binomialverteilung {


    public static void main(String[] args) {
        double n = 10;
        double pi = 0.6;
        double quantile = 0.5;

        int quantileValue = getQuantil(n, pi, quantile);

        System.out.println("Das " + (quantile * 100) + "-% Quantil von X ist: " + quantileValue);
    }

    public static int getQuantil(double n, double pi, double quantile) {
        double sum = 0;
        int i = 0;

        for(i = 0; ; i++) {
            sum += calcProbability(i, n, pi);
            if(sum >= quantile) {
                break;
            }
        }
        return i;
    }

    private static double calcProbability(int x, double n, double pi) {
        double binomialCoefficient = calcBinomial(n,x);
        double probability = binomialCoefficient * Math.pow(pi, x) * Math.pow((1-pi), n-x);

        return probability;
    }

    private static double calcBinomial(double n, int x) {
        double binomial = (getFak(n) / (getFak(x) * getFak( n-x)));
        return binomial;
    }

    private static int getFak(double m) {
        int n = (int) m;
         if(n == 0) {
             return 1;
         } else {
             return n * getFak(n-1);
         }
    }

    private static int getFakIter(double n) {
        int fak = 1;
        for(int i = 1; i <= n; i++) {
            fak *= i;
        }
        return fak;
    }
}
