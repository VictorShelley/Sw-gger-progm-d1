package beadando.business.os;

import beadando.business.GetterFunctionName;

public abstract class TagBusiness {
    //public static final String fajlnev = "mentes.xml";
    
    @GetterFunctionName(name="getId")
    private Integer Id;
    
    @GetterFunctionName(name="getNev")
    private String nev;
    
    @GetterFunctionName(name="getErvenyesseg")
    private Boolean ervenyesseg = false;
    
    
    public TagBusiness(Integer Id, String nev){
        this.Id = Id;
        this.nev = nev;
    }

    public Integer getId() {
        return Id;
    }

    public String getNev() {
        return nev;
    }

    public Boolean getErvenyesseg() {
        return ervenyesseg;
    }

    public void setErvenyesseg(Boolean ervenyesseg) {
        this.ervenyesseg = ervenyesseg;
    }

}
