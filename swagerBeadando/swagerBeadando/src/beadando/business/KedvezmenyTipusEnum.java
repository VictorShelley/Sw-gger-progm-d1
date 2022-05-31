package beadando.business;

public enum KedvezmenyTipusEnum {
    TELJES(1), DIAK(0.7); 
    
    private final double kedvezmenymerteke;
    
    private KedvezmenyTipusEnum(double kedvezmenymerteke){
        this.kedvezmenymerteke = kedvezmenymerteke;
    }
    
    public double getkedvezmeny(){
        return kedvezmenymerteke;
    }
}
