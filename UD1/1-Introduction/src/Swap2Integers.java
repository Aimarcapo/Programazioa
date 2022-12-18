import java.util.Scanner;   // For keyboard input
/**
 * 1. Prompt user for 2 integers
 * 2. Read inputs as "int"
 * 3. Compute their sum in "int"
 * 4. Print the result
 */
public class Swap2Integers {  // Save as "Add2Integers.java"
   public static void main (String[] args) {
      // Declare variables
      int number1, number2,temp;

      // Put up prompting messages and read inputs as "int"
      Scanner in = new Scanner(System.in);  // Scan the keyboard for input
      System.out.print("Enter first integer: ");  // No newline for prompting message
      number1 = in.nextInt();
      System.out.print("Enter second integer: ");  // No newline for prompting message
      number2 = in.nextInt();                          // Read next input as "int"
      
      in.close();  // Close Scanner

      // Compute sum
      temp=number1;number1=number2;number2=temp;

      // Display result
      System.out.println("The swap first integer is  " + number1);
      System.out.println("The second integer is"+number2);  // Print with newline
   }
}