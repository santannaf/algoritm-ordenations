package ordination.tests;

public class MaxSumArraySubSequences {
    public static void main(String... args) {
        int[] v = {2, -5, 1, 3};

        int maxSum = 0;
        int sum = 0;

        for (int i = 0; i < v.length; i++) {
            int number = v[i];
            if (i == 0) {
                maxSum = number;
                sum = number;
            } else {
                sum = Math.max(sum + number, number);
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        System.out.printf("Soma máxima é: %s", maxSum);
        System.out.println();
    }
}