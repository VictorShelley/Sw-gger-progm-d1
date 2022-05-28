/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beadando.layout;

import java.time.LocalDate;

/**
 *
 * @author balaz
 */
public class TagLayout {
    Integer id;
    String name;
    //legyen megjelenítve?
    LocalDate szuletesiIdo;
    Integer kor;

    public TagLayout(Integer id) {
        this.id = id;
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

    public LocalDate getSzuletesiIdo() {
        return szuletesiIdo;
    }

    public void setSzuletesiIdo(LocalDate szuletesiIdo) {
        this.szuletesiIdo = szuletesiIdo;
    }

    public Integer getKor() {
        return kor;
    }

    public void setKor(Integer kor) {
        this.kor = kor;
    }
}
