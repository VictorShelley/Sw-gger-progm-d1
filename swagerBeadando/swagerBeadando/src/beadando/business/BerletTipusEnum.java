package beadando.business;

import java.time.LocalDate;

public enum BerletTipusEnum {
    LEJART(-1), NAPIJEGY(1), HAVIBERLET(30);
    
    private final long ervenyessegHossza;
    
    private BerletTipusEnum(long ervenyessegHossza){
        this.ervenyessegHossza = ervenyessegHossza;
    }
    
    public LocalDate getErvenyessegDatum(){
        LocalDate date = LocalDate.now().plusDays(ervenyessegHossza);
        return date;
    }
}
