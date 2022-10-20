package arrayak;
import javax.swing.JOptionPane;
public class prueba {
    
 
 
    public static void main(String[] args) {
        // create array based on the number of args entered by user
        String response = JOptionPane.showInputDialog(null, "Number of scores:");
        int number = Integer.parseInt(response);
        int scores[] = new int[number];
        // for loop to convert String args array to integer myArray
        for (int a = 0; a < number; a++) {
            response = JOptionPane.showInputDialog(null, "Enter score" + (a + 1));
            scores[a] = Integer.parseInt(response);
        }
        int sum = 0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        //for loop to find sum, largest and smallest
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
            if (scores[i] > largest) {
                largest = scores[i];
            }
            if (scores[i] < smallest) {
                smallest = scores[i];
            }
        }
        //output
        JOptionPane.showMessageDialog(null, "The sum is " + sum
                + "\nThe average is " + sum / scores.length
                + "\nThe largest score is " + largest
                + "\nThe smallest score is " + smallest);
 
    }
 
}

