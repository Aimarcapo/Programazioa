package model;
import java.util.ArrayList;

public class Langilea {

    private String izena;
    private String abizena;
    private String emaila;
    private double soldata;

    /**
     * Konstruktore honek Langilea objetu bat sortuko du jasotako parametroak
     * kontuan izanda.
     */
    public Langilea(String izena, String abizena, String emaila, double soldata) {
        this.izena = izena;
        this.abizena = abizena;
        this.emaila = emaila;
        this.soldata = soldata;
    }

    /**
     * Konstruktore honek automatikoki kalkulatuko du emaila patroi hau jarraituz:
     * abizena.izena@bertsozale.eus
     * email guztiak minuskulaz.
     * Lehenetsitako soldata esleituko zaio gainera langileari; 1200 euroko soldata.
     * 
     * @param izena
     * @param abizena
     */
    public Langilea(String izena, String abizena) {
        this.izena = izena;
        this.abizena = abizena;
        this.emaila = this.abizena.toLowerCase() + "." + this.izena.toLowerCase() + "@bertsozale.eus";
        if(this.soldata==0){
            this.soldata=1200;
        }
        else{
            this.soldata=soldata;
        }
        // OSATU METODO HAU

    }

    public String getIzena() {
        return izena;
    }

    public String getAbizena() {
        return abizena;
    }

    public String getEmaila() {
        return emaila;
    }

    public double getSoldata() {
        return soldata;
    }

    public void setEmaila(String emaila) {
        this.emaila = emaila;
    }

    /**
     * Langilearen soldata aldatzeko erabiliko da metodo hau.
     * Atributoa aldatzeaz gain, soltata berria bueltatuko du metodoak.
     * 
     * @return soldataBerria
     */
    public double soldataIgo(int portzentaia) {
        double soldataBerria;

        soldataBerria = soldata + ( soldata * portzentaia / 100);

        this.soldata = soldataBerria;

        return soldataBerria;
    }
    public void setSoldata(double soldata){
        this.soldata=soldata;
    }

    /**
     * Langilearen datuak String formatuan itzultzen ditu;
     * zehazki, klasearen izenaren ostean eta kortxete artean atributo guztien
     * balioak komaz bananduta.
     * 
     */
    @Override
    public String toString() {
        // OSATU METODO HAU
        return "Langilea [" + izena + "," + abizena + "," + emaila + "," + soldata + "]";
    }

    /**
     * EZ IKUTU METODO HAU
     * Metodo honi langileen zerrenda bat behar duenak deituko dio. *
     * 
     * @return Hiru langileren datuak dauzkan arraylista bueltatzen du.
     */
    public static ArrayList<Langilea> getLangileenZerrenda() {
        ArrayList<Langilea> langileak = new ArrayList<>();
        langileak.add(new Langilea("Alaia", "Martin"));
        langileak.add(new Langilea("Nerea", "Ibarzabal"));
        langileak.add(new Langilea("Maialen", "Lujanbio", "lujanbio.maialen@bertsozale.eus", 2000));

        return langileak;
    }

    /**
     * Itxura honetako taula bat inprimatuko du:
     *
     * Langileen Zerrenda (LangileKopurua)
     * ==========================================
     * Lehen langilearen datuak
     * Bigarren langilearen datuak
     * Hirugarren langilearen datuak
     * ...
     * 
     * @param Inprimatu nahi den zerrenda
     */
    public static void langileakInprimatu(ArrayList<Langilea> laninprimatu) {
        System.out.println("Langileen Zerrenda (" + laninprimatu.size() + ")");
        System.out.println("==========================================");
        for(int z = 0; z < laninprimatu.size(); z++ ){

            System.out.println(laninprimatu.get(z));

        }
    }

    /**
     * Metodo honek uneko objektuaren emaila egokia den, hau da, zerrendan
     * existitzen den egiaztatzen du.
     * 
     * @param lk Egiaztatu beharreko zerrenda
     * @return Zerrendan email helbide hori dagoeneko baldin badaukagu, false
     *         bueltatzen du
     */

     public boolean emailEgokia(ArrayList<Langilea> lanInprimatu) {

        boolean badago = true;
       
        for(int z = 0; z < lanInprimatu.size(); z++ ){

           if(this.emaila ==  lanInprimatu.get(z).getEmaila()){

            badago = false;

           }

        }
        return badago;
    }

    /**
     * Langile honen email originalari zenbakitxo bat gehitzen dio @ ikurraren
     * aurretik.
     * Adibidez:
     * perez.juan@uni.eus => perez.juan2@uni.eus
     * 
     */
    public void emailaDoitu() {
        // OSATU METODO HAU
    }
}
