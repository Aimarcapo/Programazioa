public class ThreeFiveSevenSum {  // Save as "OddEvenSum.java"
   public static void main(String[] args) {
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 1000;
      int sum = 0;    // For accumulating odd numbers, init to 0
        // For accumulating even numbers, init to 0
      int number = LOWERBOUND;
      while (number <= UPPERBOUND) {
            // number = LOWERBOUND, LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND for each iteration
         if ((number % 3 == 0||number%5==0||number%7==0) && (number%15!=0&&number%21!=0&&number%35!=0&&number%105!=0))
          {  // Even
            sum+=number;
            ++number;   // Same as sumEven = sumEven + number
         } else {                // Odd
            ++number;   // Same as sumOdd = sumOdd + number
         }
           // Next number
      } 
      // Print the result
      System.out.println("The sum of odd numbers from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
     
      
   }
}