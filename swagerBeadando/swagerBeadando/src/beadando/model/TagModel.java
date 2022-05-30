package beadando.model;

import java.time.LocalDate;

public abstract class TagModel {
    private Integer id;
    private String name;
    //private Boolean ervenyesseg = false;
    private LocalDate nyilvanTartasbaVetelIdeje = LocalDate.now();
    private LocalDate szuletesiIdo;

    public TagModel(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /*
    public Boolean getErvenyesseg() {
        return ervenyesseg;
    }

    public void setErvenyesseg(Boolean ervenyesseg) {
        this.ervenyesseg = ervenyesseg;
    }
    */
    public LocalDate getNyilvanTartasbaVetelIdeje(){
        return this.nyilvanTartasbaVetelIdeje;
    }
}
