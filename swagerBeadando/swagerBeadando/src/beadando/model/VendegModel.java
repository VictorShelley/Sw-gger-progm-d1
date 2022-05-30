/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beadando.model;

/**
 *
 * @author balaz
 */
public class VendegModel extends TagModel{
    private Boolean ervenyesseg;
    
    public VendegModel(Integer id, String name) {
        super(id, name);
        this.ervenyesseg = false;
    }

    public Boolean getErvenyesseg() {
        return ervenyesseg;
    }

    public void setErvenyesseg(Boolean ervenyesseg) {
        this.ervenyesseg = ervenyesseg;
    }
    
    
}
