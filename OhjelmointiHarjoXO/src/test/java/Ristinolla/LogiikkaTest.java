
package Ristinolla;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author rivorivo
 */
public class LogiikkaTest {
 
    public LogiikkaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   
     @Test
     public void hello() {}
     
     
     
     @Test
     public void siirtoJaTarkistusToimii(){
         String[] pelilauta = new String[0];
         Logiikka logiikka = new Logiikka(pelilauta);
         logiikka.teeSiirto(2);
         assertEquals(logiikka.getMerkkiRuudussa(2),"X");
     }
     
     @Test
     public void laskeeVuorot1(){
         String[] pelilauta = new String[0];
         Logiikka logiikka = new Logiikka(pelilauta);
         logiikka.teeSiirto(2);
         logiikka.teeSiirto(0);
         logiikka.teeSiirto(1);
         assertEquals(logiikka.getVuoro(),"0");
     }
     @Test
     public void laskeeVuorot2(){
         String[] pelilauta = new String[0];
         Logiikka logiikka = new Logiikka(pelilauta);
         logiikka.teeSiirto(2);
         logiikka.teeSiirto(0);
         logiikka.teeSiirto(1);
         logiikka.teeSiirto(4);
         logiikka.teeSiirto(5);
         logiikka.teeSiirto(6);
         assertEquals(logiikka.getVuoro(),"X");
     }
     @Test
     public void uusiPeliNollaaVuoron(){
        String[] pelilauta = new String[0];
        Logiikka logiikka = new Logiikka(pelilauta);
        logiikka.teeSiirto(2);
        logiikka.teeSiirto(0);
        logiikka.teeSiirto(1);
        logiikka.uusiPeli();
        assertEquals(logiikka.getVuoro(),"X");
     }
     @Test
     public void useammatSiirrotToimii(){
         String[] pelilauta = new String[0];
         Logiikka logiikka = new Logiikka(pelilauta);
         logiikka.teeSiirto(1);
         logiikka.teeSiirto(4);
         logiikka.teeSiirto(6);
         assertEquals(logiikka.getMerkkiRuudussa(6),"X");
         assertEquals(logiikka.getMerkkiRuudussa(4),"0");
         assertEquals(logiikka.getMerkkiRuudussa(1),"X");
     }
     
     @Test
     public void tunnistaaTasapelin(){
        String[] pelilauta = new String[0];
        Logiikka logiikka = new Logiikka(pelilauta);
        logiikka.uusiPeli();
        logiikka.teeSiirto(4);
        logiikka.teeSiirto(0);
        logiikka.teeSiirto(1);
        logiikka.teeSiirto(7);
        logiikka.teeSiirto(6);
        logiikka.teeSiirto(2);
        logiikka.teeSiirto(5);
        logiikka.teeSiirto(3);
        logiikka.teeSiirto(8);
        logiikka.voittikoJoku();
        assertEquals(logiikka.getVoittaja(),"tasapeli");
     }
     
    @Test
     public void tunnistaaVoittajanX(){
        String[] pelilauta = new String[0];
        Logiikka logiikka = new Logiikka(pelilauta);
        logiikka.uusiPeli();
        logiikka.teeSiirto(4);
        logiikka.teeSiirto(0);
        logiikka.teeSiirto(1);
        logiikka.teeSiirto(7);
        logiikka.teeSiirto(6);
        logiikka.teeSiirto(2);
        logiikka.teeSiirto(5);
        logiikka.teeSiirto(8);
        logiikka.teeSiirto(3);
        logiikka.voittikoJoku();
        assertEquals(logiikka.getVoittaja(),"X");
     }
     @Test
     public void tunnistaaVoittajan0(){
        String[] pelilauta = new String[0];
        Logiikka logiikka = new Logiikka(pelilauta);
        logiikka.uusiPeli();
        logiikka.teeSiirto(4);
        logiikka.teeSiirto(0);
        logiikka.teeSiirto(3);
        logiikka.teeSiirto(5);
        logiikka.teeSiirto(6);
        logiikka.teeSiirto(2);
        logiikka.teeSiirto(8);
        logiikka.teeSiirto(1);
        logiikka.voittikoJoku();
        assertEquals(logiikka.getVoittaja(),"0");  
     }
     
     @Test
     public void laskeeVoitot(){
        String[] pelilauta = new String[0];
        Logiikka logiikka = new Logiikka(pelilauta);
        logiikka.uusiPeli();
        logiikka.teeSiirto(4);
        logiikka.teeSiirto(0);
        logiikka.teeSiirto(1);
        logiikka.teeSiirto(7);
        logiikka.teeSiirto(6);
        logiikka.teeSiirto(2);
        logiikka.teeSiirto(5);
        logiikka.teeSiirto(8);
        logiikka.teeSiirto(3);
        logiikka.loppumisenTarkistus();
        
        logiikka.uusiPeli();
        logiikka.teeSiirto(0);
        logiikka.teeSiirto(4);
        logiikka.teeSiirto(1);
        logiikka.teeSiirto(5);        
        logiikka.teeSiirto(2);
        logiikka.loppumisenTarkistus();
        
        logiikka.uusiPeli();
        logiikka.teeSiirto(0);
        logiikka.teeSiirto(4);
        logiikka.teeSiirto(1);
        logiikka.teeSiirto(5);        
        logiikka.teeSiirto(2);
        logiikka.loppumisenTarkistus();
        
        assertEquals(logiikka.getVoitotRisti(),3);
     
     }
     
     @Test
     public void osaaKatsoaOnkoLoppu1(){
        String[] pelilauta = new String[0];
        Logiikka logiikka = new Logiikka(pelilauta);
        logiikka.uusiPeli();
        logiikka.teeSiirto(4);
        logiikka.teeSiirto(0);
        logiikka.teeSiirto(1);
        logiikka.teeSiirto(7);
        logiikka.teeSiirto(6);
        logiikka.teeSiirto(2);
        logiikka.teeSiirto(5);
        logiikka.teeSiirto(8);
        logiikka.teeSiirto(3);
        logiikka.loppumisenTarkistus();
        
        assertEquals(logiikka.onkoLoppu(),true);
     }
     
     public void osaaKatsoaOnkoLoppu2(){
         String[] pelilauta = new String[0];
        Logiikka logiikka = new Logiikka(pelilauta);
        logiikka.uusiPeli();
        logiikka.teeSiirto(4);
        logiikka.teeSiirto(0);
        logiikka.teeSiirto(1);
        logiikka.loppumisenTarkistus();
        
        assertEquals(logiikka.onkoLoppu(),false);
     }
     
     
}
