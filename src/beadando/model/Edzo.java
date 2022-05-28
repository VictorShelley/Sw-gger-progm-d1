/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beadando.model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author balaz
 */
public class Edzo extends Tag{

    private ArrayList<Integer> kliensIds= new ArrayList<>();
    
    public Edzo(Integer id, String nev) {
        super(id, nev);
        //this.setErvenyesseg(true);
        //mivel edző, szerintem itt felesleges
    }
    
}
