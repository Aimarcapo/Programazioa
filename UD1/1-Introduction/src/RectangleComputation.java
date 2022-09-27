public class RectangleComputation{
 public static void main(String[] args) {
    // Declare 3 double variables to hold radius, area and circumference.
    // A "double" holds floating-point number with an optional fractional part.
    double length, area, width, perimeter;
    // Declare a double to hold PI.
    // Declare as "final" to specify that its value cannot be changed (i.e. constant).
    
    
    // Assign a value to radius. (We shall read in the value from the keyboard later.)
    length = 2;
    width=3;
    // Compute area and circumference
    area = width * length ;
    perimeter = 2*width+2*length;
    
    // Print results
    System.out.print("The length is ");  // Print description
    System.out.println(length);
    System.out.print("The width is ");  // Print description
    System.out.println(width);                  // Print the value stored in the variable
    System.out.print("The area is ");
    System.out.println(area);
    System.out.print("The perimeter is ");
    System.out.println(perimeter);
 }

{
    
}
}
