/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beadando.model;

import java.time.LocalDate;

/**
 *
 * @author balaz
 */
public abstract class Tag {
    private Integer id;
    private String name;
    //private Boolean ervenyesseg = false;
    private LocalDate nyilvanTartasbaVetelIdeje = LocalDate.now();
    private LocalDate szuletesiIdo;

    public Tag(Integer id, String name) {
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
