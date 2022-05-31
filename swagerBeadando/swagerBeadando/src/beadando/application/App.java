package beadando.application;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.System.out;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import beadando.application.Vkeres_JP;
import beadando.business.EdzoBusiness;
import beadando.business.KedvezmenyTipusEnum;
import beadando.business.VendegBusiness;
import java.util.ArrayList;

import javax.swing.SwingUtilities;

public class App{
    public ArrayList<VendegBusiness> vendegList = new ArrayList<VendegBusiness>();
    public ArrayList<EdzoBusiness> edzoList = new ArrayList<EdzoBusiness>();
    
    public void run(){

        Ablak a = new Ablak();
    }
}

class Ablak extends JFrame implements ActionListener {
    
    App app = new App();
    
    JFrame fr = new JFrame();
    JPanel jp = new JPanel();

    JMenuBar mb = new JMenuBar();
    
    //Vendegekre vonatkozo menu komponensek
    JMenu vendeg = new JMenu("Vendegek");
    JMenuItem vfelvetel = new JMenuItem ("Felvétel");
    JMenuItem vmodositas = new JMenuItem ("Módosítás");
    JMenuItem vtorles = new JMenuItem ("törlés");
    JMenuItem vbefizetes = new JMenuItem("Befizetes");
    JMenuItem vberletVasarlas = new JMenuItem("Bérlet Vásárlás");
    JMenuItem vkeres = new JMenuItem("Vendég keresése");
    JMenuItem vszemelyiedzoValasztas = new JMenuItem("Személyi edző választás");
    
    //Edzokre vonatkozo menu komponensek
    JMenu edzo = new JMenu("Edzok");
    JMenuItem efelvetel = new JMenuItem ("Felvetel");
    JMenuItem emodositas = new JMenuItem ("Modositas");
    JMenuItem etorles = new JMenuItem ("torles");
    JMenuItem elefokozas = new JMenuItem("Edzo-->Vendeg");
    JMenuItem ekeres = new JMenuItem("Edzo keresése");
    
    //Tagokra(os) vonatkozo menu komponensek
    JMenu megjelenites = new JMenu("Megjelenites");
    JMenuItem tagokLista = new JMenuItem("Tagok megjelenitese listaban");
    
    //Adatbazisra vonatkozo funkciok
    JMenu adatbazis = new JMenu("Adatbázis");
    JMenuItem mentes = new JMenuItem("Mentés");
    
    //Menu ablak beallitasa
    public Ablak() throws HeadlessException {
        fr.setSize(600,600);
        fr.setTitle("GYM nyilvantarto");
        fr.setDefaultCloseOperation(EXIT_ON_CLOSE);
        fr.setJMenuBar(mb);
        
        //Vendegekre vonatkozo komponensek hozzaadasa + actionlisteners
        mb.add(vendeg);
        vendeg.add(vfelvetel);
        vendeg.add(vmodositas);
        vendeg.add(vtorles);
        vendeg.add(vbefizetes);
        vendeg.add(vberletVasarlas);
        vendeg.add(vkeres);
        vendeg.add(vszemelyiedzoValasztas);
        
        vfelvetel.addActionListener(this);
        vmodositas.addActionListener(this);
        vtorles.addActionListener(this);
        vbefizetes.addActionListener(this);
        vberletVasarlas.addActionListener(this);
        vkeres.addActionListener(this);
        vszemelyiedzoValasztas.addActionListener(this);

        //Edzokre vonatkozo komponensek hozzaadasa + actionlisteners
        mb.add(edzo);
        edzo.add(efelvetel);
        edzo.add(emodositas);
        edzo.add(etorles);
        edzo.add(elefokozas);
        edzo.add(ekeres);
        
        efelvetel.addActionListener(this);
        emodositas.addActionListener(this);
        etorles.addActionListener(this);
        elefokozas.addActionListener(this);
        ekeres.addActionListener(this);
        
        //Tagokra(os) vonatkozo komponensek hozzaadasa + actionlisteners
        mb.add(megjelenites);
        megjelenites.add(tagokLista);
        
        tagokLista.addActionListener(this);
        
        //Adatbazis funkcioira vonatkozo komponensek hozzaadasa + actionlisteners
        mb.add(adatbazis);
        adatbazis.add(mentes);

        
        mentes.addActionListener(this);
        
        fr.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(jp!=null){
            fr.remove(jp);
            fr.revalidate();
            fr.repaint();
        }
        //JP-t hiv
        if(e.getSource()== vfelvetel){
            jp = new Vfelvetel_JP(app);
            fr.add(jp);
        }
        //JP-t hiv
        else if(e.getSource()== vmodositas){
            jp = new Vmodositas_JP(app);
            fr.add(jp);
        }
        //lokalisan
        else if(e.getSource()== vtorles){
            try{
                Integer  id = Integer.parseInt(JOptionPane.showInputDialog("A vendég ID-ja: "));
                for(int i=0; i<app.vendegList.size(); i++){
                    if(app.vendegList.get(i).getId()==id){
                        app.vendegList.remove(i);
                    }
                }
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Hibás ID!", "Message", JOptionPane.ERROR_MESSAGE);
                out.println(ex.toString());
            }
        }
        //lokalisan (Bérlet vásárláskor az itt felvitt összeget lehet "elkölteni")
        else if(e.getSource()== vbefizetes){
            try{
                Integer id = Integer.parseInt(JOptionPane.showInputDialog("A vendég ID-ja: "));
                Integer osszeg = Integer.parseInt(JOptionPane.showInputDialog("A befizetés összege: "));
                app.vendegList.get(id-1).egyenlegNoveles(osszeg);
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Hiba az befizetés közben!", "Message", JOptionPane.ERROR_MESSAGE);
                out.println(ex.toString());
            }
        }
        //lokalisan
        else if(e.getSource()== vberletVasarlas){
            jp = new VberletVasarlas_JP(app);
            fr.add(jp);
        }
        //JP-t hiv
        else if(e.getSource()== efelvetel){
            jp = new Efelvetel_JP(app);
            fr.add(jp);
        }
        //JP-t hiv
        else if(e.getSource()== emodositas){
            jp = new Emodositas_JP(app);
            fr.add(jp);
        }
        //lokalisan
        else if(e.getSource()== etorles){
            try{
                Integer  id = Integer.parseInt(JOptionPane.showInputDialog("Az edző ID-ja: "));
                for(int i=0; i<app.edzoList.size(); i++){
                    if(app.edzoList.get(i).getId()==id){
                        app.edzoList.remove(i);
                    }
                }
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Hibás ID!", "Message", JOptionPane.ERROR_MESSAGE);
                out.println(ex.toString());
            }
        }
        //lokalisan (Edzo class tagjának adatait átmenti egy új vendegként, majd törli az edzo változatot)
        else if(e.getSource()== elefokozas){
            try{
                Integer id = Integer.parseInt(JOptionPane.showInputDialog("Az edző ID-ja: "));
                EdzoBusiness edzo = null;
                
                for(int i=0; i<app.edzoList.size(); i++){
                    if(app.edzoList.get(i).getId()==id){
                        edzo = app.edzoList.get(i);
                        app.vendegList.add(new VendegBusiness(edzo.getNev(), edzo.getTelefonszam(), edzo.getCim(), edzo.getCsatlakozasDatuma()));
                        app.edzoList.remove(i);
                    }
                }
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Hiba a lefokozás közben!", "Message", JOptionPane.ERROR_MESSAGE);
                out.println(ex.toString());
            }
        }
        //JP-t hiv (Az összes tag megjelentése egy legördülő lista formájában)
        else if(e.getSource()== tagokLista){
            jp = new TagokLista_JP(app);
            fr.add(jp);
        }
        //JP-t hiv (Egyetlen tag megjelenitése keresés név vagy ID alapján)
        else if(e.getSource()== vkeres){
            jp = new Vkeres_JP(app);
            fr.add(jp);
        }
        else if(e.getSource()==ekeres){
            jp = new Ekeres_JP(app);
            fr.add(jp);
        }
        //lokalisan mentes XML-be
        else if(e.getSource()== mentes){
            try{
                for(int i=0; i<app.vendegList.size(); i++){
                app.vendegList.get(i).mentes();
                }
                for(int i=0; i<app.edzoList.size(); i++){
                    app.edzoList.get(i).mentes();
                }
                JOptionPane.showMessageDialog(null, "Sikeres mentés!");
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Hiba a mentés közben!", "Message", JOptionPane.ERROR_MESSAGE);
                out.println(ex.toString());
            }
        }
        else if(e.getSource()== vszemelyiedzoValasztas){
            jp = new VszemelyiedzoValasztas_JP(app);
            fr.add(jp);
        }
        SwingUtilities.updateComponentTreeUI(jp);
    }
}
