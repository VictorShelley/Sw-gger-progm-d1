package beadando.business;

import beadando.business.os.Tag;
import beadando.fio.Fio;
import java.util.ArrayList;

public class Edzo extends Tag{

    @GetterFunctionName(name="getKliensek")
    private ArrayList<Vendeg> kliensek= new ArrayList<>();

    public Edzo(Integer Id, String nev) {
        super(Id, nev);
        this.setErvenyesseg(true);
    }

    public ArrayList<Vendeg> getKliensek(){
        return kliensek;
    }
    
    public void addKliens(Vendeg vendeg){
        kliensek.add(vendeg);
    }
    
    public void mentes(){
        Fio<Edzo> f = new Fio<Edzo>();
        f.mentes(this);
    }
    
}
