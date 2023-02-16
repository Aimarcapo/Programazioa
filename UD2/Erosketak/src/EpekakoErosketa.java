
import java.util.ArrayList;

public class EpekakoErosketa extends Erosketa {
    private int epeak;
    private boolean ordainketakBukatua = false;
    private double kuota;
    private boolean egiaztatu = true;

    // KONSTRUKTOREAK
    public EpekakoErosketa(String kodea, String data, Bezeroa bezeroa, ArrayList<Produktua> produktuak,
            ArrayList<Integer> unitateak, double guztira, int epeak, boolean ordainketakBukatua, double kuota) {
        super(kodea, data, bezeroa, produktuak, unitateak, guztira);
        this.epeak = epeak;
        this.ordainketakBukatua = ordainketakBukatua;
        this.kuota = kuota;
    }

    public EpekakoErosketa(String kodea, Bezeroa bezeroa, double guztira, int epeak, boolean ordainketakBukatua,
            double kuota) {
        super(kodea, bezeroa, guztira);
        this.epeak = epeak;
        this.ordainketakBukatua = ordainketakBukatua;
        this.kuota = kuota;
    }

    public EpekakoErosketa(String kodea, String data, Bezeroa pertsona,
            ArrayList<Produktua> produktuak, ArrayList<Integer> unitateak, double guztira,
            double kuota,int epeak) {
        super(kodea, data, pertsona, produktuak, unitateak, guztira);
        this.kuota = kuota;
        this.epeak = epeak;
        this.egiaztatu = egiaztatu;
    }

    // BESTELAKO METODOAK
    public double gainetikOrdainduBeharrekoa() {
        return (kuota * epeak);
    }

    public double getOrdainduBeharrekoa() {
        return  (gainetikOrdainduBeharrekoa()) - guztira ;
    }

    public int getEpeak() {
        return epeak;
    }

    public boolean getEgiaztatu() {
        return egiaztatu;
    }

    public void setEpeak(int epeak) {
        this.epeak = epeak;
    }

    public boolean isOrdainketakBukatua() {
        return ordainketakBukatua;
    }

    public void setOrdainketakBukatua(boolean ordainketakBukatua) {
        this.ordainketakBukatua = ordainketakBukatua;
    }

    public double getKuota() {
        return kuota;
    }

    public void setKuota(double kuota) {
        this.kuota = kuota;
    }

    // TOSTRING
    @Override
    public String toString() {
        return "EpekakoErosketa [kodea= " + this.getKodea() + ", epeak=" + epeak + ", data=" + this.getData()
                + ", ordainketakBukatua=" + ordainketakBukatua + ", kuota=" + kuota
                + "]";
    }

    @Override
    public String toStringLuzea() {
        String emaitza = "";
        String ordaindua;
        if (this.isOrdainketakBukatua()) {
            ordaindua = "Bai";
        } else {
            ordaindua = "Ez";
        }
        emaitza += String.format("%-15s %-15s %-15f %-15d %-15s %-15s\n", this.getData(), this.getBezeroa().getIzena(),
                this.getGuztira(), this.getEpeak(), this.getKuota(), ordaindua);
        return emaitza;
    }

   
    public String toStringLuzea2() {
        String emaitza = "";
        String ordaindua;
        boolean epeka = true;
        if (this.isOrdainketakBukatua()) {
            ordaindua = "Bai";
        } else {
            ordaindua = "Ez";
        }
        emaitza += String.format("%-10s %-15s %-10s %-10s %-10s %-10s %-10s %-10s %-1s\n", this.getKodea(), this.getData(),
                this.getBezeroa().getKodea(), this.getGuztira(), this.getEgiaztatu(), this.getKuota(), this.getEpeak(),
                this.gainetikOrdainduBeharrekoa(),this.getOrdainduBeharrekoa());

        return emaitza;
    }

}
