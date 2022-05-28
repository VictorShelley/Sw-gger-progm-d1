package beadando.business;

import beadando.business.os.Tag;
import beadando.fio.Fio;
import java.time.LocalDate;

public class Vendeg extends Tag{
    
    @GetterFunctionName(name="getBerletTipus")
    private BerletTipusEnum berletTipus = BerletTipusEnum.LEJART;
    
    @GetterFunctionName(name="getErvenyessegDatum")
    private LocalDate ervenyessegDatum = LocalDate.now().minusDays(1);
    
    public Vendeg(Integer Id, String nev) {
        super(Id, nev);
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
    
    public void mentes(){
        Fio<Vendeg> f = new Fio<Vendeg>();
        f.mentes(this);
    }
    
}
