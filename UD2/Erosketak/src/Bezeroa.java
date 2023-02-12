public abstract class Bezeroa {
    private int kodea;
    private String helbidea;

    public int getKodea() {
        return kodea;
    }


    public Bezeroa() {
    }


    public Bezeroa(int kodea, String helbidea) {
        this.kodea = kodea;
        this.helbidea = helbidea;
    }


    @Override
    public String toString() {
        return "Bezeroa [kodea=" + kodea + ", helbidea=" + helbidea + "]";
    }


    public String getHelbidea() {
        return helbidea;
    }    

    public void setKodea(int kodea) {
        this.kodea = kodea;
    }


    public void setHelbidea(String helbidea) {
        this.helbidea = helbidea;
    }


    public abstract String getIzena();

    public abstract String getEmaila();
    
}
