public class CylinderComputation {
    public static void main(String[] args) {
        // Declare 3 double variables to hold radius, area and circumference.
        // A "double" holds floating-point number with an optional fractional part.
        
        // Declare a double to hold PI.
        // Declare as "final" to specify that its value cannot be changed (i.e. constant).
        
            // Declare 3 double variables to hold radius, area and circumference.
            // A "double" holds floating-point number with an optional fractional part.
            double radius, baseArea, surfaceArea, height, volume;
            // Declare a double to hold PI.
            // Declare as "final" to specify that its value cannot be changed (i.e. constant).
            final double PI = 3.14159265;
            
            // Assign a value to radius. (We shall read in the value from the keyboard later.)
            radius= 2;
            height=13;
            // Compute area and circumference
            surfaceArea = (2*PI*radius*height)+(2*PI*radius*radius) ;
            baseArea = PI*radius*radius;
            volume =baseArea*height;
            
            // Print results
            System.out.print("The volume is ");  // Print description
            System.out.println(volume);
            System.out.print("The base area is ");  // Print description
            System.out.println(baseArea);                  // Print the value stored in the variable
            System.out.print("The surfac earea is ");
            System.out.println(surfaceArea);
           
         }
        
        
            
        }
        
      
     
    
    
        
    
    
