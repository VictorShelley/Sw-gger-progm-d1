package beadando.layout;

import beadando.business.BerletTipusEnum;
import java.time.LocalDate;

public class VendegLayout extends TagLayout{
    private BerletTipusEnum berletTipus;
    private LocalDate berletErvenyes; //lejárat dátuma
    private Boolean isBerletErvenyes;//dátumos kiírás miatt hanyagoljuk?
    //esetleg használjunk egy képet, amivel azonosítani lehet a vendéget?
    public VendegLayout(Integer id){
        super(id);
    }

    public BerletTipusEnum getBerletTipus() {
        return berletTipus;
    }

    public void setBerletTipus(BerletTipusEnum berletTipus) {
        this.berletTipus = berletTipus;
    }

    public LocalDate getBerletErvenyes() {
        return berletErvenyes;
    }

    public void setBerletErvenyes(LocalDate berletErvenyes) {
        this.berletErvenyes = berletErvenyes;
    }

    public Boolean getIsBerletErvenyes() {
        return isBerletErvenyes;
    }

    public void setIsBerletErvenyes(Boolean isBerletErvenyes) {
        this.isBerletErvenyes = isBerletErvenyes;
    }
    
}
