import java.util.Arrays;

public class Enpresa extends Bezeroa {
    
    private String izenJuridikoa;
    private int izenKomertziala;
    private String[] kontaktoen_emailak;

    public String getIzena() {
        return izenJuridikoa;
    }
    public int getIzenKomertziala() {
        return izenKomertziala;
    }
   

    public String getEmaila(){
        return kontaktoen_emailak[0];
    }
  
    public Enpresa(int kodea,int izenKomertziala,String izenJuridikoa,String helbidea, String[] kontaktoen_emailak){
        super.setKodea(kodea);
        this.izenKomertziala=izenKomertziala;
        this.izenJuridikoa=izenJuridikoa;
        this.kontaktoen_emailak = kontaktoen_emailak;
        this.helbidea=helbidea;
    }
   
    public Enpresa(int kodea, String string, String izenJuridikoa2, String helbidea, String[] kontaktoenEmailak) {
    }
    @Override
    public String toString() {
        return "Enpresa [kodea=" + izenKomertziala + ", izenJuridikoa=" + izenJuridikoa
                + ", kontaktoen_emailak=" + Arrays.toString(kontaktoen_emailak) + "]";
    }
    

}
