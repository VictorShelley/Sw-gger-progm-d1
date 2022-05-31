package beadando.business.os;

import java.time.LocalDate;
import beadando.business.GetterFunctionName;

public abstract class TagBusiness {
    
    private Integer nextId=1;
    
    @GetterFunctionName(name="getId")
    private Integer Id;
    
    @GetterFunctionName(name="getNev")
    private String nev;
    
    @GetterFunctionName(name="getErvenyesseg")
    private Boolean ervenyesseg;
    
    @GetterFunctionName(name="getTelefonszam")
    private String telefonszam;
    
    @GetterFunctionName(name="getCim")
    private String cim;
    
    @GetterFunctionName(name="getCsatlakozasDatuma")
    private LocalDate csatlakozasDatuma;
    
    public TagBusiness(String nev, String telefonszam, String cim, LocalDate csatlakozasDatuma){
        this.Id = nextId;
        nextId++;
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

    public String getTelefonszam() {
        return telefonszam;
    }

    public String getCim() {
        return cim;
    }

    public LocalDate getCsatlakozasDatuma() {
        return csatlakozasDatuma;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setTelefonszam(String telefonszam) {
        this.telefonszam = telefonszam;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }
    

    public void setErvenyesseg(Boolean ervenyesseg) {
        this.ervenyesseg = ervenyesseg;
    }

}
