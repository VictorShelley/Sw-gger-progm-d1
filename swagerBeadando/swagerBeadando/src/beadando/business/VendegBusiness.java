package beadando.business;

import beadando.business.os.TagBusiness;
import beadando.fio.Fio;
import java.time.LocalDate;
import static java.time.LocalDate.now;

public class VendegBusiness extends TagBusiness{
    
    private final String megnevezese = "Vendég";
    private final Integer alapNapijegy = 750;
    
    @GetterFunctionName(name="getBerletTipus")
    private BerletTipusEnum berletTipus;// = BerletTipusEnum.LEJART;
    
    @GetterFunctionName(name="getKedvezmenyTipus")
    private KedvezmenyTipusEnum kedvezmenyTipus;
    
    @GetterFunctionName(name="getErvenyessegDatum")
    private LocalDate ervenyessegDatum;// = LocalDate.now().minusDays(1);
    
    @GetterFunctionName(name="getEgyenleg")
    private Integer egyenleg;
    
    public VendegBusiness(String nev, String telefonszam, String cim, LocalDate csatlakozasDatuma) {
        super(nev, telefonszam, cim, csatlakozasDatuma);
        this.berletTipus = BerletTipusEnum.LEJART;
        this.ervenyessegDatum = LocalDate.now().minusDays(1);
        this.kedvezmenyTipus = KedvezmenyTipusEnum.TELJES;
        this.egyenleg = 0;
    }
    
    public BerletTipusEnum getBerletTipus() {
        return berletTipus;
    }

    public LocalDate getErvenyessegDatum() {
        return ervenyessegDatum;
    }

    public void BerletVasarlas(BerletTipusEnum berletTipus){
        this.berletTipus = berletTipus;
        this.ervenyessegDatum = berletTipus.getErvenyessegDatum();
    }

    public KedvezmenyTipusEnum getKedvezmenyTipus() {
        return kedvezmenyTipus;
    }

    public Integer getEgyenleg() {
        return egyenleg;
    }
    
    public void egyenlegNoveles(Integer osszeg) {
        this.egyenleg += osszeg;
    }

    public String getMegnevezese() {
        return megnevezese;
    }

    public Integer getAlapNapijegy() {
        return alapNapijegy;
    }

    public void setKedvezmenyTipus(KedvezmenyTipusEnum kedvezmenyTipus) {
        this.kedvezmenyTipus = kedvezmenyTipus;
    }
    
    @Override
    public Boolean getErvenyesseg() {
        LocalDate now = LocalDate.now();
        if(this.getErvenyessegDatum().isBefore(now)){
            this.setErvenyesseg(false);
            return false;
        }
        else{
            this.setErvenyesseg(true);
            return true;
        }
    }

    public void mentes(){
        Fio<VendegBusiness> f = new Fio<VendegBusiness>();
        f.mentes(this);
    }
    
}
