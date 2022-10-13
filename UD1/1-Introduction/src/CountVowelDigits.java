import java.util.Scanner;
public class CountVowelDigits {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.print("Enter a String:  ");
            String c = input.nextLine();
            input.close();
            char c=""
            System.out.println(
                c + " is a digit -> "
                + Character.isDigit(c));
