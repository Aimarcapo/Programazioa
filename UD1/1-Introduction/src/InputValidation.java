import java.util.Scanner; 
public class InputValidation {
    public static void main (String[] args) {

       // Declare variables
      int numberIn;      // to be input
      boolean isValid;   // boolean flag to control the loop
      
      Scanner in = new Scanner(System.in);  // Scan the keyboard for input
        // No newline for prompting message
     
      // Use a do-while loop controlled by a boolean flag 
      // to repeatably read the input until a valid input is entered
      isValid = false;   // default assuming input is not valid
      do {
         // Prompt and read input
         System.out.println("Input a number");
           // Scan the keyboard for input
         // No newline for prompting message
         numberIn = in.nextInt(); 
      


         // Validate input by setting the boolean flag accordingly
         if (numberIn>90&&numberIn<100||numberIn>0&&numberIn<10) {
            isValid = true;   // exit the loop
         } else {
      System.out.println("Invalid input, try again..."); 
            
         }
      } while (!isValid);
      System.out.println("The Number is correct"); 
}
}
