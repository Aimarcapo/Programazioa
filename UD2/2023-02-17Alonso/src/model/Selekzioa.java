package model;

import java.util.ArrayList;

public class Selekzioa {
    private ArrayList<Kidea> kideak = new ArrayList<>();
    private Nongoa nongoa;

    public Selekzioa(Nongoa nongoa, ArrayList<Kidea> kideak) {
        this.kideak = kideak;
        this.nongoa = nongoa;
    }

    public String[] getKideenIzenak() {
        String[] izenak = new String[kideak.size()];
        for (int i = 0; i < kideak.size(); i++) {
            izenak[i] = kideak.get(i).getIzena();
        }
        return izenak;

    }

    public void kideakBistaratu() {
        int z;
        int golak;
        Atezaina bai;
        try{
        if (nongoa == Nongoa.eus) {
            System.out.println("SELEKZIOA:EUSKADI");
        } else if (nongoa == Nongoa.uni) {
            System.out.println("SELEKZIOA UNI");
        }
        System.out.println("=============");
        for (int i = 0; i < kideak.size(); i++) {
            if (kideak.get(i) != null) {
                System.out.println(kideak.get(i));
                z = i;
                
            }
            
        }
        System.out.println("Kide kopuru"+kideak.size());
        int suma = 0;
        for(int i=0;i<kideak.size();i++){
            if(kideak.get(i) instanceof Atezaina){                
                Atezaina atezaina =  (Atezaina)kideak.get(i);
                suma += atezaina.getGeratutakoGolak();
            }
        }       

        System.out.println("GOLES: "+ suma);
       

    }
    catch(Exception e){
        System.out.println("Gaizki dago");

    }
}

    

    public int kideBerria(Kidea berria) {
        kideak.add(berria);
        return 0;
    }

    public int kideaEzabatu(int id) {
        for (int i = 0; i < this.kideak.size(); i++) {
           
                if (this.kideak.get(i).getId() == id) {
                    this.kideak.remove(i);
                    return 1;
                }

            
        }
        return 0;
    }
}
