public class Pertsona extends Bezeroa {
    private String izena;
    private String abizena;
    private String emaila;
   

    public String getIzena() {
        return izena;
    }

    public String getEmaila() {
        return emaila;
    }

    public String getAbizena() {
        return abizena;
    }

   

   

    public Pertsona(String izena, String abizena, String emaila) {
        this.izena = izena;
        this.abizena = abizena;
        this.emaila = emaila;
    }

    public Pertsona(int kodea, String helbidea, String izena, String abizena, String emaila) {
        super(kodea, helbidea);
        this.izena = izena;
        this.abizena = abizena;
        this.emaila = emaila;
    }

    @Override
    public String toString() {
        return super.toString()+"Pertsona [izena=" + izena + ", abizena=" + abizena + ", emaila=" + emaila + "]";
    }
    
}
