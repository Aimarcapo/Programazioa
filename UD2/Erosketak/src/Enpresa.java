import java.util.Arrays;

public class Enpresa extends Bezeroa {
    
    private String izenJuridikoa;
    private String izenKomertziala;
    private String[] kontaktoen_emailak;

    public String getIzena() {
        return izenJuridikoa;
    }
    public String getIzenKomertziala() {
        return izenKomertziala;
    }
   

    public String getEmaila(){
        return kontaktoen_emailak[0];
    }
  
    public Enpresa(int kodea,String izenKomertziala,String izenJuridikoa,String helbidea, String[] kontaktoen_emailak){
        super.setKodea(kodea);
        this.izenKomertziala=izenKomertziala;
        this.izenJuridikoa=izenJuridikoa;
        this.kontaktoen_emailak = kontaktoen_emailak;
        this.helbidea=helbidea;
    }
   
    
    @Override
    public String toString() {
        return "Enpresa [izenJuridikoa=" + izenJuridikoa + ", izenKomertziala=" + izenKomertziala
                + ", kontaktoen_emailak=" + Arrays.toString(kontaktoen_emailak) + "]";
    }
    
    

}
