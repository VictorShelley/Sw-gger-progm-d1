package beadando.business;

public enum KedvezmenyTipusEnum {
    TELJES(2), DIAK(1); 
    
    private final int kedvezmenymerteke;
    
    private KedvezmenyTipusEnum(int kedvezmenymerteke){
        this.kedvezmenymerteke = kedvezmenymerteke;
    }
    
    public int getkedvezmeny(){
        return kedvezmenymerteke;
    }
}
