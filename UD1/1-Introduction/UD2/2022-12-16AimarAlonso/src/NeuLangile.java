/** Programa honek zure izen abizenak daramatzan erabiltzailea sortuko du, lehenetsitako email eta soldatarekin.
 * Langilearen datuak kontsolatik bistaratu ondoren.
 * Soldata igo eta berriz inprimatuko du langilearen informazioa.
 */


import java.util.ArrayList;
public class NeuLangile {
    private static ArrayList<Langilea>langilea;
    
    public static void main(String[] args) throws Exception {
        langilea=Langilea.getLangileenZerrenda();
        //OSATU METODO HAU
        System.out.println("Nire langile datuak igoera aurretik");
        System.out.println(langilea.get(1));
        System.out.println("Nire langile datuak igoeraren ostean");
      System.out.println(langilea.get(1).soldataIgo(50)); 
       
        
        
    }
}
