public class HarmonicSum {

    // Save as "HarmonicSum.java"
    public static void main(String[] args) {
        // Define variables
        final int MAX_DENOMINATOR = 50000; // Use a more meaningful name instead of n
        double sumL2R = 0.0; // Sum from left-to-right
        double sumR2L = 0.0; // Sum from right-to-left
        double absDiff;
        int ONE = 1; // Absolute difference between the two sums

        // for-loop for summing from left-to-right
        for (double denominator = 1; denominator <= MAX_DENOMINATOR; ++denominator) {
            // denominator = 1, 2, 3, 4, 5, ..., MAX_DENOMINATOR
            sumR2L = sumR2L + ONE / denominator;

            // Beware that int/int gives int, e.g., 1/2 gives 0.
        }
        for (double i = MAX_DENOMINATOR; i >= 1; i--) {
            sumL2R = sumL2R + (ONE / i);

            // for-loop for summing from right-to-left

        }
        // Find the absolute difference and display
        if (sumL2R > sumR2L) {
            absDiff = sumL2R - sumR2L;
        } else {
            absDiff = sumR2L - sumL2R;
        }

        System.out.println("The absolute difference is: " + absDiff);
        System.out.println("The sum from right to left is: " + sumR2L);
        System.out.println("The sum from left-to-right is: " + sumL2R);
    }
}
