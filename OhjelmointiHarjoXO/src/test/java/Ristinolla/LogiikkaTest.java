
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

    public String[] pelilauta;
    public Logiikka logiikka;

    public LogiikkaTest() {
        pelilauta = new String[0];
        logiikka = new Logiikka(pelilauta);
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
    public void hello() {
    }

    @Test
    public void siirtoJaTarkistusToimii() {

        logiikka.teeSiirto(2);
        assertEquals(logiikka.getMerkkiRuudussa(2), "X");
    }

    @Test
    public void laskeeVuorot1() {

        logiikka.teeSiirto(2);
        logiikka.teeSiirto(0);
        logiikka.teeSiirto(1);
        assertEquals(logiikka.getVuoro(), "0");
    }

    @Test
    public void laskeeVuorot2() {

        logiikka.teeSiirto(2);
        logiikka.teeSiirto(0);
        logiikka.teeSiirto(1);
        logiikka.teeSiirto(4);
        logiikka.teeSiirto(5);
        logiikka.teeSiirto(6);
        assertEquals(logiikka.getVuoro(), "X");
    }

    @Test
    public void uusiPeliNollaaVuoron() {

        logiikka.teeSiirto(2);
        logiikka.teeSiirto(0);
        logiikka.teeSiirto(1);
        logiikka.uusiPeli();
        assertEquals(logiikka.getVuoro(), "X");
    }

    @Test
    public void useammatSiirrotToimii() {

        logiikka.teeSiirto(1);
        logiikka.teeSiirto(4);
        logiikka.teeSiirto(6);
        assertEquals(logiikka.getMerkkiRuudussa(6), "X");
        assertEquals(logiikka.getMerkkiRuudussa(4), "0");
        assertEquals(logiikka.getMerkkiRuudussa(1), "X");
    }

    @Test
    public void tunnistaaTasapelin() {

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
        assertEquals(logiikka.getVoittaja(), "tasapeli");
    }

    @Test
    public void tunnistaaVoittajanX() {

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
        assertEquals(logiikka.getVoittaja(), "X");
    }

    @Test
    public void tunnistaaPystyVoiton() {
        logiikka.uusiPeli();
        logiikka.teeSiirto(4);
        logiikka.teeSiirto(0);
        logiikka.teeSiirto(1);
        logiikka.teeSiirto(3);
        logiikka.teeSiirto(7);
        logiikka.voittikoJoku();
        assertEquals(logiikka.getVoittaja(), "X");
    }

    @Test
    public void tunnistaaVinoVoiton() {
        logiikka.uusiPeli();
        logiikka.teeSiirto(4);
        logiikka.teeSiirto(5);
        logiikka.teeSiirto(8);
        logiikka.teeSiirto(2);
        logiikka.teeSiirto(0);
        logiikka.voittikoJoku();
        assertEquals(logiikka.getVoittaja(), "X");
        logiikka.uusiPeli();
        logiikka.teeSiirto(4);
        logiikka.teeSiirto(5);
        logiikka.teeSiirto(6);
        logiikka.teeSiirto(3);
        logiikka.teeSiirto(2);
        logiikka.voittikoJoku();
        assertEquals(logiikka.getVoittaja(), "X");
    }

    @Test
    public void tunnistaaVoittajan0() {

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
        assertEquals(logiikka.getVoittaja(), "0");
    }

    @Test
    public void laskeeVoitot() {

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

        logiikka.uusiPeli();
        logiikka.teeSiirto(1);
        logiikka.teeSiirto(4);
        logiikka.teeSiirto(7);
        logiikka.teeSiirto(5);
        logiikka.teeSiirto(6);
        logiikka.teeSiirto(3);
        logiikka.loppumisenTarkistus();

        logiikka.uusiPeli();
        logiikka.teeSiirto(4);
        logiikka.teeSiirto(0);
        logiikka.teeSiirto(7);
        logiikka.teeSiirto(1);
        logiikka.teeSiirto(5);
        logiikka.teeSiirto(2);
        logiikka.loppumisenTarkistus();

        logiikka.uusiPeli();
        logiikka.teeSiirto(0);
        logiikka.teeSiirto(4);
        logiikka.teeSiirto(6);
        logiikka.teeSiirto(3);
        logiikka.teeSiirto(5);
        logiikka.teeSiirto(7);
        logiikka.teeSiirto(1);
        logiikka.teeSiirto(2);
        logiikka.teeSiirto(8);
        logiikka.loppumisenTarkistus();

        assertEquals(logiikka.getVoitotRisti(), 3);
        assertEquals(logiikka.getVoitotNolla(), 2);
        assertEquals(logiikka.getTasapelit(), 1);
    }

    @Test
    public void osaaKatsoaOnkoLoppu1() {

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

        assertEquals(logiikka.onkoLoppu(), true);
    }

    public void osaaKatsoaOnkoLoppu2() {

        logiikka.uusiPeli();
        logiikka.teeSiirto(4);
        logiikka.teeSiirto(0);
        logiikka.teeSiirto(1);
        logiikka.loppumisenTarkistus();

        assertEquals(logiikka.onkoLoppu(), false);
    }

}
