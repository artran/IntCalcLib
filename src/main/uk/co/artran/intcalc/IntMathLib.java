package uk.co.artran.intcalc;

public class IntMathLib {

    public int add(int first, int second) {
        return first + second;
    }

    public int multiply(int first, int second) {
        int sum = 0;

        for (int step=0; step<first; step++) {
            sum += second;
        }

        return sum;
    }

    public int divide(int first, int second) {
        int count = 0;
        while (first - second >= 0) {
            first -= second;
            count++;
        }
        return count;
    }
}
