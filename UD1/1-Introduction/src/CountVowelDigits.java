import java.util.Scanner;
  
public class CountAlphabetsInWord {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word to count Vowels and Alphabets in it");
        String word = scanner.nextLine();
        scanner.close();
        int vowels = 0 int consonants = 0, int spaces = 0, int digits = 0, int specialCharacters = 0;
        word = word.toLowerCase();
        for(int i = 0; i <= word.length(); i++){
            char ch = word.charAt(i);
            
            //check if any char is a, e, i, o ,u
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels=vowels+1;
            }
            else if(ch >=  '0' && ch <= '9'){
                consonants++;
            }
            else if(ch == ' '){
                spaces++;
            }
            else if(ch >= 'a' && ch <= 'z'){
                digits++;
            }
            else
                specialCharacters++;
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("WhiteSpaces: " + spaces);
        System.out.println("Special Characters: " + specialCharacters);
    }
} 