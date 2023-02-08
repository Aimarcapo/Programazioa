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
    

}
