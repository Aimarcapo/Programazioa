public class PrintLeapYears {
    
    public static void main(String[] args) {
        
            // For accumulating odd numbers, init to 0
   // For accumulating even numbers, init to 0
        
        int count=0;
        for (int year = 999; year < 2010; year++) {
              if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) { 
                count ++;// Even
                System.out.println(year);
              }
            }
        System.out.println("The count of leap years is" + count );
     }
    }

 

