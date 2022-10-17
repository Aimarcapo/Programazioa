import java.util.Scanner;

public class Gurutzea {
    public static void main(String[] args) {
        int number;

        Scanner in = new Scanner(System.in); // Scan the keyboard
        System.out.print("Enter number: "); // No newline for prompting message
        number = in.nextInt();
        in.close();
        
        if (number % 2 == 0) {
            System.out.print("Zenbaki bakoitia izan behar da"); // No newline for prompting message
        } else {

            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    if (i %((number+1)/2 )== 0) {
                        System.out.print("0 ");
                    }
                    else if (j%((number+1)/2 )== 0) {
                        System.out.print("0 ");
                    }
                   else{
                    System.out.print(". ");
                   }
                }
                
                System.out.println();
            }
           
        }
        
        
    }
    
}

