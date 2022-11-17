import java.util.Scanner;

public class Menua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int zenbakia; //Guardaremos la opcion del usuario
       String beteta;
        int[] laukia = new int[2];
        laukia[0]=2;
        laukia[1]=4;
        int zabalera=laukia[0];
        int altuera=laukia[1];
        Laukia l1 = new Laukia(zabalera, altuera);
        while(!salir){
       
        
        System.out.printf("LAUKIA");
        System.out.println("===================================\n");
        
        System.out.println("1-Lauki berria sortu");
        System.out.println("2-Laukien taula ikusi");
        System.out.println("3-Lauki bat marraztu");
        System.out.println("4-Lauki handiena bilatu");
        System.out.println("5-Irten");
        
 
            System.out.println("Aukeratu zenbaki bat");
            zenbakia = sc.nextInt();

       
       switch(zenbakia){
        case 1:
        
        
        System.out.println("Lauki berria sortzen");
        System.out.println("Sartu laukiaren zabalera:"+zabalera);
        System.out.println("Sartu laukiaren altuera:"+altuera);
    
        

        break;
    case 2:
   
        System.out.println("Has seleccionado la opcion 2");
        System.out.printf("%10s %10s %12s %10s %10s  %15s\n", "Laukia","Zabalera", "Altuera", "Azalera", "Perimetroa", "Mota");
        System.out.println("==============================================================================\n");
        System.out.printf("%5d %12d %10d %10d %10d %18s\n",1,zabalera,altuera,
                    l1.getAzalera(), l1.getPerimetroa() , l1.getMota());
           
            
           
                    
        
        break;
    case 3:
    
        System.out.println("Zenbatgarren laukia nahi duzu marraztu?");
        System.out.printf("Beteta ala hutsik");
        beteta=sc.next();
        if(beteta==B){
            l1.marraztuBeteta();
        }
        else if(beteta==H){
            l1.marraztuHutsik();
        }
        else{
        System.out.println("Idatzi H edo B");
        }
        break;
    case 4:
    System.out.println("Has seleccionado la opcion 4");
    break;
        case 5:
        salir = true;
        break;
    default:
        System.out.println("Solo números entre 1 y 5");


       }
    }
}
    }

