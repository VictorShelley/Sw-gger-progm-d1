package beadando.business;

import beadando.business.os.TagBusiness;
import beadando.fio.Fio;
import java.time.LocalDate;
import java.util.ArrayList;

public class EdzoBusiness extends TagBusiness{

    @GetterFunctionName(name="getKliensek")
    private ArrayList<VendegBusiness> kliensek;
    
    @GetterFunctionName(name="GetlKliensekSzama")
    private Integer kliensekSzama;

    public EdzoBusiness(Integer Id, String nev, Integer telefonszam, String cim, LocalDate csatlakozasDatuma) {
        super(Id, nev, telefonszam, cim, csatlakozasDatuma);
        this.kliensek = new ArrayList<>();
        this.kliensekSzama = 0;
        this.setErvenyesseg(true);
    }
    
    public ArrayList<VendegBusiness> getKliensek(){
        return kliensek;
    }

    public Integer getKliensekSzama() {
        return kliensekSzama;
    }

    public void addKliens(VendegBusiness vendeg){
        kliensek.add(vendeg);
    }
    
    public void mentes(){
        Fio<EdzoBusiness> f = new Fio<EdzoBusiness>();
        f.mentes(this);
    }
}
