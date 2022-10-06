import java.util.Scanner; 
public class SumOfDigitsInt {
    public static void main (String[] args) {
        int inNumber;
        int inDigit;
        int sum=0;
        Scanner in = new Scanner(System.in);  // Scan the keyboard for input
      System.out.print("Enter a positive integer: ");  // No newline for prompting message
      inNumber= in.nextInt();
      in.close(); 
      while (inNumber > 0) {
        inDigit = inNumber % 10;
   
        
    
        sum=sum+inDigit;
        
        
        
        inNumber /= 10;
        
    }
    System.out.print("The sum is "+sum);
}
}
