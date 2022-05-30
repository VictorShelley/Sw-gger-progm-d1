package beadando.application;

import beadando.business.VendegBusiness;
import java.awt.Dimension;
import static java.lang.System.out;
import java.time.LocalDate;
import static java.time.LocalDate.now;
import javax.swing.JOptionPane;

/**
 *
 * @author zelllow777
 */
public class Vmodositas_JP extends javax.swing.JPanel {


    public Vmodositas_JP(App app) {
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
        
        jLabel0 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        id_txt = new javax.swing.JTextField();
        nev_txt = new javax.swing.JTextField();
        telefonszam_txt = new javax.swing.JTextField();
        cim_txt = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel0.setText("ID:");
        add(jLabel0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        
        jLabel1.setText("Név:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel5.setText("Telefonszám:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel6.setText("cím:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt, app);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));
        
        id_txt.setText("");
        id_txt.setPreferredSize(new Dimension(60, 20));
        add(id_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));
        
        nev_txt.setText("");
        nev_txt.setPreferredSize(new Dimension(60, 20));
        add(nev_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        telefonszam_txt.setText("");
        telefonszam_txt.setPreferredSize(new Dimension(60, 20));
        add(telefonszam_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        cim_txt.setText("");
        cim_txt.setPreferredSize(new Dimension(60, 20));
        add(cim_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt, App app) {                                         
        // TODO add your handling code here:
        try{
            Integer id = Integer.parseInt(id_txt.getText());
            for(int i=0; i<app.vendegList.size(); i++){
                VendegBusiness vendeg = app.vendegList.get(i);
                if(id==vendeg.getId()){
                    vendeg.setNev(nev_txt.getText());
                    vendeg.setCim(telefonszam_txt.getText());
                    vendeg.setTelefonszam(cim_txt.getText());
                }
            }
            JOptionPane.showMessageDialog(null, "Sikeres adat módositás!");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Hiba a módosítás közben", "Message", JOptionPane.ERROR_MESSAGE);
            out.println(ex.toString());
        }
    }                                        


    // Variables declaration - do not modify  
    private javax.swing.JLabel jLabel0;
    private javax.swing.JTextField id_txt;
    private javax.swing.JTextField cim_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nev_txt;
    private javax.swing.JTextField telefonszam_txt;
    // End of variables declaration                   
}