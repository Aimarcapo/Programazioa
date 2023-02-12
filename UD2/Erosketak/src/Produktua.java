import java.util.Arrays;

public class Produktua {
    private char[] kodea;
    private String izena;
    private double prezioa;

    public Produktua(String kodea, String izena, double prezioa) {
        this.kodea=kodea.toCharArray();
        this.izena = izena;
        this.prezioa = prezioa;
    }

    public String getKodea() {
        String kodeaS = "";
        for (int i = 0; i < kodea.length; i++) {
            char momChar = this.kodea[i];
            kodeaS += momChar;
        }
        return kodeaS;
    }

    public void setKodea(char[] kodea) {
        this.kodea = kodea;
    }

    public String getIzena() {
        return izena;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    public double getPrezioa() {
        return prezioa;
    }

    public void setPrezioa(double prezioa) {
        this.prezioa = prezioa;
    }

    @Override
    public String toString() {
        return "Produktua [kodea=" + this.getKodea() + ", izena=" + izena + ", prezioa=" + prezioa + "]";
    }

}
