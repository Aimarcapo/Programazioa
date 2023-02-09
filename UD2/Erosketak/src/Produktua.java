import java.util.Arrays;

public class Produktua {
    private char[] kodea;
    private String izena;
    private double prezioa;

    public Produktua(String kodea, String izena, double prezioa) {
        for (int i = 0; i < kodea.length(); i++) {
            this.kodea[i] = kodea.charAt(i);
        }
        this.izena = izena;
        this.prezioa = prezioa;
    }

    public char[] getKodea() {
        return kodea;
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
        return "Produktua [kodea=" + Arrays.toString(kodea) + ", izena=" + izena + ", prezioa=" + prezioa + "]";
    }

}
