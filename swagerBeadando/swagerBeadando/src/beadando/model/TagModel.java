package beadando.model;

import java.time.LocalDate;

public abstract class TagModel {
    private Integer id;
    private String nev;
    private Boolean ervenyesseg;
    private String telefonszam;
    private String cim;
    private LocalDate csatlakozasDatuma;
    
    //private Boolean ervenyesseg = false;
    private LocalDate nyilvanTartasbaVetelIdeje = LocalDate.now();

    public TagModel(Integer id, String name) {
        this.id = id;
        this.nev = name;
    }

}
