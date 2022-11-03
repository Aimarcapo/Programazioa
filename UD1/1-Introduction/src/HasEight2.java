import java.util.Scanner;

public class HasEight2 {

    public static void main(String[] args) {
        int number;
        final int Sentinel = -1;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer (or -1 to end) : ");
        number = in.nextInt();
        int sum = 0;
        while (number != Sentinel) {
            if (hasEight(number)) {
                sum = sum + number;
            }
            System.out.print("Enter a positive integer (or -1 to end) : ");
            number = in.nextInt();
        }
        System.out.print("The magic sum is " + sum);
    }

    public static boolean hasEight(int zenbakia) {
        int digit;
        while (zenbakia > 0) {
            digit = zenbakia % 10;

            if (digit == 8) {
                return true;
            }
            zenbakia = zenbakia / 10;
        }
        return false;
    }
}
