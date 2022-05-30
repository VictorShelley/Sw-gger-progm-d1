package beadando.business.os;

import java.time.LocalDate;
import beadando.business.GetterFunctionName;

public abstract class TagBusiness {
    //public static final String fajlnev = "mentes.xml";
    
    @GetterFunctionName(name="getId")
    private Integer Id;
    
    @GetterFunctionName(name="getNev")
    private String nev;
    
    @GetterFunctionName(name="getErvenyesseg")
    private Boolean ervenyesseg;
    
    @GetterFunctionName(name="getTelefonszam")
    private Integer telefonszam;
    
    @GetterFunctionName(name="getCim")
    private String cim;
    
    @GetterFunctionName(name="getCsatlakozasDatuma")
    private LocalDate csatlakozasDatuma;
    
    public TagBusiness(Integer Id, String nev, Integer telefonszam, String cim, LocalDate csatlakozasDatuma){
        this.Id = Id;
        this.nev = nev;
        this.telefonszam = telefonszam;
        this.cim = cim;
        this.csatlakozasDatuma = csatlakozasDatuma;
        this.ervenyesseg = false;
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

    public Integer getTelefonszam() {
        return telefonszam;
    }

    public String getCim() {
        return cim;
    }

    public LocalDate getCsatlakozasDatuma() {
        return csatlakozasDatuma;
    }

    public void setErvenyesseg(Boolean ervenyesseg) {
        this.ervenyesseg = ervenyesseg;
    }

}
