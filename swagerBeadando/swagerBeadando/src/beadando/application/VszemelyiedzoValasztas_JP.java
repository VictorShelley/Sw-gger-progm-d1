package beadando.application;

import beadando.business.EdzoBusiness;
import beadando.business.VendegBusiness;
import static java.lang.System.out;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author zelllow777
 */
public class VszemelyiedzoValasztas_JP extends javax.swing.JPanel {

    /**
     * Creates new form jpform
     */
    public VszemelyiedzoValasztas_JP(App app) {
        initComponents(app);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents(App app) {

        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();

        jButton2.setText("Hozzárendelés");
         jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt, app);
            }
        });

        jLabel6.setText("Vendég");

        jLabel7.setText("Edző");
        
        String[] vendegNevLista = new String[app.vendegList.size()];
        for(int i=0; i<app.vendegList.size(); i++){
            vendegNevLista[i]=(app.vendegList.get(i).getNev());
        }
        
        String[] edzoNevLista = new String[app.edzoList.size()];
        for(int i=0; i<app.edzoList.size(); i++){
            edzoNevLista[i]=(app.edzoList.get(i).getNev());
        }

        jComboBox1.setModel(new DefaultComboBoxModel<String>(vendegNevLista));
        
        jComboBox2.setModel(new DefaultComboBoxModel<String>(edzoNevLista));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(304, Short.MAX_VALUE))
        );
    }// </editor-fold>                        
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt, App app) {                                         
    // TODO add your handling code here:
        try{
            VendegBusiness vendeg = null;
            for(int i=0; i<app.vendegList.size(); i++){
                if(app.vendegList.get(i).getNev()==jComboBox1.getSelectedItem().toString()){
                    vendeg = app.vendegList.get(i);
                }
            }
            EdzoBusiness edzo = null;
            for(int i=0; i<app.edzoList.size(); i++){
                if(app.edzoList.get(i).getNev()==jComboBox2.getSelectedItem().toString()){
                    edzo = app.edzoList.get(i);
                }
            }
            try {
                edzo.addKliens(vendeg);
                JOptionPane.showMessageDialog(null, "Sikeres Személyiedző választás!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Hiba a személyiedző választás közben! (Nem létező tag)", "Message", JOptionPane.ERROR_MESSAGE);
                out.println(ex.toString());
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Hiba a személyiedző választás közben!", "Message", JOptionPane.ERROR_MESSAGE);
            out.println(ex.toString());
        }
    }   

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration                   
}