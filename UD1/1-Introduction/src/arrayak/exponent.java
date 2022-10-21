package arrayak;

public class exponent {
    
    public static void main(String[] args) {
        // Declare variables
        int exp;    // exponent (non-negative integer)
        int base;   // base (integer)
        
        // Prompt and read exponent and base
        
        // Print result
        System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));
     }
  
     // Returns "base" raised to the power "exp"
     public static int exponent(int base, int exp) {
        int product = 1;   // resulting product
  
        // Multiply product and base for exp number of times
        for (......) {
           product *= base;
        }
  
        return product;
     }
}
