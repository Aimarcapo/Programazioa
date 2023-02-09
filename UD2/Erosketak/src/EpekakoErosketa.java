import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class EpekakoErosketa extends Erosketa {
    private int epeak = 12;
    private boolean ordainketaBukatua = false;
    private double kuota;

    public EpekakoErosketa(String kodea, String data, Bezeroa eroslea, ArrayList<Produktua> produktuak,
            ArrayList<Integer> unitateak, double guztira, int epeak, boolean ordainketaBukatua, double kuota) {
        super(kodea, data, eroslea, produktuak, unitateak, guztira);
        this.epeak = epeak;
        this.ordainketaBukatua = ordainketaBukatua;
        this.kuota = kuota;
    }

    public EpekakoErosketa(String kodea, Bezeroa bezeroa, double guztira, int epeak, boolean ordainketaBukatua,
            double kuota) {
        super(kodea, bezeroa, guztira);
        this.epeak = epeak;
        this.ordainketaBukatua = ordainketaBukatua;
        this.kuota = kuota;
    }

    public double gainetikOrdainduBeharrekoa() {
        return kuota * epeak-guztira;
    }

    public int getEpeak() {
        return epeak;
    }

    public void setEpeak(int epeak) {
        this.epeak = epeak;
    }

    public boolean isOrdainketaBukatua() {
        return ordainketaBukatua;
    }

    public void setOrdainketaBukatua(boolean ordainketaBukatua) {
        this.ordainketaBukatua = ordainketaBukatua;
    }

    public double getKuota() {
        return kuota;
    }

    public void setKuota(double kuota) {
        this.kuota = kuota;
    }

    @Override
    public String toString() {
        return "EpekakoErosketa [epeak=" + epeak + ", ordainketaBukatua=" + ordainketaBukatua + ", kuota=" + kuota
                + "]";
    }

    public EpekakoErosketa(String kodea, String data, Bezeroa eroslea, ArrayList<Produktua> produktuak,
            ArrayList<Integer> unitateak, double guztira, double kuota) {
        for (int i = 0; i < kodea.length(); i++) {
            this.kodea[i] = kodea.charAt(i);
        }
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yy"); // definir elformato de la fecha
        this.data = LocalDate.parse(data, dateTimeFormatter);
        this.bezeroa = eroslea;
        this.guztira = guztira;
        this.kuota = kuota;
        this.produktuak = produktuak;
        this.unitateak = unitateak;
    }
}
