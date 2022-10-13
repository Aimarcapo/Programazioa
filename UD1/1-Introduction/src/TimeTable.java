import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        int size;
        Scanner in = new Scanner(System.in); // Scan the keyboard
        System.out.print("Enter size: "); // No newline for prompting message
        size = in.nextInt();
        System.out.print("*");
        in.close();
        for (int x = -1; x <= size; x++) {
            if (x == -1) {
                System.out.print("\t|");
            } else if (x == 0) {
                System.out.print("------------");
            } else if (x > 0) {
                System.out.printf("%1$d\t|", x);
            }

            for (int y = 1; y <= size; y++) {
                
                 if (x == -1 ) {
                    System.out.printf("\t%1$d", y);
                    continue;
                } else if (x == 0 ) {
                    System.out.print("--------");
                    continue;
                }

                System.out.printf("\t%1$d", x * y);
            }
            System.out.println();
        }
    }
}
