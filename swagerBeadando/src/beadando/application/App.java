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

public class App{
    public void run(){
        Ablak a = new Ablak();
    }
}

class Ablak extends JFrame implements ActionListener {
    
    JFrame fr = new JFrame();
    JPanel jp = new JPanel();

    JMenuBar mb = new JMenuBar();
    
    //Vendegekre vonatkozo menu komponensek
    JMenu vendeg = new JMenu("Vendegek");
    JMenu adatok = new JMenu("Vendegek adatainak kezelése");
    JMenuItem vfelvetel = new JMenuItem ("Új regisztráció");
    JMenuItem vmodositas = new JMenuItem ("Módosítás");
    JMenuItem vtorles = new JMenuItem ("törlés");
    JMenuItem vbefizetes = new JMenuItem("Befizetes");
    JMenuItem vberletVasarlas = new JMenuItem("Bérlet Vásárlás");
    
    //Edzokre vonatkozo menu komponensek
    JMenu edzo = new JMenu("Edzok");
    JMenuItem efelvetel = new JMenuItem ("Felvetel");
    JMenuItem emodositas = new JMenuItem ("Modositas");
    JMenuItem etorles = new JMenuItem ("torles");
    JMenuItem elefokozas = new JMenuItem("Edzo-->Vendeg");
    
    //Tagokra(os) vonatkozo menu komponensek
    JMenu megjelenites = new JMenu("Megjelenites");
    JMenuItem tagokLista = new JMenuItem("Tagok megjelenitese listaban");
    JMenuItem tagKeres = new JMenuItem("Tag keresése");
    
    //Adatbazisra vonatkozo funkciok
    JMenu adatbazis = new JMenu("Adatbázis");
    JMenuItem mentes = new JMenuItem("Mentés");
    JMenuItem torles = new JMenuItem("Törles");
    
    //Menu ablak beallitasa
    public Ablak() throws HeadlessException {
        fr.setSize(600,600);
        fr.setTitle("GYM nyilvantarto");
        fr.setDefaultCloseOperation(EXIT_ON_CLOSE);
        fr.setJMenuBar(mb);
        
        //Vendegekre vonatkozo komponensek hozzaadasa + actionlisteners
        mb.add(vendeg);
        vendeg.add(adatok);
        adatok.add(vfelvetel);
        adatok.add(vmodositas);
        adatok.add(vtorles);
        vendeg.add(vbefizetes);
        vendeg.add(vberletVasarlas);
        
        vfelvetel.addActionListener(this);
        vmodositas.addActionListener(this);
        vtorles.addActionListener(this);
        vbefizetes.addActionListener(this);
        vberletVasarlas.addActionListener(this);

        //Edzokre vonatkozo komponensek hozzaadasa + actionlisteners
        mb.add(edzo);
        edzo.add(efelvetel);
        edzo.add(emodositas);
        edzo.add(etorles);
        edzo.add(elefokozas);
        
        efelvetel.addActionListener(this);
        emodositas.addActionListener(this);
        etorles.addActionListener(this);
        elefokozas.addActionListener(this);
        
        //Tagokra(os) vonatkozo komponensek hozzaadasa + actionlisteners
        mb.add(megjelenites);
        megjelenites.add(tagokLista);
        megjelenites.add(tagKeres);
        
        tagokLista.addActionListener(this);
        tagKeres.addActionListener(this);
        
        //Adatbazis funkcioira vonatkozo komponensek hozzaadasa + actionlisteners
        mb.add(adatbazis);
        adatbazis.add(mentes);
        adatbazis.add(torles);
        
        torles.addActionListener(this);
        mentes.addActionListener(this);
        
        fr.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //JP-t hiv
        if(e.getSource()== vfelvetel){
            
        }
        //JP-t hiv
        else if(e.getSource()== vmodositas){
            
        }
        //lokalisan
        else if(e.getSource()== vtorles){
            
        }
        //lokalisan (Bérlet vásárláskor az itt felvitt összeget lehet "elkölteni")
        else if(e.getSource()== vbefizetes){
            
        }
        //lokalisan
        else if(e.getSource()== vberletVasarlas){
            
        }
        //JP-t hiv
        else if(e.getSource()== efelvetel){
            
        }
        //JP-t hiv
        else if(e.getSource()== emodositas){
            
        }
        //lokalisan
        else if(e.getSource()== etorles){
            
        }
        //lokalisan (Edzo class tagjának adatait átmenti egy új vendegként, majd törli az edzo változatot)
        else if(e.getSource()== elefokozas){
            
        }
        //JP-t hiv (Az összes tag megjelentése egy legördülő lista formájában)
        else if(e.getSource()== tagokLista){
            
        }
        //JP-t hiv (Egyetlen tag megjelenitése keresés név vagy ID alapján)
        else if(e.getSource()== tagKeres){
            
        }
        //lokalisan mentes XML-be
        else if(e.getSource()== mentes){
            
        }
        //lokalisan XML fájl törlése, új létrehozasa
        else if(e.getSource()== torles){
            
        }
    }
}
