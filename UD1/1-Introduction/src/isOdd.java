import java.util.Scanner;

public class isOdd {

    public static void main(String[] args) {
        int number;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:");
        number = in.nextInt();
        in.close();

        boolean hola = isOdd(number);

        if (hola) {
            System.out.println("The number is odd");
        } else {
            System.out.println("The number is even");
        }

    }

    public static boolean isOdd(int number) {
        return (number % 2 == 0) ? false : true;

    }

}
