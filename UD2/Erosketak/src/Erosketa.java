import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Erosketa {
    protected char[] kodea;
    protected LocalDate data;
    protected Bezeroa bezeroa;
    protected ArrayList<Produktua> produktuak;
    protected ArrayList<Integer> unitateak;
    protected double guztira;

    public Erosketa() {
    }

    public Erosketa(String kodea, Bezeroa bezeroa, double guztira) {
        for (int i = 0; i < kodea.length(); i++) {
            this.kodea[i] = kodea.charAt(i);
        }

        this.bezeroa = bezeroa;
        this.guztira = guztira;
    }

    public Erosketa(String kodea, String data, Bezeroa eroslea, ArrayList<Produktua> produktuak,
            ArrayList<Integer> unitateak, double guztira) {
        for (int i = 0; i < kodea.length(); i++) {
            this.kodea[i] = kodea.charAt(i);
        }

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yy"); // definir elformato de la fecha
        this.data = LocalDate.parse(data, dateTimeFormatter); // 01-15-2022 (data sin formato) --> 01/15/22 (data con
                                                              // formato)
        this.produktuak = produktuak;
        this.unitateak = unitateak;
        this.guztira = guztira;

    }

    @Override
    public String toString() {
        return "Erosketa [kodea=" + Arrays.toString(kodea) + ", data=" + data + ", bezeroa=" + bezeroa + ", produktuak="
                + produktuak + ", unitateak=" + unitateak + ", guztira=" + guztira + "]";
    }
    public String toStringLuzatuta(){

        String cadena = "Erosketa [kodea=" + Arrays.toString(kodea) + ", data=" + data + ", bezeroa=" + bezeroa + ", produktuak=[";

        for (int i = 0; i < produktuak.size(); i++) {
            cadena += produktuak.get(i).toString()+", ";
        }

        cadena += "], unitateak=[";

        for (int i = 0; i < unitateak.size(); i++) {
            cadena += unitateak.get(i)+", ";
        }

        cadena += "], guztira=" + guztira + "]";

        return cadena;
    }

    public boolean guztiraEgiaztatu() {
        boolean egiaztatu = false;
        double sum = 0;

        for (int i = 0; i < produktuak.size(); i++) {
            sum += produktuak.get(i).getPrezioa();
        }
        if (sum == guztira) {
            egiaztatu = true;
        }

        return egiaztatu;
    }

}