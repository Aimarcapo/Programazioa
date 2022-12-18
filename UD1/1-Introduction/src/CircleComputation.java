import java.util.Scanner;

public class CircleComputation {
    public static void main (String[] args) {

        double radius, diameter, circumference, area;  // inputs and results - all in double
    
        
        // Prompt and read inputs as "double"
        Scanner in = new Scanner(System.in);  // Scan the keyboard for input
        System.out.print("Enter radius: ");
        radius = in.nextDouble();  // read input as double
        diameter = 2.0 * radius;
        area = Math.PI * radius * radius;
        circumference = 2.0 * Math.PI * radius;
        in.close();
        // Compute in "double"
        
  
        // Print results using printf() with the following format specifiers:
        //   %.2f for a double with 2 decimal digits
        //   %n for a newline
        System.out.printf("Diameter is: %.2f%n", diameter);
        System.out.printf("Area is: %.2f%n", area);
        System.out.printf("Cirfumference is: %.2f%n", circumference);


 }
}
