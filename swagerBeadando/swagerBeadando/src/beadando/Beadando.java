package beadando;

import beadando.business.BerletTipusEnum;
import beadando.business.Edzo;
import beadando.business.Vendeg;
import static java.lang.System.out;

public class Beadando {
    
    public static void main(String[] args) {
        Vendeg v1 = new Vendeg(123, "Valami Név");
        v1.BerletVasarlas(BerletTipusEnum.LEJART);
        
        out.println(v1.getErvenyessegDatum());
        
        Edzo e1 = new Edzo(456, "Másik Név");     
        e1.addKliens(v1);
        
        v1.mentes();
        
        e1.mentes();
    } 
}
