import java.util.Scanner;

public class Datak {
    public static void main(String[] args) {
        int urtea, hilabetea, eguna;
        char baieztatu;
        Scanner in = new Scanner(System.in);
    
        do{
        
       
        System.out.println("Urtea: ");
        urtea = in.nextInt();
        System.out.println("Hilabetea: ");
        hilabetea = in.nextInt();
        System.out.println("Eguna: ");
        eguna = in.nextInt();
    
        System.out.println("Data laburra:" + dataLaburra(urtea, hilabetea, eguna));
        System.out.println("Data luzea:" + dataLuzea(urtea, hilabetea, eguna));
        System.out.println("Beste data bat sartu nahi duzu(B/E)?");
        baieztatu=in.next().charAt(0);
        
        }while(baieztatu!='E');
        in.close();
    }
    

    public static String dataLaburra(int urtea, int hilabetea, int eguna) {
        return (urtea + "-" + hilabetea + "-" + eguna);

    }

public static String dataLuzea(int urtea, int hilabetea, int eguna){
   
    
    switch(hilabetea){
        case 1: 
              return( urtea+"ko "+"Urtarrilaren "+eguna+"a" ); 
              case 2: 
             return( urtea+"ko "+"Otsailaren "+eguna+"a"  );
              case 3: 
              return( urtea+"ko "+"Martxoaren"+eguna+"a"  ); 
              case 4: 
              return( urtea+"ko "+"Apirilaren " +eguna+"a" );  
              case 5:  
              return( urtea+"ko "+"Maiatzaren "+eguna+"a"  ); 
              case 6: 
              return( urtea+"ko "+"Ekainaren "+eguna+"a"  ); 
              case 7: 
             return( urtea+"ko "+"Uztailaren " +eguna+"a" );
              case 8: 
              return( urtea+"ko "+"Abuztuaren " +eguna+"a" );
              case 9: 
              return ( urtea+"ko "+"Irailaren "  +eguna+"a" );
              case 10: 
              return( urtea+"ko "+"Urriaren " +eguna+"a" );
              case 11: 
              return( urtea+"ko "+"Azaroaren "+eguna+"a"  );
              case 12: 
              return( urtea+"ko "+"Abenduaren "+eguna+"a"  );
              default:
                return null;
    }
  

}
}