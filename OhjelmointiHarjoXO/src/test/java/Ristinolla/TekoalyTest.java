/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ristinolla;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rivorivo
 */
public class TekoalyTest {
    public String[] pelilauta;
    public Logiikka peli;
    public Tekoaly tekis;
    public int[][] vaakarivit = {{0,1,2},{3,4,5},{6,7,8}};
    
    public TekoalyTest() {
        pelilauta = new String[8];
        peli = new Logiikka(pelilauta);
        tekis = new Tekoaly(peli);     
        
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
    public void palauttaaRandom(){
        
               
    }
    @Test
    public void tunnistaaTyhjan(){
     assertEquals("",tekis.palauta(0));
    }
    
    @Test  
    public void satunnainenToimii(){
        
        int arvo=tekis.satunnainen();
        boolean onko=false;
        for (int i = 0; i < 9; i++) {
            if(i==arvo){
                onko=true;
            }
        }
        assertTrue(onko);            
    }
    
    @Test
    public void lukeeMerkit(){
        peli.teeSiirto(2);
        assertEquals(tekis.palauta(2),"X");
    }
    
    @Test 
    public void satunnainenEiLaitaVarattuu(){
        peli.teeSiirto(0);
        assertNotSame(0,tekis.satunnainen());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    /**
     * Test of siirto method, of class Tekoaly.
     */
    public void ekaPystyRiviTayteen(){
        for (int[] is : vaakarivit) {
            peli.teeSiirto(is[0]);
        } 
    }
    public void kolmasPystyRiviTayteen(){
       for (int[] is : vaakarivit) {
            peli.teeSiirto(is[2]);
        }  
    }
    @Test
    public void osaaSuoria(){      
        ekaPystyRiviTayteen();       
        peli.teeSiirto(4);
        peli.teeSiirto(2);
        assertEquals(tekis.siirto(),5);       
        peli.uusiPeli();
        ekaPystyRiviTayteen();  
        peli.teeSiirto(2);
        peli.teeSiirto(7);
        assertEquals(tekis.siirto(),8);
        peli.uusiPeli();
        ekaPystyRiviTayteen();
        peli.teeSiirto(7);
        peli.teeSiirto(1);
        assertEquals(tekis.siirto(),2);
    }
  
    @Test
    public void osaaSuoria2(){
        kolmasPystyRiviTayteen();
        peli.teeSiirto(4);
        peli.teeSiirto(1);
        assertEquals(tekis.siirto(),3);
        peli.uusiPeli();
        kolmasPystyRiviTayteen();
        peli.teeSiirto(1);
        peli.teeSiirto(7);
        assertEquals(tekis.siirto(),6);
        peli.uusiPeli();
        kolmasPystyRiviTayteen();
        peli.teeSiirto(7);
        peli.teeSiirto(1);
        assertEquals(tekis.siirto(),0);
    }
    @Test
    public void blokkaa1() {
        peli.teeSiirto(0);
        peli.teeSiirto(4);
        peli.teeSiirto(1);
        assertEquals(tekis.siirto(),2);
    }
     @Test
    public void blokkaa2() {
        peli.teeSiirto(4);
        peli.teeSiirto(2);
        peli.teeSiirto(3);
        assertEquals(tekis.siirto(),5);
    }
    @Test
    public void blokkaa3() {
        peli.teeSiirto(8);
        peli.teeSiirto(3);
        peli.teeSiirto(5);
        assertEquals(tekis.siirto(),2);
    }
    @Test
    public void blokkaa4(){
        peli.teeSiirto(0);
        peli.teeSiirto(1);
        peli.teeSiirto(3);
        assertEquals(tekis.siirto(),6);
    }
     @Test
    public void blokkaa5(){
        peli.teeSiirto(0);
        peli.teeSiirto(1);
        peli.teeSiirto(4);
        assertEquals(tekis.siirto(),8);
    }
     @Test
    public void blokkaa6(){
        peli.teeSiirto(1);
        peli.teeSiirto(0);
        peli.teeSiirto(4);
        assertEquals(tekis.siirto(),7);
    }
     @Test
    public void blokkaa7(){
        peli.teeSiirto(2);
        peli.teeSiirto(1);
        peli.teeSiirto(4);
        assertEquals(tekis.siirto(),6);
    }
     @Test
    public void blokkaa8(){
        peli.teeSiirto(2);
        peli.teeSiirto(4);
        peli.teeSiirto(5);
        assertEquals(tekis.siirto(),8);
    }
     @Test
    public void blokkaa9(){
        peli.teeSiirto(0);
        peli.teeSiirto(4);
        peli.teeSiirto(2);
        assertEquals(tekis.siirto(),1);
    }
     @Test
    public void blokkaa10(){
        peli.teeSiirto(8);
        peli.teeSiirto(4);
        peli.teeSiirto(6);
        assertEquals(tekis.siirto(),7);
    }
     @Test
    public void blokkaa11(){
        peli.teeSiirto(0);
        peli.teeSiirto(4);
        peli.teeSiirto(6);
        assertEquals(tekis.siirto(),3);
    }
     @Test
    public void blokkaa12(){
        peli.teeSiirto(0);
        peli.teeSiirto(3);
        peli.teeSiirto(8);
        assertEquals(tekis.siirto(),4);
    }
     @Test
    public void blokkaa13(){
        peli.teeSiirto(1);
        peli.teeSiirto(3);
        peli.teeSiirto(7);
        assertEquals(tekis.siirto(),4);
    }
     @Test
    public void blokkaa14(){
        peli.teeSiirto(2);
        peli.teeSiirto(3);
        peli.teeSiirto(6);
        assertEquals(tekis.siirto(),4);
    }
     @Test
    public void blokkaa15(){
        peli.teeSiirto(2);
        peli.teeSiirto(4);
        peli.teeSiirto(8);
        assertEquals(tekis.siirto(),5);
    }
     @Test
    public void blokkaa16(){
        peli.teeSiirto(3);
        peli.teeSiirto(8);
        peli.teeSiirto(5);
        assertEquals(tekis.siirto(),4);
    }
     @Test
    public void blokkaa17(){
        peli.teeSiirto(3);
        peli.teeSiirto(4);
        peli.teeSiirto(6);
        assertEquals(tekis.siirto(),0);
    }
     @Test
    public void blokkaa18(){
        peli.teeSiirto(4);
        peli.teeSiirto(3);
        peli.teeSiirto(8);
        assertEquals(tekis.siirto(),0);
    }
     @Test
    public void blokkaa19(){
        peli.teeSiirto(4);
        peli.teeSiirto(0);
        peli.teeSiirto(7);
        assertEquals(tekis.siirto(),1);
    }
     @Test
    public void blokkaa20(){
        peli.teeSiirto(4);
        peli.teeSiirto(2);
        peli.teeSiirto(5);
        assertEquals(tekis.siirto(),3);
    }
     @Test
    public void blokkaa21(){
        peli.teeSiirto(4);
        peli.teeSiirto(3);
        peli.teeSiirto(6);
        assertEquals(tekis.siirto(),2);
    }
     @Test
    public void laittaaTyhjaan4(){
        peli.teeSiirto(2);        
        assertEquals(tekis.siirto(),4);
    }
    
    @Test
    public void hyokkaa1(){
        peli.teeSiirto(0);
        peli.teeSiirto(1);
        peli.teeSiirto(2);
        peli.teeSiirto(4);
        peli.teeSiirto(3);
        assertEquals(tekis.siirto(),7);
    }
      @Test
    public void hyokkaa2(){
        peli.teeSiirto(4);
        peli.teeSiirto(0);
        peli.teeSiirto(8);
        peli.teeSiirto(2);
        peli.teeSiirto(5);
        assertEquals(tekis.siirto(),1);
    }
      @Test
    public void hyokkaa3(){
        peli.teeSiirto(0);
        peli.teeSiirto(4);
        peli.teeSiirto(8);
        peli.teeSiirto(2);
        peli.teeSiirto(5);
        assertEquals(tekis.siirto(),6);
    }
     @Test
    public void hyokkaa4(){
        peli.teeSiirto(4);
        peli.teeSiirto(0);
        peli.teeSiirto(8);
        peli.teeSiirto(1);
        peli.teeSiirto(5);
        assertEquals(tekis.siirto(),2);
    }
     @Test
    public void hyokkaa5(){
        peli.teeSiirto(4);
        peli.teeSiirto(0);
        peli.teeSiirto(8);
        peli.teeSiirto(3);
        peli.teeSiirto(5);
        assertEquals(tekis.siirto(),6);
    }
      @Test
    public void hyokkaa6(){
        peli.teeSiirto(1);
        peli.teeSiirto(0);
        peli.teeSiirto(5);
        peli.teeSiirto(4);
        peli.teeSiirto(6);
        assertEquals(tekis.siirto(),8);
    }
      @Test
    public void hyokkaa7(){
        peli.teeSiirto(1);
        peli.teeSiirto(2);
        peli.teeSiirto(8);
        peli.teeSiirto(4);
        peli.teeSiirto(5);
        assertEquals(tekis.siirto(),6);
    }
      @Test
    public void hyokkaa8(){
        peli.teeSiirto(1);
        peli.teeSiirto(2);
        peli.teeSiirto(0);
        peli.teeSiirto(5);
        peli.teeSiirto(3);
        assertEquals(tekis.siirto(),8);
    }
      @Test
    public void hyokkaa9(){
        peli.teeSiirto(4);
        peli.teeSiirto(6);
        peli.teeSiirto(2);
        peli.teeSiirto(7);
        peli.teeSiirto(5);
        assertEquals(tekis.siirto(),8);
    }
      @Test
    public void hyokkaa10(){
        peli.teeSiirto(4);
        peli.teeSiirto(8);
        peli.teeSiirto(2);
        peli.teeSiirto(7);
        peli.teeSiirto(5);
        assertEquals(tekis.siirto(),6);
    }
   
      @Test
    public void hyokkaa11(){
        peli.teeSiirto(4);
        peli.teeSiirto(8);
        peli.teeSiirto(2);
        peli.teeSiirto(6);
        peli.teeSiirto(5);
        assertEquals(tekis.siirto(),7);
    }
      @Test
    public void hyokkaa12(){
        peli.teeSiirto(4);
        peli.teeSiirto(0);
        peli.teeSiirto(2);
        peli.teeSiirto(6);
        peli.teeSiirto(5);
        assertEquals(tekis.siirto(),3);
    }

    @Test
    public void hyokkaa13(){
        peli.teeSiirto(1);
        peli.teeSiirto(0);
        peli.teeSiirto(7);
        peli.teeSiirto(8);
        peli.teeSiirto(5);
        assertEquals(tekis.siirto(),4);
    }
     @Test
    public void hyokkaa14(){
        peli.teeSiirto(0);
        peli.teeSiirto(1);
        peli.teeSiirto(6);
        peli.teeSiirto(7);
        peli.teeSiirto(5);
        assertEquals(tekis.siirto(),4);
    }
     @Test
    public void hyokkaa15(){
        peli.teeSiirto(1);
        peli.teeSiirto(2);
        peli.teeSiirto(7);
        peli.teeSiirto(6);
        peli.teeSiirto(5);
        assertEquals(tekis.siirto(),4);
    }
     @Test
    public void hyokkaa16(){
        peli.teeSiirto(1);
        peli.teeSiirto(2);
        peli.teeSiirto(7);
        peli.teeSiirto(8);
        peli.teeSiirto(3);
        assertEquals(tekis.siirto(),5);
    }
    
    @Test
    public void hyokkaa17(){
        peli.teeSiirto(1);
        peli.teeSiirto(3);
        peli.teeSiirto(7);
        peli.teeSiirto(5);
        peli.teeSiirto(8);
        assertEquals(tekis.siirto(),4); 
    }
     @Test
    public void hyokkaa18(){
        peli.teeSiirto(5);
        peli.teeSiirto(1);
        peli.teeSiirto(7);
        peli.teeSiirto(2);
        peli.teeSiirto(8);
        assertEquals(tekis.siirto(),0); 
    }
     @Test
    public void hyokkaa19(){
        peli.teeSiirto(1);
        peli.teeSiirto(3);
        peli.teeSiirto(7);
        peli.teeSiirto(6);
        peli.teeSiirto(8);
        assertEquals(tekis.siirto(),0); 
    }
     @Test
    public void hyokkaa20(){
        peli.teeSiirto(2);
        peli.teeSiirto(4);
        peli.teeSiirto(6);
        peli.teeSiirto(7);
        peli.teeSiirto(8);
        assertEquals(tekis.siirto(),1); 
    }
     @Test
    public void hyokkaa21(){
        peli.teeSiirto(1);
        peli.teeSiirto(8);
        peli.teeSiirto(7);
        peli.teeSiirto(5);
        peli.teeSiirto(6);
        assertEquals(tekis.siirto(),2); 
    }
     @Test
    public void hyokkaa22(){
        peli.teeSiirto(1);
        peli.teeSiirto(4);
        peli.teeSiirto(7);
        peli.teeSiirto(6);
        peli.teeSiirto(8);
        assertEquals(tekis.siirto(),2); 
    }
}
