import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Erosketa {
    protected char[] kodea;
    protected LocalDate data=LocalDate.now();
    protected Bezeroa bezeroa;
    protected ArrayList<Produktua> produktuak;
    protected ArrayList<Integer> unitateak;
    protected double guztira;

    public Erosketa(String kodea, Bezeroa bezeroa, double guztira) {
        this.kodea = kodea.toCharArray();
        this.data=data;
        this.bezeroa = bezeroa;
        this.guztira = guztira;
    }
    public Erosketa(String kodea,String data, Bezeroa bezeroa, double guztira) {
        this.kodea = kodea.toCharArray();
        this.data = LocalDate.parse(data);
        this.bezeroa = bezeroa;
        this.guztira = guztira;
    }

    public Erosketa(String kodea, String data, Bezeroa bezeroa, ArrayList<Produktua> produktuak,
            ArrayList<Integer> unitateak, double guztira) {
        this.kodea = kodea.toCharArray();
        this.data = LocalDate.parse(data);
        this.bezeroa = bezeroa;
        this.produktuak = produktuak;
        this.unitateak = unitateak;
        this.guztira = guztira;
    }
    

   

    

   
    public String toString() {
        return "Erosketa [kodea=" + this.getKodea() + ", data=" + data + ", bezeroa=" + bezeroa + ", produktuak="
                + produktuak + ", unitateak=" + unitateak + ", guztira=" + guztira + "]";
    }

    public String toStringLuzatuta() {

        String cadena = "Erosketa [kodea=" + Arrays.toString(kodea) + ", data=" + data + ", bezeroa=" + bezeroa
                + ", produktuak=[";

        for (int i = 0; i < produktuak.size(); i++) {
            cadena += produktuak.get(i).toString() + ", ";
        }

        cadena += "], unitateak=[";

        for (int i = 0; i < unitateak.size(); i++) {
            cadena += unitateak.get(i) + ", ";
        }

        cadena += "], guztira=" + guztira + "]";

        return cadena;
    }
    public String toStringLuzea(){
        String emaitza = "";
        emaitza += "EROSKETA";
        emaitza += "\nKodea: " + this.getKodea() + "\tData: " + data;
        emaitza += "\nBezeroa: " + bezeroa.getKodea();
        emaitza += "\nIzena: " + bezeroa.getIzena();
        emaitza += "\nHelbidea: " + bezeroa.getHelbidea();
        emaitza += "\neMail: " + bezeroa.getEmaila();
        emaitza += "\n";
        emaitza += String.format("%-25s %-25s %-25s %-25s %-25s\n", "Kodea", "Produktua", "Unitateak", "Prezioa", "Zenbatekoa");
        emaitza += "-----------------------------------------------------------------------------------------------------------------------------------------\n";
        for (int i = 0; i < produktuak.size(); i++) {
            emaitza += String.format("%-25s %-25s %-25s %-25s %-25s\n", produktuak.get(i).getKodea(), produktuak.get(i).getIzena(), unitateak.get(i), produktuak.get(i).getPrezioa(), (unitateak.get(i) * produktuak.get(i).getPrezioa()));
        }
        /*double guztira = 0;
        for (int i = 0; i < produktuak.size(); i++) {
            guztira += unitateak.get(i) * produktuak.get(i).getPrezioa();
        }*/
        emaitza += "\t\tGUZTIRA: " + guztira;
        
        return emaitza;
    }
    
    public String getKodea() {
        String kodeaStr = "";
        for (int i = 0; i < kodea.length; i++) {
            char momChar = this.kodea[i];
            kodeaStr += momChar;
        }
        return kodeaStr;
    }

    public void setKodea(char[] kodea) {
        this.kodea = kodea;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Bezeroa getBezeroa() {
        return bezeroa;
    }

    public void setBezeroa(Bezeroa bezeroa) {
        this.bezeroa = bezeroa;
    }

    public ArrayList<Produktua> getProduktuak() {
        return produktuak;
    }

    public void setProduktuak(ArrayList<Produktua> produktuak) {
        this.produktuak = produktuak;
    }

    public ArrayList<Integer> getUnitateak() {
        return unitateak;
    }

    public void setUnitateak(ArrayList<Integer> unitateak) {
        this.unitateak = unitateak;
    }

    public double getGuztira() {
        return guztira;
    }

    public void setGuztira(double guztira) {
        this.guztira = guztira;
    }

    public boolean guztiraEgiaztatu() {
        boolean egiaztatu = false;
        double sum = 0;

        for (int i = 0; i < produktuak.size(); i++) {
            sum += unitateak.get(i) *produktuak.get(i).getPrezioa();
        }
        if (sum == guztira) {
            egiaztatu = true;
        }

        return egiaztatu;
    }

}