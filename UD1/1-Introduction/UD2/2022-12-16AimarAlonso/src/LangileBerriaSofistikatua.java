
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;


public class LangileBerriaSofistikatua {

    private static ArrayList<Langilea> langileak;
    public static void main(String[] args) {

        int posizioa;
        Scanner in = new Scanner(System.in);

        langileak = Langilea.getLangileenZerrenda();

        Langilea.langileakInprimatu(langileak);

        langileak.add(datuakEskatu());


        posizioa =  langileak.size() - 1;

        for(int x = 0; x < langileak.size(); x++){

            if( langileak.get(posizioa).getEmaila()  == langileak.get(x).getEmaila()){

           

                langileak.get(posizioa).emailaDoitu();

            }

        }

        Langilea.langileakInprimatu(langileak);


        in.close();
        
    }

    /** Metodo honek langile berri baten datuak eskatzen dizkio erabiltzaileari.
     * Ez badu soldata zenbakitan, behar bezala sartzen, 1200eko soldata asignatuko zaio.
     * 
     * @return Langile berria
     */
    public static Langilea datuakEskatu() {

        Scanner in = new Scanner(System.in);
        String izena, abizena, email;
        double soldata;
        Langilea berria;

        System.out.println("LANGILE BERRIA");
        System.out.print("Izena \n");
        izena = in.next();
        System.out.print("Abizena \n");
        abizena = in.next();
        System.out.print("Emaila \n");
        email = in.next();
       
        try {
            System.out.print("Soldata \n");
            soldata = in.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Zenbaki ez egoki bat sartu duzu, beraz, lehenetsia esleituko diogu.");
            soldata = 1200.00;

        } 
        catch(Exception ex){
            System.out.println("Fallo bat egon da soldata idazterakoan beraz defektuzko soldata jarriko da");
            soldata=1200;
        }

        berria = new Langilea(izena, abizena, email, soldata);

        return berria;
    }

}