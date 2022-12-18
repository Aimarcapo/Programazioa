import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main (String[] args) {
        // Declare constant
      final int NUM_STUDENTS = 3;
      
      // Declare variables
      int numberIn;
      boolean isValid;   // boolean flag to control the input validation loop
      int sum = 0;
      double average;
      Scanner in = new Scanner(System.in); 
      in.close();
      for (int studentNo = 1; studentNo <= NUM_STUDENTS; ++studentNo) {
        // Prompt user for mark with input validation
        
        isValid = false;   // reset assuming input is not valid
        do {
            System.out.println("Input a number");
            numberIn = in.nextInt();
            if (numberIn>0&&numberIn<100){isValid = true;
            }
            else{ System.out.println("Invalid input, try again..."); 
        }
        } while (!isValid);
        System.out.println("The number is correct"); 
        sum += numberIn;
        
     }
    
     average=sum/3;
     System.out.print("The average is:"+average);
    }
    
}
