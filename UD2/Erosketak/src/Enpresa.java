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
    public String[] getKontaktoen_emailak() {
        return kontaktoen_emailak;
    }

    public String getEmaila(){
        return kontaktoen_emailak[0];
    }
  
    public Enpresa(int izenKomertziala,String izenJuridikoa, String[]kontaktoen_emailak){
        this.izenKomertziala=izenKomertziala;
        this.izenJuridikoa=izenJuridikoa;
        this.kontaktoen_emailak = kontaktoen_emailak;
    }
    public Enpresa(int bezeroKode, String helbidea, String izenJuridikoa2, String izenKomertziala2,
            String[] kontaktoenEmailak) {
    }
    @Override
    public String toString() {
        return "Enpresa [kodea=" + izenKomertziala + ", izenJuridikoa=" + izenJuridikoa
                + ", kontaktoen_emailak=" + Arrays.toString(kontaktoen_emailak) + "]";
    }
    

}
