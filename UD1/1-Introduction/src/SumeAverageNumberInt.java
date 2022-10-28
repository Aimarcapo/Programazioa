public class SumeAverageNumberInt {   // Save as "SumAverageRunningInt.java"
   public static void main (String[] args) {
      // Define variables
      int sum = 0;          // The accumulated sum, init to 0
      double average;       // average in double
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 100;
      double divisor=UPPERBOUND; //To have an average with decimals
      // Use a for-loop to sum from lowerbound to upperbound
      for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            // The loop index variable number = 1, 2, 3, ..., 99, 100
         sum += number;  
           // same as "sum = sum + number"
      }
      average=sum/divisor;
     

      
      System.out.println("The sum is "+sum);
      System.out.println("The average is "+average);
   }
}
