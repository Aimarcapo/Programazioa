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
    public String[] getKontaktoen_emailak() {
        return kontaktoen_emailak;
    }

    public String getEmaila(){
        return getKontaktoen_emailak()[0];
    }
    public Enpresa(int kodea, String helbidea, String izenJuridikoa, String izenKomertziala,
            String[] kontaktoen_emailak) {
        super(kodea, helbidea);
        this.izenJuridikoa = izenJuridikoa;
        this.izenKomertziala = izenKomertziala;
        this.kontaktoen_emailak = kontaktoen_emailak;
    }
    @Override
    public String toString() {
        return "Enpresa [izenJuridikoa=" + izenJuridikoa + ", izenKomertziala=" + izenKomertziala
                + ", kontaktoen_emailak=" + Arrays.toString(kontaktoen_emailak) + "]";
    }
    

}
