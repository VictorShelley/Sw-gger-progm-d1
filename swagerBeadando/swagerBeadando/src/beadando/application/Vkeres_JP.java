package beadando.application;

import beadando.business.VendegBusiness;
import java.awt.Dimension;
import static java.lang.System.out;
import javax.swing.JOptionPane;

/**
 *
 * @author zelllow777
 */
public class Vkeres_JP extends javax.swing.JPanel {

    public Vkeres_JP(App app) {
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

        jLabel1 = new javax.swing.JLabel();
        id_lbl = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kereses_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        id_lbl1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        id_txt = new javax.swing.JTextField();
        id_str = new javax.swing.JLabel();
        nev = new javax.swing.JLabel();
        cim = new javax.swing.JLabel();
        telefonszam = new javax.swing.JLabel();
        ervenyessegDatum = new javax.swing.JLabel();
        berletTipus = new javax.swing.JLabel();
        kedvezmenyTipus = new javax.swing.JLabel();
        csatlakozasDatum = new javax.swing.JLabel();
        berletErvenyesseg = new javax.swing.JLabel();
        egyenleg = new javax.swing.JLabel();
        //törlés, befizetés
        befizetes_btn = new javax.swing.JButton();
        torles_btn = new javax.swing.JButton();
        
        
        jLabel1.setText("jLabel1");

        setPreferredSize(new java.awt.Dimension(500, 500));
        setVerifyInputWhenFocusTarget(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(id_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jLabel19.setText("Érvényesség dátuma:");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel20.setText("Egyenleg");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jLabel2.setText("Adja meg a keresett tag ID-ját:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        kereses_btn.setText("Keresés");
        kereses_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kereses_btnActionPerformed(evt, app);
            }
        });
        add(kereses_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));
        
        befizetes_btn.setText("Befizetés");
        befizetes_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                befizetes_btnActionPerformed(evt, app);
            }
        });
        add(befizetes_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));
        befizetes_btn.setVisible(false);
        
        torles_btn.setText("Törlés");
        torles_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                torles_btnActionPerformed(evt, app);
            }
        });
        add(torles_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));
        torles_btn.setVisible(false);
        
        jLabel3.setText("Név:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        add(id_lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        jLabel6.setText("Bérlet érvényessége:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jLabel7.setText("Telefonszám:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel4.setText("ID:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel10.setText("Cím:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel12.setText("Csatlakozás dátuma:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel15.setText("Bérlet típusa:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel16.setText("Kedvezmény típusa:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        id_txt.setText("jTextField1");
        add(id_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        id_str.setText("jLabel5");
        add(id_str, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 480, 20));

        nev.setText("jLabel8");
        add(nev, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 490, 20));

        cim.setText("jLabel9");
        add(cim, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 480, 20));

        telefonszam.setText("jLabel11");
        add(telefonszam, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 440, 20));

        ervenyessegDatum.setText("jLabel13");
        add(ervenyessegDatum, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 410, 20));

        berletTipus.setText("jLabel14");
        add(berletTipus, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 460, 20));

        kedvezmenyTipus.setText("jLabel17");
        add(kedvezmenyTipus, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 430, 20));

        csatlakozasDatum.setText("jLabel18");
        add(csatlakozasDatum, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 420, 20));

        berletErvenyesseg.setText("jLabel21");
        add(berletErvenyesseg, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 420, 20));

        egyenleg.setText("jLabel22");
        add(egyenleg, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 480, -1));
        
        id_txt.setText("");
        id_txt.setPreferredSize(new Dimension(60, 20));
        nev.setText("");
        berletTipus.setText("");
        cim.setText("");
        csatlakozasDatum.setText("");
        egyenleg.setText("");
        berletErvenyesseg.setText("");
        ervenyessegDatum.setText("");
        id_str.setText("");
        kedvezmenyTipus.setText("");
        telefonszam.setText("");
        
    }// </editor-fold>                        

    private void kereses_btnActionPerformed(java.awt.event.ActionEvent evt, App app) {                                            
        // TODO add your handling code here:
        try{
            Integer id = Integer.parseInt(id_txt.getText());
            boolean f = false; 
            for(int i=0; i<app.vendegList.size(); i++){
                VendegBusiness vendeg = app.vendegList.get(i);
                if(id == vendeg.getId()){
                    nev.setText(vendeg.getNev());
                    berletTipus.setText(vendeg.getBerletTipus().toString());
                    cim.setText(vendeg.getCim());
                    csatlakozasDatum.setText(vendeg.getCsatlakozasDatuma().toString());
                    egyenleg.setText(vendeg.getEgyenleg().toString());
                    berletErvenyesseg.setText(vendeg.getErvenyesseg().toString());
                    ervenyessegDatum.setText(vendeg.getErvenyessegDatum().toString());
                    id_str.setText(vendeg.getId().toString());
                    kedvezmenyTipus.setText(vendeg.getKedvezmenyTipus().toString());
                    telefonszam.setText(vendeg.getTelefonszam());

                    befizetes_btn.setVisible(true);
                    torles_btn.setVisible(true);
                    
                    id_txt.setEditable(false);
                    f = true;
                }
            }
            if(f==false){
                JOptionPane.showMessageDialog(null, "Ilyen ID nem létezik", "Message", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Hiba a keresés közben", "Message", JOptionPane.ERROR_MESSAGE);
            out.println(ex.toString());
        }
    }
    private void befizetes_btnActionPerformed(java.awt.event.ActionEvent evt, App app) { 
        try{
            Integer id = Integer.parseInt(id_txt.getText());
            Integer osszeg = Integer.parseInt(JOptionPane.showInputDialog("A befizetés összege: "));
            app.vendegList.get(id-1).egyenlegNoveles(osszeg);
            egyenleg.setText(app.vendegList.get(id-1).getEgyenleg().toString());
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Hiba az befizetés közben!", "Message", JOptionPane.ERROR_MESSAGE);
            out.println(ex.toString());
       }
    }
    private void torles_btnActionPerformed(java.awt.event.ActionEvent evt, App app) {  
        try{
            Integer id = Integer.parseInt(id_txt.getText());
            int result = JOptionPane.showConfirmDialog(null, "Biztosan törlöd?","Message",JOptionPane.YES_NO_OPTION); 
            if(result == JOptionPane.YES_OPTION){
                app.vendegList.remove(id);
                }
            }
        catch(Exception ex){
                JOptionPane.showMessageDialog(null, "probléma a törlés közben.!", "Message", JOptionPane.ERROR_MESSAGE);
                out.println(ex.toString());
        }
    }                                           


    // Variables declaration - do not modify                     
    private javax.swing.JLabel id_lbl;
    private javax.swing.JLabel id_lbl1;
    private javax.swing.JTextField id_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel telefonszam;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel ervenyessegDatum;
    private javax.swing.JLabel berletTipus;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel kedvezmenyTipus;
    private javax.swing.JLabel csatlakozasDatum;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel berletErvenyesseg;
    private javax.swing.JLabel egyenleg;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel id_str;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel nev;
    private javax.swing.JLabel cim;
    private javax.swing.JButton kereses_btn;
    private javax.swing.JButton befizetes_btn;
    private javax.swing.JButton torles_btn;
    // End of variables declaration                   
}

