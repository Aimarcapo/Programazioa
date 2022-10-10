import java.util.Scanner;

public class TriangularPatternD {
    public static void main(String[] args) {
        int size;
        Scanner in = new Scanner(System.in); // Scan the keyboard
        System.out.print("Enter size "); // No newline for prompting message
        size = in.nextInt();
        // Outer loop to print each of the rows
        for (int row = 1; row <= size; row++) { // row = 1, 2, 3, ..., size
            // Inner loop to print each of the columns of a particular row
            for (int col = 1; col <= size; col++) { // col = 1, 2, 3, ..., size
                if (col+row>=size+1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  "); // Need to print the "leading" blanks
                }
            }
            // Print a newline after printing all the columns
            System.out.println();
        }
    }
}


