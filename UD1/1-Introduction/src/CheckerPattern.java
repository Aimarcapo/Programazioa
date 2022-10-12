import java.util.Scanner;

public class CheckerPattern {
    public static void main(String[] args) {
        int size;
        Scanner in = new Scanner(System.in); // Scan the keyboard
        System.out.print("Enter first integer: "); // No newline for prompting message
        size = in.nextInt();

        for (int row = 1; row <= size; row++) {
            if ((row % 2) == 0) { // row 2, 4, 6, ...
                System.out.print(" ");
            }  
        System.out.print("#"); // Inner loop to print each of the columns of a particular row
            for (int col = 1; col < size; col++) {
                
                 // col = 1, 2, 3, ..., size
                  // Use print() without newline inside the inner loop
                  System.out.print(" #");
            }
            // Print a newline after printing all the columns
            System.out.println("");
        }
    }
}
