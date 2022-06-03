package beadando.application;

import beadando.business.EdzoBusiness;
import beadando.business.VendegBusiness;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.lang.System.out;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class Ekeres_JP extends javax.swing.JPanel {

    
    public Ekeres_JP(App app) {
        initComponents(app);
    }

    
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
        id_txt = new javax.swing.JTextField();
        id_str = new javax.swing.JLabel();
        nev = new javax.swing.JLabel();
        cim = new javax.swing.JLabel();
        telefonszam = new javax.swing.JLabel();
        csatlakozasDatum = new javax.swing.JLabel();
        modositas_btn = new javax.swing.JButton();
        torles_btn = new javax.swing.JButton();
        klienstorles_btn = new javax.swing.JButton();
        ujkereses_btn = new javax.swing.JButton();
        
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setPreferredSize(new java.awt.Dimension(500, 500));
        setVerifyInputWhenFocusTarget(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(id_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jLabel2.setText("Adja meg a keresett edző ID-ját:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        kereses_btn.setText("Keresés");
        kereses_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kereses_btnActionPerformed(evt, app);
            }
        });
        add(kereses_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));
        
        modositas_btn.setText("Módosítás");
        modositas_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modositas_btnActionPerformed(evt, app);
            }
        });
        add(modositas_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 405, -1, -1));
        modositas_btn.setVisible(false);
        
        torles_btn.setText("Törlés");
        torles_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                torles_btnActionPerformed(evt, app);
            }
        });
        add(torles_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 405, -1, -1));
        torles_btn.setVisible(false);
        
        klienstorles_btn.setText("Kliens törlés");
        klienstorles_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                klienstorles_btnActionPerformed(evt, app);
            }
        });
        add(klienstorles_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));
        klienstorles_btn.setVisible(false);
        
        ujkereses_btn.setText("Új keresés");
        ujkereses_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearForm();
            }
        });
        add(ujkereses_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));
        ujkereses_btn.setVisible(false);
        
        jLabel3.setText("Név:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        add(id_lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        jLabel7.setText("Telefonszám:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel4.setText("ID:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel10.setText("Cím:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel12.setText("Csatlakozás dátuma:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel20.setText("Kliensek");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));
        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));
        
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

        csatlakozasDatum.setText("jLabel18");
        add(csatlakozasDatum, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 420, 20));

        
        id_txt.setText("");
        id_txt.setPreferredSize(new Dimension(60, 20));
        nev.setText("");
        cim.setText("");
        csatlakozasDatum.setText("");
        id_str.setText("");
        telefonszam.setText("");
        jScrollPane1.setPreferredSize(new Dimension(250, 130));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jList1.addMouseListener( new MouseAdapter()
            {
               public void mousePressed(MouseEvent e)
               {
                   if ( SwingUtilities.isLeftMouseButton(e))
                   {
                       Integer index = getRow(e.getPoint());
                       jList1.setSelectedIndex(index);
                   }
               }
            });
    }// </editor-fold>                        
    private int getRow(Point point)
    {
       return jList1.locationToIndex(point);
    } 
    private void kereses_btnActionPerformed(java.awt.event.ActionEvent evt, App app) {                                            
            try{
                Integer id = Integer.parseInt(id_txt.getText());
                try{
                    EdzoBusiness edzo = app.edzoList.get(app.getEdzoindexById(id));
                    
                    id_str.setText(id_txt.getText());
                    nev.setText(edzo.getNev());
                    cim.setText(edzo.getCim());
                    csatlakozasDatum.setText(edzo.getCsatlakozasDatuma().toString());
                    telefonszam.setText(edzo.getTelefonszam());

                    VendegBusiness vendeg;
                    ArrayList<VendegBusiness> kliensek = edzo.getKliensek();
                    model = new DefaultListModel();
                    for(int j=0;j<kliensek.size();j++){
                        VendegBusiness kliens = kliensek.get(j);
                        model.addElement(String.format("(%d): %s", kliens.getId(),kliens.getNev()));
                    }
                    jList1.setModel(model);
                    id_txt.setEnabled(false);
                    
                    ujkereses_btn.setVisible(true);
                    torles_btn.setVisible(true);
                    modositas_btn.setVisible(true);
                    if(kliensek.size()>0) klienstorles_btn.setVisible(true);
                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Nem található edző ezzel az ID-val", "Message", JOptionPane.ERROR_MESSAGE);
                    out.println(ex.toString());
                }
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Hiba a keresés közben", "Message", JOptionPane.ERROR_MESSAGE);
                out.println(ex.toString());
            }
        

    } 
    private void modositas_btnActionPerformed(java.awt.event.ActionEvent evt, App app) {  
        try{
            Integer id = Integer.parseInt(id_txt.getText());
            JFrame fr = (JFrame)SwingUtilities.getRoot(this);
            fr.remove(this);
            fr.revalidate();
            fr.repaint();
            JPanel jp = new Emodositas_JP(app, id);
            fr.add(jp);
            SwingUtilities.updateComponentTreeUI(jp);
        }
        catch(Exception ex){
                JOptionPane.showMessageDialog(null, "probléma a törlés közben.!", "Message", JOptionPane.ERROR_MESSAGE);
                out.println(ex.toString());
        }
    }
    private void klienstorles_btnActionPerformed(java.awt.event.ActionEvent evt, App app) {  
        try{
            String listValue = jList1.getSelectedValue();
            
            if(!listValue.equals(null)){
                int listRow = jList1.getSelectedIndex();
                int result = JOptionPane.showConfirmDialog(null, "Biztosan törlöd?","Message",JOptionPane.YES_NO_OPTION); 
                if(result == JOptionPane.YES_OPTION){
                    Integer index = Integer.parseInt(String.valueOf(listValue.charAt(1)));
                    VendegBusiness vendeg = app.vendegList.get(app.getVendegindexById(index));
                        
                    Integer edzoId = Integer.parseInt(id_txt.getText());
                    EdzoBusiness edzo = app.edzoList.get(app.getEdzoindexById(edzoId));
                    System.out.println(edzo.getNev());
                    if(edzo.removeKliens(vendeg)==true) {
                        model.removeElementAt(listRow);
                        jList1.setModel(model);
                        JOptionPane.showMessageDialog(null, "Kliens eltávolítva a listából", "Message", JOptionPane.ERROR_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, "hiba törlés közben", "Message", JOptionPane.ERROR_MESSAGE);
                    }

                }
            }else{
                JOptionPane.showMessageDialog(null, "nincs kiválasztva kliens", "Message", JOptionPane.ERROR_MESSAGE);
            }
        }   
        catch(Exception ex){
                JOptionPane.showMessageDialog(null, "probléma a törlés közben.!", "Message", JOptionPane.ERROR_MESSAGE);
                out.println(ex.toString());
        }
    }
    private void torles_btnActionPerformed(java.awt.event.ActionEvent evt, App app) {  
        try{
            Integer id = Integer.parseInt(id_txt.getText());
            int result = JOptionPane.showConfirmDialog(null, "Biztosan törlöd?","Message",JOptionPane.YES_NO_OPTION); 
            if(result == JOptionPane.YES_OPTION){
                for(int i=0; i<app.edzoList.size(); i++){
                    if(app.edzoList.get(i).getId()==id){
                        app.edzoList.remove(i);
                    }
                }
                clearForm();
                }
            }
        catch(Exception ex){
                JOptionPane.showMessageDialog(null, "probléma a törlés közben.!", "Message", JOptionPane.ERROR_MESSAGE);
                out.println(ex.toString());
        }
    }
    private void clearForm(){
        id_txt.setText("");
        id_str.setText("");
        nev.setText("");
        cim.setText("");
        csatlakozasDatum.setText("");
        telefonszam.setText("");
        jList1.setModel(new DefaultListModel());
        
        
        id_txt.setEnabled(true);
        ujkereses_btn.setVisible(false);
        torles_btn.setVisible(false);
        modositas_btn.setVisible(false);
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
    private javax.swing.JButton klienstorles_btn;
    private javax.swing.JButton ujkereses_btn; 
    private javax.swing.JButton berletVasarlas_btn;
    private javax.swing.JButton modositas_btn;  
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private DefaultListModel model;
}