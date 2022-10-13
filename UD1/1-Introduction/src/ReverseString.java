import java.util.Scanner;


    

    public class ReverseString {
        public static void main(String[] args) {
    
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a String:  ");
            String inStr = input.nextLine();
            input.close();
            String a="";
            
            // Initialize as Empty String
            for(int charIdx  = inStr.length() - 1 ; charIdx >=0 ; charIdx --){
                a += inStr.charAt(charIdx );
            }
            System.out.println("Reverse form: "+a);
        }
    }
