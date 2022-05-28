package beadando;

import beadando.business.BerletTipusEnum;
import beadando.business.EdzoBusiness;
import beadando.business.VendegBusiness;
import beadando.application.App;
import static java.lang.System.out;

public class Beadando {
    
    public static void main(String[] args) {
        VendegBusiness v1 = new VendegBusiness(123, "Valami Név");
        v1.BerletVasarlas(BerletTipusEnum.LEJART);
        
        out.println(v1.getErvenyessegDatum());
        
        EdzoBusiness e1 = new EdzoBusiness(456, "Másik Név");     
        e1.addKliens(v1);
        
        v1.mentes();
        
        e1.mentes();
        
        App app = new App();
        app.run();
    } 
}
