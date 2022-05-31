package beadando.application;

import beadando.business.EdzoBusiness;
import beadando.business.VendegBusiness;
import static java.lang.System.out;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class TagokLista_JP extends javax.swing.JPanel {

    public TagokLista_JP(App app) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        
        ArrayList<String> strings  = new ArrayList<String>();
        //logika rész
        try{
            for(int i=0; i<app.vendegList.size(); i++){
                VendegBusiness vendeg = app.vendegList.get(i);
                strings.add(vendeg.getMegnevezese() + "| ID: " + vendeg.getId() + ", Név: " + vendeg.getNev() + ", Érvényesség: " + vendeg.getErvenyesseg());
            }
            for(int i=0; i<app.edzoList.size(); i++){
                EdzoBusiness edzo = app.edzoList.get(i);
                strings.add(edzo.getMegnevezese() + "| ID: " + edzo.getId() + ", Név: " + edzo.getNev() + ", Érvényesség: " + edzo.getErvenyesseg());
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Hiba a lista megjelenítése során!", "Message", JOptionPane.ERROR_MESSAGE);
            out.println(ex.toString());
        }
        
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            public int getSize() { return strings.size(); }
            public String getElementAt(int i) { return strings.get(i); }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );
        
    }// </editor-fold>                        

    // Variables declaration - do not modify                     
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}