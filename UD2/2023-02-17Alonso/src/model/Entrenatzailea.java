package model;

public class Entrenatzailea extends Kidea {
    private String idFederazioa;

    public Entrenatzailea(int id, String izena, String abizena, String jaiotzeData, String idFederazioa) {
        super(id, izena, abizena, jaiotzeData);
        this.idFederazioa = idFederazioa;
    }

    public String getIdFederazioa() {
        return idFederazioa;
    }

    public void setIdFederazioa(String idFederazioa) {
        this.idFederazioa = idFederazioa;
    }

    public void entrenatu() {
        System.out.println("Entrenamendua zuzentzen nabil");
    }

    @Override
    public String toString() {
        return "Entrenatzailea =>"+this.getId() +", " +this.getIzena()+" "+this.getAbizena()+", "+this.getUrtea()+","+this.getIdFederazioa();
    }

}
