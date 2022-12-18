package arrayak;

import java.util.Scanner;

public class GradeStatistics {
    public static void main(String[] args) {
        

        boolean isValid = false;
        Scanner input = new Scanner(System.in);
        int NUM_ITEMS;
        int collection[];

        float average;
        
        do {
            System.out.print("Enter the size of the array: ");
            NUM_ITEMS = input.nextInt();

            if (NUM_ITEMS > 0) {
                isValid = true;
            }

        } while (!isValid);
        collection = new int[NUM_ITEMS];

   
        for (int i = 0; i < NUM_ITEMS; i++) {

            do {
                System.out.println("Select the student" + i + "grade");
                collection[i] = input.nextInt();

                if (collection[i] > 0) {
                    isValid = true;
                } else {
                    isValid = false;
                }
            } while (!isValid);
        }

        input.close();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Loop to print the stars.
        for (int i = 0; i < collection.length; i++) {
            sum = sum + collection[i];

            if (collection[i] > max) {
                max = collection[i];
            }
            if (collection[i] < min) {
                min = collection[i];

            }

            System.out.println("The students grade is: [" + collection[i] + "]");

        }
        
        System.out.println("Sum is " + sum);
        System.out.println("The average is " + sum / collection.length);
        System.out.println("The minimum is " + min);
        System.out.println("The maximum is " + max);
    }
}