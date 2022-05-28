package beadando.business;

import beadando.business.os.TagBusiness;
import beadando.fio.Fio;
import java.util.ArrayList;

public class EdzoBusiness extends TagBusiness{

    @GetterFunctionName(name="getKliensek")
    private ArrayList<VendegBusiness> kliensek; //= new ArrayList<>();

    public EdzoBusiness(Integer Id, String nev) {
        super(Id, nev);
        this.kliensek = new ArrayList<>();
        //this.setErvenyesseg(true);
    }
    public EdzoBusiness(Integer Id, String nev, ArrayList<VendegBusiness> kliensek) {
        super(Id, nev);
        this.kliensek = kliensek;
        //this.setErvenyesseg(true);
    }
    public ArrayList<VendegBusiness> getKliensek(){
        return kliensek;
    }
    
    public void addKliens(VendegBusiness vendeg){
        kliensek.add(vendeg);
    }
    
    public void mentes(){
        Fio<EdzoBusiness> f = new Fio<EdzoBusiness>();
        f.mentes(this);
    }
}
