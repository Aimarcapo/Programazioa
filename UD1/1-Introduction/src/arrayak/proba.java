package arrayak;

import java.util.Scanner;

public class proba {

    public static void main(String[] args) {

      
            // Define variables
            int sumOdd = 0;
            int sumEven=0;         // The accumulated sum, init to 0
            int absDiff;      // average in double
            final int LOWERBOUND = 1;
            final int UPPERBOUND = 100;
            //To have an average with decimals
            // Use a for-loop to sum from lowerbound to upperbound
            
            for(int number=LOWERBOUND;number <= UPPERBOUND;number++) {
                  // The loop index variable number = 1, 2, 3, ..., 99, 100
               if(number%2==0){
                sumEven+=number;
               }
               else{
                sumOdd+=number;
               }
                 // same as "sum = sum + number"
            }
          if(sumOdd>sumEven){
            absDiff=sumOdd-sumEven;
          }
           else{
            absDiff=sumEven-sumOdd;
           }
      
            
            System.out.println("The odd sum is "+sumOdd);
            System.out.println("The absolute difference is "+absDiff);
            System.out.println("The even sum is "+sumEven);
         }
}