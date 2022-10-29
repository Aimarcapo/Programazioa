package arrayak;


public class prueba {

 
    public static void main(String[] args) {
       int number = 1;
       while(true) {
          ++number;
          if ((number % 3) == 0) continue;
          if (number == 133) break;
          if ((number % 2) == 0) {
             number += 3;
          } else {
             number -= 3;
          }
          System.out.print(number + " ");
       }
    }
 }