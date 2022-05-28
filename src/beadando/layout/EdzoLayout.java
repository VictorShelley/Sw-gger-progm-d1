package beadando.layout;

import beadando.business.BerletTipusEnum;
import java.time.LocalDate;
import java.util.ArrayList;

public class EdzoLayout extends TagLayout{
    private ArrayList<VendegLayout> kliensek;
    private Integer telefonszam;
    //mik legyenek még kiírva?
    
    public EdzoLayout(Integer id){
        super(id);
    }

    public ArrayList<VendegLayout> getKliensek() {
        return kliensek;
    }

    public void setKliensek(ArrayList<VendegLayout> kliensek) {
        this.kliensek = kliensek;
    }
    
    public void addKliens(VendegLayout v){
        kliensek.add(v);
    }

    public Integer getTelefonszam() {
        return telefonszam;
    }

    public void setTelefonszam(Integer telefonszam) {
        this.telefonszam = telefonszam;
    }
    
}
