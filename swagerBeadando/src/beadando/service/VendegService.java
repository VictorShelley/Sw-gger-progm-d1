/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beadando.service;

import beadando.business.VendegBusiness;

/**
 *
 * @author balaz
 */
public class VendegService {
    public VendegBusiness saveVendeg(Integer id, String name){
        VendegBusiness vb = new VendegBusiness(id, name);
        return vb;
    }
}
