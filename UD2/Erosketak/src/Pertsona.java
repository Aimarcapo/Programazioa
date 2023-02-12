public class Pertsona extends Bezeroa {
    private String izena;
    private String abizena;
    private String emaila;
   
    

   
    public Pertsona(int kodea, String izena, String abizena, String helbidea, String emaila) {
        super(kodea, helbidea);
        this.izena = izena;
        this.abizena = abizena;
        this.emaila = emaila;
    }

    @Override
    public String toString() {
        return "Pertsona [kodea="+this.getKodea() +  ", izena=" + izena + ", abizena=" + abizena + ",helbidea="+getHelbidea() +", emaila=" + emaila + "]";
    }

    @Override
    public String getIzena() {
        return izena + " " + abizena;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    public String getAbizena() {
        return abizena;
    }

    public void setAbizena(String abizena) {
        this.abizena = abizena;
    }

    public String getEmaila() {
        return emaila;
    }

    public void setEmaila(String emaila) {
        this.emaila = emaila;
    }   
    
}
