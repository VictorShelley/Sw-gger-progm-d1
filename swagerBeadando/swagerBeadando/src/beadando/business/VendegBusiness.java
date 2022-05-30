package beadando.business;

import beadando.business.os.TagBusiness;
import beadando.fio.Fio;
import java.time.LocalDate;

public class VendegBusiness extends TagBusiness{
    
    @GetterFunctionName(name="getBerletTipus")
    private BerletTipusEnum berletTipus;// = BerletTipusEnum.LEJART;
    
    @GetterFunctionName(name="getKedvezmenyTipus")
    private KedvezmenyTipusEnum kedvezmenyTipus;
    
    @GetterFunctionName(name="getErvenyessegDatum")
    private LocalDate ervenyessegDatum;// = LocalDate.now().minusDays(1);
    
    @GetterFunctionName(name="getEgyenleg")
    private Integer egyenleg;
    
    public VendegBusiness(Integer Id, String nev, Integer telefonszam, String cim, LocalDate csatlakozasDatuma) {
        super(Id, nev, telefonszam, cim, csatlakozasDatuma);
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

    public void mentes(){
        Fio<VendegBusiness> f = new Fio<VendegBusiness>();
        f.mentes(this);
    }
    
}
