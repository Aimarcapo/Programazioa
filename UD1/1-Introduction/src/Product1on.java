public class Product1on {   // Save as "SumAverageRunningInt.java"
   public static void main (String[] args) {
      // Define variables
      int product = 1;          // The accumulated sum, init to 0
             // average in double
      
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 10;

      // Use a for-loop to sum from lowerbound to upperbound
      for(int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
        product =product * number;
    }
      // Compute average in double. Beware that int / int produces int!
    
      // Print sum and average
      System.out.println("The product is"+product);
   }
}