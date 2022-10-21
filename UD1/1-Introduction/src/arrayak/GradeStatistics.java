package arrayak;

import java.util.Scanner;

public class GradeStatistics {
    public static void main(String[] args) {
        // Write a program called printArrayInStars which prompts user for the number of
        // items in an array
        // (a non-negative integer), and saves it in an int variable called NUM_ITEMS.
        // It then prompts user for the values of all the items (non-negative integers)
        // and saves them in an int array called items.
        // The program shall then print the contents of the array in a graphical form,
        // with the array index and values represented by number of stars.

        boolean isValid = false;
        Scanner input = new Scanner(System.in);
        int NUM_ITEMS;
        int collection[];
        
        
        
    

        float average;
        // Ask for user input for the size of array.
        // Validates that it is a positive int
        do {
            System.out.print("Enter the size of the array: ");
            NUM_ITEMS = input.nextInt();

            if (NUM_ITEMS > 0) {
                isValid = true;
            }

        } while (!isValid);
        collection = new int[NUM_ITEMS];

        // Change is valid to false for the next input validation loop.

        // Ask for user input for each of the arrays index.
        // Validates that each input is a positive integer.
        for (int i = 0; i < NUM_ITEMS; i++) {

            do {
                System.out.println("Select the student" + i +"grade");
                collection[i] = input.nextInt();

                if (collection[i] > 0) {
                    isValid = true;
                } else {
                    isValid = false;
                }
            } while (!isValid);
        }

        input.close();
        int sum=0;
        int max = Integer.MIN_VALUE;
        int min  = Integer.MAX_VALUE;
        
        // Loop to print the stars.
        for (int i = 0; i < collection.length; i++) {
            sum = sum + collection[i];
            
            if (collection[i] > max) {
                max = collection[i];
            }
            if (collection[i] < min) {
                min = collection[i];
                
            }
            

                
            
            System.out.println("The students grade is: [" + collection [i] + "]");
           
           
           
               
            }
            System.out.println("Sum is " + sum);
            System.out.println("The average is " + sum / collection.length);
            System.out.println("The minimum is " + min);
            System.out.println("The maximum is " + max);
        }
    }