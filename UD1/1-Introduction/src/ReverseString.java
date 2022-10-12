import java.util.Scanner;


    

    public class ReverseString {
        public static void main(String[] args) {
    
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a String:  ");
            String original = input.nextLine();
    
            String rev = "";// Initialize as Empty String
            for(int i = original.length() - 1 ; i>=0 ; i--){
                rev += original.charAt(i);
            }
            System.out.println("Reverse form: "+rev);
        }
    }
