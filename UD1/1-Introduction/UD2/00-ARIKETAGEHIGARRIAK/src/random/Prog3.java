package random;

import java.util.Scanner;

public class Prog3 {
    public static void main(String[] args) throws InterruptedException {
        
        String bota;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bota nahi duzu?");
        bota = sc.next();
        sc.close();
        int rand = (int) (Math.random() * 6);
        int total=0;
        total=total+rand;
      
        if (bota.charAt(0) == 'b') {
             
             rand = (int) (Math.random() * 6);
            for (int i = 0; i < 5; i++) {
                Thread.sleep(500);
                System.out.printf(".");
            }
        
   
            switch (rand) {
                case 1:
                    System.out.printf(rand + " Eres una mierda");
                    break;
                case 2:
                    System.out.printf(rand + " Sigues dando verguenza pero no tanto");
                    break;
                case 3:
                    System.out.printf( rand + " Aprobado");
                    break;
                case 4:
                    System.out.printf( rand + " Buena tula");
                    break;
                case 5:
                    System.out.printf(rand + " Te como la polla");
                    break;
                case 6:
                    System.out.printf( rand + " Fino");
                    break;
            }
        } else if (bota.charAt(0) == 'e') {
            System.out.printf("Balioa" + total);
        }
    
    }
}

