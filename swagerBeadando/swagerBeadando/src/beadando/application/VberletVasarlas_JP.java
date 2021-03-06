/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package beadando.application;

import beadando.business.BerletTipusEnum;
import beadando.business.KedvezmenyTipusEnum;
import beadando.business.VendegBusiness;
import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 *
 * @author zelllow777
 */
public class VberletVasarlas_JP extends javax.swing.JPanel {

    /**
     * Creates new form jpform
     */
    public VberletVasarlas_JP(App app) {
        initComponents(app);
    }
    
    public VberletVasarlas_JP(App app, Integer id) {
        initComponents(app);
        jTextField1.setText(id.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents(App app) {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        jLabel1.setText("Napijegy");

        jLabel2.setText("Havibérlet");

        jButton1.setText("Vásárlás");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt, app);
            }
        });

        jLabel3.setText("Diák");

        jLabel4.setText("Teljesárú");

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jLabel5.setText("ID:");

        jTextField1.setPreferredSize(new Dimension(60, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(275, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(123, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        jCheckBox2.setSelected(false);
    }                                          

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        jCheckBox1.setSelected(false);
    }                                          

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        jCheckBox4.setSelected(false);
    }                                          

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        jCheckBox3.setSelected(false);
    }                                          

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt, App app) {                                         
        // TODO add your handling code here:
        try{
            Integer id = Integer.parseInt(jTextField1.getText());
            VendegBusiness vendeg = app.vendegList.get(id-1);
            Integer osszeg = vendeg.getAlapNapijegy();

            if ( (jCheckBox1.isSelected() || jCheckBox2.isSelected()) && (jCheckBox3.isSelected() || jCheckBox4.isSelected())){
                osszeg = vendeg.getAlapNapijegy();
                if(jCheckBox1.isSelected()){//napijegy
                    if(jCheckBox3.isSelected()){//diák
                        jegyKiadas(vendeg, BerletTipusEnum.NAPIJEGY, KedvezmenyTipusEnum.DIAK, osszeg, "napijegy", "diák");
                    }
                    else if(jCheckBox4.isSelected()){//teljesárú
                        jegyKiadas(vendeg, BerletTipusEnum.NAPIJEGY, KedvezmenyTipusEnum.TELJES, osszeg, "napijegy", "teljesárú");
                    }
                }
                else if(jCheckBox2.isSelected()){//havi bérlet
                    if(jCheckBox3.isSelected()){//diák
                        jegyKiadas(vendeg, BerletTipusEnum.HAVIBERLET, KedvezmenyTipusEnum.DIAK, osszeg*10, "havibérlet", "diák");
                    }
                    else if(jCheckBox4.isSelected()){//teljesárú
                        jegyKiadas(vendeg, BerletTipusEnum.HAVIBERLET, KedvezmenyTipusEnum.TELJES, osszeg*10, "havibérlet", "teljesárú");
                    }
                }
            }//else JOptionPane.showMessageDialog(null, "Hiba a vásárlás közben!", "Message", JOptionPane.ERROR_MESSAGE);
        }catch(Exception ex){
            System.out.println("hiba: "+ex.toString());
            JOptionPane.showMessageDialog(null, "Hiba a vásárlás közben!", "Message", JOptionPane.ERROR_MESSAGE);
        }
    }                                        
    private void jegyKiadas(VendegBusiness vendeg, BerletTipusEnum tipus, KedvezmenyTipusEnum kedvezmeny, Integer osszeg, String berletTipus, String arTipus){
        osszeg = osszeg * kedvezmeny.getkedvezmeny();
        if(vendeg.hasEnoughMoney(osszeg)){
            vendeg.setKedvezmenyTipus(kedvezmeny);
            JOptionPane.showMessageDialog(null, String.format("A %s %s ára levonásra került! %d Ft", arTipus, berletTipus, osszeg));
            vendeg.BerletVasarlas(tipus);
            vendeg.egyenlegNoveles(-osszeg);
            clearForm();
        }else{
            System.out.println(String.format("%s nem rendelkezik elég egyenleggel a \n szia", vendeg.getNev()));
            JOptionPane.showMessageDialog(null, String.format("%s nem rendelkezik elég egyenleggel a vásárláshoz!\n%s egyenlege: %d Ft\nA %s %s ára: %d Ft", vendeg.getNev(),vendeg.getNev(),vendeg.getEgyenleg(),arTipus,berletTipus, osszeg));
        }
    }                                        

    private void clearForm(){
        jTextField1.setText("");
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration                   
}

